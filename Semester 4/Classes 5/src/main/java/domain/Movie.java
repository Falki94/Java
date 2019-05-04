package domain;

/**
 *
 * @author Falki
 */
import java.util.List;

public class Movie {

    private int id;
    private String film;
    private List<Actor> actors;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }


    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }
}
