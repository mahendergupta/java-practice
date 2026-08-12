import java.util.Scanner;
class reverseNaturalNumber{
    public static void printReverseNumber (int n) {
        int i = 1;
        while(i <= n) {
            System.out.println( n-i+1 );
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the stating number : ");
        int n = sc.nextInt();

        printReverseNumber(n);
        sc.close();
    }
}
