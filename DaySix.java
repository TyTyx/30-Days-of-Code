import java.io.*;
import java.util.*;

public class DaySix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String s;

    for(int i=0;i<x;i++){
        s = scan.next();

        for(int j=0;j<s.length();j++){

            if(j%2 ==0){
                System.out.print(s.charAt(j));
            }
        } 
        System.out.print(" ");
        for(int j=0;j<s.length();j++){
            if(j%2==1){
                System.out.print(s.charAt(j));
            }

        }
        System.out.println();
        }
        
    }
}