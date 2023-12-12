import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        double b = scanner.nextDouble();

        Rectangle rec = new Rectangle(a,b);
        System.out.println("Diện tích hình chữ nhật là: " + rec.getArea());
        System.out.println("Chu vi hình chữ nhật là: " + rec.getPerimeter());
        System.out.println(rec.display());
    }
}
