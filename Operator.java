import java.util.*;
import java.lang.AbstractMethodError;
public class Operator {
    public static void main(String[] args) {
        int i=2,j=3;
        boolean s=false;
        if(i<j)
        {
            System.out.println("i<j  i is greater then j");
        }
        if(j>=i){
            System.out.println("j>=i j is greater then or equal to i");
        }
        if(i!=j){
            System.out.println("i!=j  i is not equal to j");
        }
        if(!s){
            System.out.println("!S returns false value");
        }
        j=2;
        if(i==j)
        {
            System.out.println("i=j i is equal to j");
        }
        if(i==2 & j==2)
        {
            System.out.println("i and (&) j are equal to 2");
        }
        if(i==2 || j==5){
            System.out.println("i or (||) j are equal ");
        }
      
        
    }
    
}
