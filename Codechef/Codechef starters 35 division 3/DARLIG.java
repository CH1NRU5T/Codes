/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class DARLIG {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int choice = sc.nextInt();
        for (int cases = 0; cases < choice; cases++) {
            int k = sc.nextInt(); // number of changes
            int n = sc.nextInt(); // current state (on/off)

            if (k % 4 == 0) {
                System.out.println(n == 1 ? "On" : "Off");
            }

            else if (n == 1) {
                System.out.println("Ambiguous");
            }

            else if (n == 0) {
                System.out.println("On");
            }
        }
    }
}
