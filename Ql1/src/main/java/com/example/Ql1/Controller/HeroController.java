package com.example.Ql1.Controller;

import com.example.Ql1.Service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.Ql1.model.hero;

import java.util.List;

@RestController
public class HeroController {
    @Autowired
    HeroService heroService;
    @GetMapping("/heroes")
    public List<hero> getALlHeroes(){
        return heroService.getAllHeroes();

    }
    @GetMapping("/heroes/{letter}")
    public List<hero> getHeroesStartingWithLetter(@PathVariable String letter){
        return heroService.getHeroesStartingWithLetter(letter);

    }
    @PostMapping("/heroes")
    public HttpStatus saveNewHero(hero Hero){
        hero result= heroService.saveHero(Hero);
        if (result == null){
            return HttpStatus.PRECONDITION_FAILED;
        }else{
            return HttpStatus.CREATED;
        }
    }
}
