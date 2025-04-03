// Creates an abstract class Pen with methods write() and refill() as abstract method

abstract class pen{
    abstract public void write();
    abstract public void refill();

}

class Fountainpen extends pen{
    @Override
    public void write() {
        System.out.println("writing");
    }

    @Override
    public void refill() {
        System.out.println("refilling");
    }
    public void changenib(){
        System.out.println("changing nib");
    }
}
public class abstract1 {
    public static void main(String[] args) {
        Fountainpen c = new Fountainpen();
        c.write();
        c.refill();
        c.changenib();
    }

}
