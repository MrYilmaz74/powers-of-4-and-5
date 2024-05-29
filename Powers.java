import java.util.Scanner;
public class Powers {
    public static void main(String[] args) {
        int number;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number:");
        number = scan.nextInt();

        for (int i = 1, j = 1; i <= number || j <= number; i *= 4, j *= 5) {
            System.out.println(i + "\t" + j);
    }
 }
}
