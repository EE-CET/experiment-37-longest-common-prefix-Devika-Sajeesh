import java.util.Scanner;

public class LongestCommonPrefix{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();

        String prefix = sc.nextLine();

        for (int i = 1; i < N; i++) {
            String s = sc.nextLine();
            while (!s.startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println("-1");
                    return;
                }
            }
        }

        System.out.println(prefix);
    }
}
