import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();

        int i =0 ;
        int j = s1.length()-1;
        boolean check = false;

        while(i<=j)
        {
            if(s1.charAt(i) != s1.charAt(j))
            {
                System.out.println("Not palindrom");
                check = true;
                break;

            }
            else
            {
                i++;
                j--;
            }
        }
        if(true)
        {
            System.out.println("palindrom");
        }





    }
}
