package io.datajek.spring.basics.movierecommendersystem.lesson7;
import org.springframework.stereotype.Component;

@Component("CBF")
//OR
//@Component
//@Qualifier("CBF")
public class ContentBasedFilter implements Filter {
    public String[] getRecommendations(String movie) {
        //logic of content based filter
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
