package interface2;

public class Duck extends AbstractAnimal implements Fly, Swim{
    @Override
    public void sound() {
        System.out.println("Duck sound");
    }
    @Override
    public void move() {
        System.out.println("Duck move");
    }
    @Override
    public void fly() {
        System.out.println("날개를 퍼덕이며 날아갑니다.");
    }
    @Override
    public void swim() {
        System.out.println("물 위에서 헤엄칩니다.");
    }
    @Override
    public void introduce() {
        System.out.println("I'm a Duck I have " + DEFAULT_EYE_COUNT + " eyes");
        System.out.println("날개를 퍼덕이며 날아갑니다.");
    }
}
