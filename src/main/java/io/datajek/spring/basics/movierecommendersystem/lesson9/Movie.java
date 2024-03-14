package io.datajek.spring.basics.movierecommendersystem.lesson9;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Movie {
    //for keeping track of instances created
    private static int instances = 0;

    private int id;
    private String name;
    private String genre;
    private String producer;

    public Movie() {
        instances++;
        System.out.println("Movie constructor called");
    }

    public static int getInstances() {
        return Movie.instances;
    }
}
