// Scope

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;

  		// Add your code here
	public Difference(int[] elements) {
	    this.elements = elements;
	}

	public void computeDifference() {
	    int max=1, min=100;
	    for (int e: elements) {
	        max = Math.max(max, e);
	        min = Math.min(min, e);
	    }
	    maximumDifference = max - min;   
	}

} // End of Difference class

public class dayFourteen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}