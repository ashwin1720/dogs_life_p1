package com.db.grad.javaapi.repository;

import com.db.grad.javaapi.model.Dog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DogsRepository extends JpaRepository<Dog, Long> {

    @Query(nativeQuery = true, value = "select * from Dogs where name like = :name")
    List<Dog> findByName(Dog name);
//
//    long save(Dog theDog );
//    Dog  findById( long id );
//    List<Dog> findByName(Dog theDog );
//    boolean delete( Dog theDog );
//    long count();
//    boolean existsById( long id );
//
//    // Additional admin functionality
//    void    deleteAll();
//
//    List<Dog> findAll();
}
