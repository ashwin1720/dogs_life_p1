package com.example.Ql1.Repository;
import com.example.Ql1.model.hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroRepository extends JpaRepository<hero,Integer> {

        @Query(nativeQuery = true, value= "select * from heroes where name like :letter")
        List<hero> findHeroesWithNameStartingWithLetter(String letter);

}
