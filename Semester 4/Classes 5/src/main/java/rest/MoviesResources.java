package rest;

import domain.Actor;
import domain.Movie;
import javax.ws.rs.Path;
import domain.services.MovieService;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/movies")
public class MoviesResources {

    private MovieService db = new MovieService();

    /**
     * @api {get} /filmweb/rest/movies Get all movies
     * @apiName getAll
     *
     * @apiSampleRequest http://localhost:8080/filmweb/rest/movies
     *
     * @apiSuccess List<Movie>
     * @apiSuccessExample Success-Response: HTTP/1.1 200 OK 
     * [ 
     * {
     * "film": "Game Of Throne",
     * "id": 1 
     * }, 
     *{
     * "film": "Lucifer",
     * "id": 2
     * }
     * ]
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getAll() {
        return db.getAll();
    }
     /**
     * @api {POST} /filmweb/rest/movies Post all movies
     * @apiName Add
     *
     * @apiParam {Movie} movie 
     *
     * @apiParamExample {json} Request-Example:
     * {
	"film":"Game Of Throne"
     * }
     * @apiSuccessExample {json} Success-Response: HTTP/1.1 200 OK
     * movieId
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response Add(Movie movie) {
        db.add(movie);
        return Response.ok(movie.getId()).build();
    }

     /**
     * @api {get} /filmweb/rest/movies/{id} Get all movies
     * @apiName get
     *
     * @apiSampleRequest http://localhost:8080/filmweb/rest/movies/1
     *
     * @apiSuccess Response
     * @apiSuccessExample Success-Response: HTTP/1.1 200 OK 
     * {
     * "film": "Game Of Throne",
     * "id": 1 
     * } 
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response get(@PathParam("id") int id) {
        Movie result = db.get(id);
        if (result == null) {
            return Response.status(404).build();
        }
        return Response.ok(result).build();
    }
    
    /**
     * @api {put} /filmweb/rest/movies/{id} Put a movie
     * @apiName update
     *
     * @apiDescription Update a movie with a specified id
     * @apiParam {int} id
     * @apiParam {Movie} m
     * 
     * @apiSuccessExample {json} Success-Response
     * HTTP/1.1 200 OK 
     * {
     * "film": "Game Of Zone"
     * } 
     */
    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response update(@PathParam("id") int id, Movie m) {
        Movie result = db.get(id);
        if (result == null) {
            return Response.status(404).build();
        }
        m.setId(id);
        db.update(m);
        return Response.ok().build();
    }

    /**
     * @api {get} /filmweb/rest/movies/delete/{id} Delete a movie
     * @apiName delete
     *
     * @apiDescription Delete a movie with a specified id
     * @apiParam {int} id
     * 
     * @apiSampleRequest http://localhost:8080/filmweb/rest/movies/delete/1
     * @apiSuccessExample {json} Success-Response
     * HTTP/1.1 200 OK 
     * 
     */
    @GET
    @Path("/delete/{id}")
    public Response delete(@PathParam("id") int id) {
        Movie result = db.get(id);
        if (result == null) {
            return Response.status(404).build();
        }
        db.delete(result);
        return Response.ok().build();
    }
    
     /**
     * @api {get} /filmweb/rest/movies/{movieId}/actors Get actors of specified movie
     * @apiName getActor
     *
     * @apiSampleRequest http://localhost:8080/filmweb/rest/movies/1/actors
     *
     * @apiSuccess List<Actor>
     * @apiSuccessExample Success-Response: HTTP/1.1 200 OK  
     * 
     * [
     * {
     * "id": 1,
     * "name": "Maciej",
     * "surname": "Falkiewicz"
     * },
     * {
     * "id": 2,
     * "name": "Marcin",
     * "surname": "Falkiewicz"
     * }
     * ]
     */
    @GET
    @Path("/{movieId}/actors")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Actor> getActor(@PathParam("movieId") int movieId) {
        Movie result = db.get(movieId);
        if (result == null) {
            return null;
        }
        if (result.getActors() == null) {
            result.setActors(new ArrayList<Actor>());
        }
        return result.getActors();
    }
    
    /**
     * @api {post} /filmweb/rest/movies/{id}/actors Post actor to specified movie
     * @apiName addActor
     *
     * @apiParam {int} movieId
     * @apiParam {Actor} actor
     *
     * @apiParamExample {json} Request-Example:
     * {
     * "id":1,
     * "name":"Maciej",
     * "surname": "Falkiewicz"
     * }
     * 
     * @apiSuccessExample {json} Success-Response: HTTP/1.1 200 OK
     * 
     */
    @POST
    @Path("/{id}/actors")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addActor(@PathParam("id") int movieId, Actor actor) {
        Movie result = db.get(movieId);
        if (result == null) {
            return Response.status(404).build();
        }
        if (result.getActors() == null) {
            result.setActors(new ArrayList<Actor>());
        }
        result.getActors().add(actor);
        return Response.ok().build();
    }
    
     /**
     * @api {get} /filmweb/rest/movies/Maciej/Falkiewicz Get movies of specified actor
     * @apiName getMoviesByActor
     *
     * @apiSampleRequest http://localhost:8080/filmweb/rest/movies/Maciej/Falkiewicz
     *
     * @apiSuccess List<Movie>
     * @apiSuccessExample Success-Response: HTTP/1.1 200 OK  
     * 
     * [
     * {
     * "id": 1,
     * "name": "Maciej",
     * "surname": "Falkiewicz"
     * },
     * {
     * "id": 2,
     * "name": "Marcin",
     * "surname": "Falkiewicz"
     * }
     * ]
     */
    @GET
    @Path("/{name}/{surname}")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Movie> getMoviesByActor(@PathParam("name") String name, @PathParam("surname") String surname) {
        return db.getMoviesByActor(name, surname);
    }
}
