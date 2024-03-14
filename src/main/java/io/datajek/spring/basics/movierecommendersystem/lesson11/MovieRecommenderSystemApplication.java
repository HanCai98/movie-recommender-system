package io.datajek.spring.basics.movierecommendersystem.lesson11;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MovieRecommenderSystemApplication {
    public static void main(String[] args) {
        ApplicationContext appContext = SpringApplication.run(
                MovieRecommenderSystemApplication.class, args);

        //use ApplicationContext to get recommender object
        RecommenderImplementation recommender = appContext.getBean(
                RecommenderImplementation.class);

        System.out.println(recommender);

    }
}
