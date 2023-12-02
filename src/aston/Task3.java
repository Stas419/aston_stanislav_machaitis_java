package aston;

public class Task3 {
    public static void main(String[] args) {
        func(null); //test 1: array is null
        func(new int[]{}); //test 2: empty array
        func(new int[]{1}); //test 3: array with one element
        func(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}); //test 4: correct array with nine elements


    }

    public static void func(int[] integers) {
        if (integers != null && integers.length > 0) {
            for (int i = 1; i <= integers.length; i++) {
                if (i % 3 == 0) {
                    System.out.println(integers[i - 1]);
                }
            }
        }
    }
}
