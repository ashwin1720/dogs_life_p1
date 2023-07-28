package com.example.Ql1;

import com.example.Ql1.QL2.Calculator;
import com.example.Ql1.Service.HeroService;
import com.example.Ql1.model.hero;
import com.example.Ql1.Repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Ql1Application{
	@Autowired
	HeroService heroService;
	public static void main(String[] args) {

		SpringApplication.run(Ql1Application.class, args);

	}


}
