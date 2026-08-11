import java.util.Scanner;
class LargestOfThreeNumber {
    public static void largest(int a, int b, int c) {
        // Logical AND Operator Using (&&)
        if(a > b && a > c) {
            System.out.println("Largest number is : " + a);
        }
        else if(b > a && b > c) {
            System.out.println("Largest number is : " + b);
        }
        else {
            System.out.println("Largest number is : " + c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.print("Enter third number : ");
        int c = sc.nextInt();

        largest(a, b, c);
        sc.close();
    }
}
