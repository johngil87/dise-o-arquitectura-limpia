package mapper;

import format.MovieFormat;
import model.Movie;

public class MovieMapper {

    public MovieFormat movieToFormat(Movie movie){
        var format = new MovieFormat();
        format.setId(movie.getId());
        format.setNombre(movie.getNombre());
        format.setDuracion(movie.getDuracion());
        format.setCategoria(movie.getCategoria());
        return format;
    }

    public Movie formatToMovie(MovieFormat format){
        var movie = new Movie();
        movie.setId(format.getId());
        movie.setNombre(format.getNombre());
        movie.setDuracion(format.getDuracion());
        movie.setCategoria(format.getCategoria());
        return movie;
    }

}
