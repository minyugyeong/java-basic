package ploy.ex4;

public class Cat extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("야웅");
    }

    @Override
    public void move() {
        System.out.println("고양이 이동");
    }
}
