package interface2;

public class Chicken extends AbstractAnimal implements Fly{
    @Override
    public void sound() {
        System.out.println("Chicken sound");
    }
    @Override
    public void move() {
        System.out.println("Chicken move");
    }
    @Override
    public void fly() {
        System.out.println("잠깐 날 수 있지만 멀리 날지는 못함");
    }
    @Override
    public void introduce() {
        System.out.println("I'm a chicken I have " + DEFAULT_EYE_COUNT + " eyes");
        System.out.println("짧은 거리만 잠깐 날 수 있습니다.");
    }
}
