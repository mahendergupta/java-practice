import java.util.Scanner;
class TernaryOperator {
    public static void result(int marks) {
        System.out.println(marks >= 40 ? "Pass" : "Fail");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks : ");
        int marks = sc.nextInt();

        result(marks);
        sc.close();
    }
}