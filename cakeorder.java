import java.util.Scanner;

public class cakeorder {
    public static void main(String[] args) {

        int Cakes = 300;
        int Cupcakes = 100;
        int Cookies = 150;
        boolean c =true;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        while (c) {
            System.out.println("***************************************");
            System.out.println();
            System.out.println("********WELCOME TO BAKERS DOMAIN*******");
            System.out.println();
            System.out.println("                 1.Cakes");
            System.out.println("                 2.Cupcakes");
            System.out.println("                 3.Cookies");
            System.out.println("                 4.Helpline");
            System.out.println("                 5.Exit");

            System.out.println("Enter Your choice");
            int ch = sc.nextInt();

            switch (ch) {
                case 1: {
                    System.out.println("Order Cakes Here...");
                    total = total+Cakes;
                    break;
                }
                case 2: {
                    System.out.println("You ordered Cupcakes");
                    total=total+Cupcakes;
                    break;
                }

                case 3: {
                    System.out.println("You ordered Cookies");
                    total=total+Cookies;
                    break;
                }

                case 4: {
                    System.out.println("www.bakersdomain.me");
                    System.out.println("bakersbros2k@gmail.com");
break;}
                case 5: {
                    System.out.println("Your Bill Amount is : "+total);
                    System.out.println("Thanks for Shopping!!");

                    c = false;
                    break;
                }
}
}
}
}
