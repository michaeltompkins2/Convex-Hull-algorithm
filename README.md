# Convex-Hull-algorithm
Homework assignment, a foundation was given, will be posted in the read me


import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Pair {
    int one;
    int two;
    public Pair(int one, int two) {
        this.one = one; this.two = two;
    }
}

public class Hull {

    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int N = scanner.nextInt();
        float[] x = new float[N];
        float[] y = new float[N];
        for (int i = 0; i < N; i += 1) {
            x[i] = scanner.nextFloat();
            y[i] = scanner.nextFloat();
        }

        List<Pair> hullSegments = new ArrayList<Pair>();



        // TODO, implement the brute force algorithm




        System.out.println(hullSegments.size());
        for (Pair p : hullSegments) {
            System.out.printf("%d %d\n", p.one, p.two);
        }
    }




}
