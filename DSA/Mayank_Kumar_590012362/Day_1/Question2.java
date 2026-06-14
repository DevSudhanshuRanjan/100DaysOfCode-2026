package DSA.Mayank_Kumar_590012362.Day_1;
public class Question2 {
    static int sum(int[] a) {
        int s = 0;
        for (int x : a) s += x;
        return s;
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }

        System.out.println("\nSum of all elements: " + sum(a));
        sc.close();
    }
}