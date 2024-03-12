package io.datajek.spring.basics.movierecommendersystem.lesson3;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

@Component
public class RecommenderImplementation {
    //use filter interface to select filter
    @Autowired
    private Filter filter;

    //use a filter to find recommendations
    public String [] recommendMovies (String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");

        String[] results = filter.getRecommendations("Finding Dory");

        return results;
    }
}
