public class Fan {
    final static int SLOW = 1;
    final static int MEDIUM = 2;
    final static int FAST = 3;
    int speed;
    boolean on;
    double radius;
    String color;
    public Fan() {
        this.speed=SLOW;
        this.on=false;
        this.radius=5;
        this.color="blue";
    }
    public Fan (int speed, boolean on, double radius, String color) {
        this.speed=speed;
        this.on=on;
        this.radius=radius;
        this.color=color;
    }

    public String toString() {
        return "Fan{" +
                "speed=" + speed +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
