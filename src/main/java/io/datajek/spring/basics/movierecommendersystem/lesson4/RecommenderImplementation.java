package io.datajek.spring.basics.movierecommendersystem.lesson4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
