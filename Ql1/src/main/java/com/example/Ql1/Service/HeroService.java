package com.example.Ql1.Service;

import com.example.Ql1.Repository.HeroRepository;
import com.example.Ql1.model.hero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HeroService {
    @Autowired
    private HeroRepository heroRepository;

    public List<hero> getHeroesStartingWithLetter(String letter){
        String letterParam = letter + "%";
        List<hero> Heroes = heroRepository.findHeroesWithNameStartingWithLetter(letterParam);
        return Heroes;


    }
    public List<hero> getAllHeroes(){
        return heroRepository.findAll();
    }
    public hero saveHero(hero Hero){
        return heroRepository.save(Hero);


    }
}
