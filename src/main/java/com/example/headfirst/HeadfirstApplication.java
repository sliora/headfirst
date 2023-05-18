package com.example.headfirst;

import com.example.headfirst.composite.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class HeadfirstApplication {

    public static void main(String[] args){
        SpringApplication.run(HeadfirstApplication.class, args);

        MovieComponent netflixMovie = new Platform("더글로리", "모름");
        MovieComponent disneyPlusMovie = new Platform("가오갤3", "모름");
        MovieComponent amazonPrime = new Platform("아마존", "모름");
        MovieComponent tving = new Platform("장사천재백사장", "모름");

        MovieComponent allMovies = new Platform("전체 영화", "전체 영화");

        allMovies.add(netflixMovie);
        allMovies.add(disneyPlusMovie);
        allMovies.add(amazonPrime);
        allMovies.add(tving);

        disneyPlusMovie.add(new Platform("겨울왕국", "디즈니"));
        disneyPlusMovie.add(tving);


        StreamingService streamingService = new StreamingService(allMovies);
        streamingService.printMovie();
    }
}
