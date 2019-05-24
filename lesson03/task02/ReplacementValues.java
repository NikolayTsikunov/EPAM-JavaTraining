public class ReplacementValues {
    public static void demonstrateReplacement(int a, int b) {
        System.out.printf("\nValues of numbers: a = %d and b = %d at the beginning\n",
                a, b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.printf("\nValues of numbers: a = %d and b = %d after replacement\n",
                a, b);
    }
}
