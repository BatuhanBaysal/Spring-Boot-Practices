package com.batuhan.movies;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
public class MoviesController {
    
    @GetMapping("/movies")
    public ModelAndView getMovie() {
        Map<String, Movies> model = new HashMap<String, Movies>();
        model.put("first", new Movies("The Shawshank Redemption", "1994", 9.3));
        model.put("second", new Movies("The Godfather", "1972", 9.2));
        model.put("third", new Movies("The Dark Knight", "2008", 9.0));
        model.put("fourth", new Movies("The Godfather Part II", "1974", 9.0));
        model.put("fifth", new Movies("12 Angry Men", "1957", 9.0));
        return new ModelAndView("movies", model);
    }
}