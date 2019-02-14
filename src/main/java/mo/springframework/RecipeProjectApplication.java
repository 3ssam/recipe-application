package mo.springframework;

import mo.springframework.bootstrap.RecipeBootstrap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecipeProjectApplication {

    public static void main(String[] args) {
        //SpringApplication.run(RecipeBootstrap.class, args);
        SpringApplication.run(RecipeProjectApplication.class, args);
    }

}

