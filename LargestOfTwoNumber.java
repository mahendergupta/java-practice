import java.util.Scanner;
class LargestOfTwoNumber {
    public static void large(int a, int b) {
        if(a > b) {
            System.out.println("Largest number is : "+ a);
        }
        else {
            System.out.println("Largest number is : "+ b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter first number  : ");
        int a = sc.nextInt();
        
        System.out.print("Enter second number : ");
        int b = sc.nextInt();

        large(a, b);
        sc.close();
    }
}
