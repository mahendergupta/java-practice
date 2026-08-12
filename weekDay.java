 import java.util.Scanner;
 class weekDay {
    public static void day (int n) {
        switch(n) {
            case 1: 
                System.out.println("Monday");
            break;

            case 2:
                System.out.println("Tuesday");
            break;
            
            case 3:
                System.out.println("Wednesday");
            break;

            case 4:
                System.out.println("Thursday");
            break;

            case 5:
                System.out.println("Friday");
            break;

            case 6:
                System.out.println("Saturday");
            break;

            case 7:
                System.out.println("Sunday");
            break;

            default :
            System.out.println("Enter a valid day value");
            break;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a day value : ");
        int n = sc.nextInt();

        day(n);
        sc.close();
    }
 }
