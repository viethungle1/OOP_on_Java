public class Main {
    public static void main(String[] args) {
    Fan fan = new Fan();
    Fan fan1 = new Fan(Fan.FAST,true,10,"yellow");
        System.out.println(fan1);
    Fan fan2 = new Fan(Fan.MEDIUM,false,5,"blue");
        System.out.println(fan2);
    }
}