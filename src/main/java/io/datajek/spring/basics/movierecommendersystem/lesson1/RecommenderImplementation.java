package io.datajek.spring.basics.movierecommendersystem.lesson1;

public class RecommenderImplementation {
    public String[] recommendMovies (String movie) {
        //use content based filter to find similar movies
        ContentBasedFilter filter = new ContentBasedFilter();
        //return the results
        return filter.getRecommendations(movie);
    }
}
