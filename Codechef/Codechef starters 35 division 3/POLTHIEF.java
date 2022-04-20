import java.util.*;
import java.lang.*;
import java.io.*;

class POLTHIEF {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws java.lang.Exception {
        int choice = sc.nextInt();
        for (int cases = 0; cases < choice; cases++) {
            int x = sc.nextInt(); // initial position of police
            int y = sc.nextInt(); // initial position of thief
            int count = 0;
            while (true) {
                if (x == y)
                    break;
                if (x > y)
                    y++;
                if (x < y) {
                    x += 2;
                    y++;
                }
                count++;
            }
            System.out.println(count);
        }
    }
}
