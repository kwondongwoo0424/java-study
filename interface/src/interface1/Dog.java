package interface1;

public class Dog implements InterfaceAnimal{
    @Override
    public void sound() {
        System.out.println("fff");
    }

    @Override
    public void move() {
        System.out.println("Walk");
    }

    @Override
    public void introduce() {
        System.out.println( "I'm a dog");
        System.out.println("I have " + DEFAULT_EYE_COUNT + " eyes");
    }
}
