package interface2;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("Meow");
    }

    @Override
    public void move() {
        System.out.println("Cat Walk");
    }

    @Override
    public void introduce() {
        System.out.println("I'm a cat");
        System.out.println("I have " + DEFAULT_EYE_COUNT + " eyes");
    }
}
