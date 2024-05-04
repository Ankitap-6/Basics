public class Loop {
    public static void main(String[] args) {
        // For loop
        System.out.println("For loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 5);

        // Nested loops
        System.out.println("\nNested loops:");
        for (int m = 0; m < 3; m++) {
            for (int n = 0; n < 2; n++) {
                System.out.println("(" + m + ", " + n + ")");
            }
        }

        // for-each loop
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Using for-each loop with array:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}


