import java.util.Scanner;
class SwapTwoNumber {
    public static void swap (int a, int b) {

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number : ");
        int a = sc.nextInt();

        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        System.out.println("Before Swapping : ");
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

        swap(a , b);
    }
}