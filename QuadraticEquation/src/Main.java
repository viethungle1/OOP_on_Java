import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b = ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c = ");
        double c = scanner.nextDouble();

        QuadraticEquation result = new QuadraticEquation(a,b,c);

        if (result.getDiscriminant()<0) {
            System.out.print("Phương trình vô nghiệm");
        } else if (result.getDiscriminant()==0) {
            System.out.print("Phương trình có nghiệm là: " + result.getRoot1());
        } else if (result.getDiscriminant()>0) {
            System.out.println("Phương trình có nghiệm x1 là: " + result.getRoot1());
            System.out.println("Phương trình có nghiệm x2 là: " + result.getRoot2());
        }
    }
}