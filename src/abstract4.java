interface tvremote{
    void turnoff();
    void volumeup();
}

interface smarttvremote extends tvremote{
    void connectwithphone();
}
class tv implements tvremote,smarttvremote{
    @Override
    public void turnoff() {
        System.out.println("tv is turned off");
    }
    @Override
    public void volumeup() {
        System.out.println("volume increased");
    }
    @Override
    public void connectwithphone() {
        System.out.println("phone is connected to remote");
    }
}
public class abstract4 {
    public static void main(String[] args) {
        tv a = new tv();
        a.connectwithphone();
        a.turnoff();
        a.volumeup();
    }
}
