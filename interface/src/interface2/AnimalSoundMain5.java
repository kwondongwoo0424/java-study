package interface2;

import interface1.InterfaceAnimal;

public class AnimalSoundMain5 {
    public static void main(String[] args) {
        AbstractAnimal[] animalArr = { new Dog(), new Cat(), new Chicken(), new Duck()};
        for (AbstractAnimal animal : animalArr) {
            animal.introduce();
            soundAnimal(animal);
            moveAnimal(animal);
            flyAnimal(animal);
            swimAnimal(animal);
        }
    }
    private static void soundAnimal(AbstractAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
        System.out.println();
    }
    private static void moveAnimal(AbstractAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
        System.out.println();
    }
    private static void flyAnimal(AbstractAnimal animal) {
        if (animal instanceof Fly flyAnimal) {
            System.out.println("비행 기능 테스트 시작");
            flyAnimal.fly();
            System.out.println("비행 기능 테스트 종료");
            System.out.println();
        }
    }
    private static void swimAnimal(AbstractAnimal animal) {
        if (animal instanceof Swim swimAnimal) {
            System.out.println("수영 기능 테스트 시작");
            swimAnimal.swim();
            System.out.println("수영 기능 테스트 종료");
            System.out.println();
        }
    }
}
