import java.util.Scanner;
class naturalNumber {
    public static void printNaturalNumbers(int n) {
        int i =1;
        while(i <= n) {
            System.out.println(i);
            i++;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the last number of the natural number series : ");
        int n = sc.nextInt();

        printNaturalNumbers(n);
        sc.close();
    }
}
