package booking.ticket.controller;

import booking.ticket.domain.Movie;
import booking.ticket.service.MovieService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController extends GenericEventController<Movie>{
    public MovieController(MovieService movieService) {
        super(movieService);
    }
}
