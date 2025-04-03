abstract class Monkey{
    abstract public void jump();
    abstract public void bite();
}

class human extends Monkey{
    @Override
    public void jump() {
        System.out.println("jumping...");
    }
    @Override
    public void bite() {
        System.out.println("biting...");
    }
    public void eat() {
        System.out.println("eating...");
    }
    public void sleep() {
        System.out.println("sleeping...");
    }
}
public class abstract2 {
    public static void main(String[] args) {
        human a = new human();
        a.bite();
        a.eat();
        a.jump();
        a.sleep();
    }
}
