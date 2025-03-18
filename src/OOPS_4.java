class TommyVecetti{
    public void hit(){
        System.out.println("hitting enemy");
    }
    public void run(){
        System.out.println("running");
    }
    public void fire(){
        System.out.println("firing the gun");
    }
}
public class OOPS_4 {
    public static void main(String[] args) {
        TommyVecetti player = new TommyVecetti();
        player.run();
        player.hit();
        player.fire();
    }
}
