package ss7_abstract_and_interface.practices.animal;

import ss7_abstract_and_interface.practices.animal.Animal;
import ss7_abstract_and_interface.practices.animal.Tiger;
import ss7_abstract_and_interface.practices.animal.Chicken;
import ss7_abstract_and_interface.practices.edible.Edible;
import ss7_abstract_and_interface.practices.fruit.Fruit;
import ss7_abstract_and_interface.practices.fruit.Orange;
import ss7_abstract_and_interface.practices.fruit.Apple;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}