import java.util.*;

class FoundLeftCeilingEffApp {

    public static void main(String[] args) {
        int[] input = {
            2,
            8,
            30,
            15,
            25,
            12
        };
        printCeling(input, input.length);
    }

    public static void printCeling(int[] arr, int n) {
        System.out.println(-1);
        TreeSet < Integer > t = new TreeSet < Integer > ();
        t.add(arr[0]);
        for (int i = 1; i < n; i++) {
            if (t.ceiling(arr[i]) != null) {
                System.out.println(t.ceiling(arr[i]));
            } else {
                System.out.println(-1);
            }
            t.add(arr[i]);
        }
    }
}
