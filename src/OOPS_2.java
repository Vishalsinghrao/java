class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Mukul...");
    }

}
public class OOPS_2 {
    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.ring();
        vivo.vibrate();
        vivo.callFriend();
    }

}
