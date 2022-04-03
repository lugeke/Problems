package chp3;

import java.util.LinkedList;
import java.util.Queue;

class Animal{
    int id;

    public Animal(int id) {
        this.id = id;
    }
}

class Cat extends Animal {

    public Cat(int id) {
        super(id);
    }
}

class Dog extends Animal {

    public Dog(int id) {
        super(id);
    }
}


public class AnimalShelter {

    static class TimedAnimal {
        int time;
        Animal animal;

        public TimedAnimal(int time, Animal animal) {
            this.time = time;
            this.animal = animal;
        }
    }

    Queue<TimedAnimal> dogQ = new LinkedList<>();
    Queue<TimedAnimal> catQ = new LinkedList<>();

    int time = 1;
    void enqueue(Animal a) {
        if (a instanceof Dog) dogQ.add(new TimedAnimal(time++, a));
        else catQ.add(new TimedAnimal(time++, a));
    }

    Animal dequeueAny() {
        if (catQ.isEmpty() && dogQ.isEmpty()) throw new IllegalStateException("No animal");
        else if (catQ.isEmpty()) return dogQ.remove().animal;
        else if (dogQ.isEmpty()) return catQ.remove().animal;
        else {
            if (dogQ.peek().time < catQ.peek().time) return dogQ.remove().animal;
            else return catQ.remove().animal;
        }
    }

    Dog dequeueDog() {
        if (dogQ.isEmpty()) throw new IllegalStateException("No animal");
        return (Dog) dogQ.remove().animal;
    }

    Cat dequeueCat() {
        if (catQ.isEmpty()) throw new IllegalStateException("No animal");
        return (Cat) catQ.remove().animal;
    }
}
