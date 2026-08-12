import java.util.Scanner;
// PascleCase
class EvenNumber { 
    // camelCase
    public static void printEvenNumber(int n) {
        int i = 2;
        while (i <= n) {
            System.out.println(i);
            i = i+2;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of the series : ");
        int n = sc.nextInt();

        printEvenNumber(n);
        sc.close();
    }
}