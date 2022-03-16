package ss21_design_pattern.practices.method_factory;

import ss21_design_pattern.practices.method_factory.Animal;

public class Dog extends Animal {
    @Override
    public String makeSound() {
        return "Woof";
    }
}
