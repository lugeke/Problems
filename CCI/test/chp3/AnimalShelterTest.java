package chp3;

import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.Assert.*;

public class AnimalShelterTest {


    @Test
    public void testDequeAny() {
        AnimalShelter shelter = new AnimalShelter();

        for (int i = 0; i < 10; i++) {
            if (ThreadLocalRandom.current().nextBoolean())
                shelter.enqueue(new Dog(i));
            else
                shelter.enqueue(new Cat(i));
        }

        for (int i = 0; i < 10; i++)
            assertEquals(i, shelter.dequeueAny().id);

    }

    @Test
    public void testDequeDog() {
        AnimalShelter shelter = new AnimalShelter();

        for (int i = 0; i < 10; i++) {
            if (ThreadLocalRandom.current().nextBoolean())
                shelter.enqueue(new Cat(i));

            shelter.enqueue(new Dog(i));
        }

        for (int i = 0; i < 10; i++)
            assertEquals(i, shelter.dequeueDog().id);

    }


    @Test
    public void testDequeCat() {
        AnimalShelter shelter = new AnimalShelter();

        for (int i = 0; i < 10; i++) {
            if (ThreadLocalRandom.current().nextBoolean())
                shelter.enqueue(new Dog(i));

            shelter.enqueue(new Cat(i));
        }

        for (int i = 0; i < 10; i++)
            assertEquals(i, shelter.dequeueCat().id);

    }


}