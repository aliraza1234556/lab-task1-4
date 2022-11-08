import java.util.Scanner;
public class CPN {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         double cpn;
         int matric;
         int intermediate;
         int testmarks;
         System.out.print("Enter matric marks:");
         matric=sc.nextInt();
         matric=matric*100/850;
         System.out.print("Enter Intermediate marks:");
         intermediate=sc.nextInt();
         intermediate=intermediate*100/1100;
         System.out.print("Enter test result:");
         testmarks=sc.nextInt();
         cpn=(matric*10/100)+(intermediate*30/100)+(testmarks*60/100);
         System.out.println("YOUR CPN IS:" +cpn);


    }
}
