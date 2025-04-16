abstract class Telephone{
    abstract public void ring();
    abstract public void lift();
    abstract public void disconnect();

}
interface camera{
    public void click();
}

class Smartphone extends Telephone implements camera{
    @Override
    public void ring() {
        System.out.println("ringing...");
    }
    @Override
    public void lift() {
        System.out.println("lifted...");
    }
    @Override
    public void disconnect() {
        System.out.println("disconnected...");
    }

    @Override
    public void click() {
        System.out.println("clicked");
    }

}
public class abstract3 {
    public static void main(String[] args) {
        camera s = new Smartphone();
        // s.ring():   -----> not possible due to polumarism
    }
}
