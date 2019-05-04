package domain.services;

import domain.Actor;
import domain.Movie;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author Falki
 */
public class MovieService {

    private static List<Movie> db = new ArrayList<Movie>();
    private static int currentId = 1;

    /**
     * Zwraca liste wszystkich filmow
     */
    public List<Movie> getAll() {
        return db;
    }
    /**
     * 
     * @param name
     * @param surname
     * @return Lista zwraca filmy, w ktorych bral udzial dany aktor (name,surname)
     */
    public List<Movie> getMoviesByActor(String name, String surname) {
        List<Movie> listMovies = new ArrayList<>();
        for (Movie m : db) {
            for (Actor a : m.getActors()) {
                if (a.getName().equals(name) && a.getSurname().equals(surname)) {
                    listMovies.add(m);
                }
            }
        }
        return listMovies;
    }
    /**
     * Sprawdza czy film o danym id istnieje, jezeli tak to go zwraca, jezeli nie to zwraca wartosc "null"
     * @param id - movieId
     * @return {@code Movie}
     */
    public Movie get(int id) {
        for (Movie m : db) {
            if (m.getId() == id) {
                return m;
            }
        }
        return null;
    }
    /**
     * Dodaje film do kolekcji i inkrementuje id filmu
     * @param m
     */
    public void add(Movie m) {
        m.setId(currentId++);
        db.add(m);
    }
    /**
     * Aktualizuje film o wskazanym id z kolekcji db
     * @param film 
     */
    public void update(Movie film) {
        for (Movie m : db) {
            if (m.getId() == film.getId()) {
                m.setFilm(film.getFilm());
            }
        }
    }
    /**
     * 
     * @param m 
     * @return Usuwa wskazany film z kolekcji db
     */
    public void delete(Movie m) {
        db.remove(m);
    }

}
