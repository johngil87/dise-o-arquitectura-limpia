package service;

import format.MovieFormat;
import mapper.MovieMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RepositoryMovie;

@Service
public class MovieService {

    @Autowired
    private RepositoryMovie repositoryMovie;
    @Autowired
    private MovieMapper movieMapper;


    public MovieFormat saveMovie(MovieFormat movieFormat){
        var movie = repositoryMovie.save(movieMapper.formatToMovie(movieFormat));
        return movieMapper.movieToFormat(movie);
    }
}
