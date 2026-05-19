import java.util.Scanner;
class EvenOdd {
    public static void evenOdd(int n)
    {
        if( n%2 == 0)
        {
            System.out.println("Even : " +n);
        }
        else {
            System.out.println("Odd : " +n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a number : ");
        int n = sc.nextInt();

        evenOdd(n);
        sc.close();
    }
}