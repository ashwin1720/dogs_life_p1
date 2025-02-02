package com.db.grad.javaapi.service;

import com.db.grad.javaapi.model.Dog;
import com.db.grad.javaapi.repository.DogsRepository;
import com.db.grad.javaapi.repository.DogsRepositoryStub;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogsHandlerTest {

    private DogsRepository itsDogRepo = new DogsRepositoryStub();
    @BeforeEach
    public void makeSureRepoIsEmpty()
    {
        itsDogRepo.deleteAll();
    }
    @Test
    public void add_a_dog_return_number_of_dogs_in_repo_is_one()
    {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setName("Bruno");
        cut.addDog( theDog );

        long actualResult = cut.getNoOfDogs();
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void existsById()
    {
        DogHandler cut = new DogHandler(itsDogRepo);
        Dog theDog = new Dog();
        theDog.setId(2);
        cut.addDog( theDog );

        boolean actualResult = cut.existsById(2);
        boolean expectedResult = true ;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void updateDogDetails() {

        DogHandler cut = new DogHandler(itsDogRepo);

        Dog theDog = new Dog();
        theDog.setName("Coco");
        theDog.setId(2);
        cut.addDog( theDog );

        Dog newDog = new Dog();
        newDog.setId(2);
        newDog.setName("buddy");

        long actualResult = cut.updateDogDetails(newDog);
        assertEquals(2, actualResult);

    }

    @Test
    public void get_dog_by_name() {
        DogHandler cut = new DogHandler(itsDogRepo);

        Dog theDog = new Dog();
        theDog.setName("Coco");
        theDog.setId(2);
        cut.addDog(theDog);

        String actualresult = cut.getDogByName("coco");
        String expectedresult = "Coco";
        assertEquals("Coco", actualresult);

    }
}
