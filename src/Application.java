import java.util.Scanner;

public class Application {

    public static Scanner sc = new Scanner(System.in);

    public static void array () {


        int let = 0;
        do {

            System.out.println("write number");
            let = sc.nextInt();
            String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            char ch = s.charAt(let);
            System.out.println(ch);


        }
        while (let  != let);

        sc.nextLine();

    }


    public static void main (String[] args) {
        array();

    }
}


