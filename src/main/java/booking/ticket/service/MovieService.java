package booking.ticket.service;

import booking.ticket.domain.Movie;
import booking.ticket.repository.MovieRepository;
import org.springframework.stereotype.Service;

@Service
public class MovieService extends GenericEventService<Movie> {
    public MovieService(MovieRepository movieRepository) {
        super(movieRepository);
    }
}
