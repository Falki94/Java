/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositories;

import domain.User;
import domain.UserType;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthorisationRepository {

    private Connection con = null;

    public AuthorisationRepository() {
        try {
            Class.forName("org.hsqldb.jdbc.JDBCDriver");
            con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/testdb", "SA", "");
        } catch (Exception e) {
            Logger.getLogger(AuthorisationRepository.class.getName()).log(Level.SEVERE, null, e);
        }
    }

    public void addUser(User user) {        
        try {
            Statement stmt = con.createStatement();
            String q = "INSERT INTO USERS VALUES(" + "'" + user.getName() + "','" + user.getPassword() + "',0,'" + user.getEmail() + "'" + ")";
            int result = stmt.executeUpdate(q);
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorisationRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setRights(String usr) {
        try {
            Statement stmt = con.createStatement();
            String q = "UPDATE USERS SET USERTYPE = 1 where login=" + "'" + usr + "'";
            int result = stmt.executeUpdate(q);
            con.commit();
        } catch (SQLException ex) {
            Logger.getLogger(AuthorisationRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public UserType checkLogin(String name, String pass) {
        UserType rights = null;
        try {
            Statement stmt = con.createStatement();
            String q = "Select usertype from USERS where login=" + "'" + name + "' and password=" + "'" + pass + "'";
            ResultSet result = stmt.executeQuery(q);
            while (result.next()) {
                rights= this.intToUserType(result.getInt("USERTYPE"));
               

            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorisationRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rights;
    }

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        try {
            Statement stmt = con.createStatement();
            String q = "Select * from USERS ";
            ResultSet result = stmt.executeQuery(q);
            while (result.next()) {
                User u = new User();
                u.setName(result.getString("LOGIN"));
                u.setEmail(result.getString("EMAIL"));
                u.setUserType(this.intToUserType(result.getInt("USERTYPE")));
                list.add(u);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AuthorisationRepository.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    private UserType intToUserType(int right){
           UserType rights = null;
           switch (right){
                    case 0 : 
                        rights = UserType.REGULAR;
                        break;
                    case 1 : 
                        rights = UserType.PREMIUM;
                        break;
                    case 2 : 
                        rights = UserType.ADMIN;
                        break;
                }
           return rights;
    }
}
