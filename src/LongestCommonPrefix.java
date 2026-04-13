import java.util.Scanner;

public class LongestCommonPrefix {
    
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                
                // Read N
                int N = sc.nextInt();
                
                // Read N strings into an array
                String[] strings = new String[N];
                for (int i = 0; i < N; i++) {
                        strings[i] = sc.next();
                }
                sc.close();
                
                // Find the longest common prefix
                // Start with the first string as the 'prefix'
                String prefix = strings[0];
                
                // Iterate through the rest, shortening the 'prefix' until it matches the start of the current string
                for (int i = 1; i < N; i++) {
                        while (!strings[i].startsWith(prefix)) {
                                prefix = prefix.substring(0, prefix.length() - 1);
                                if (prefix.isEmpty()) {
                                        break;
                                }
                        }
                        if (prefix.isEmpty()) {
                                break;
                        }
                }
                
                // If prefix is empty, print "-1", otherwise print the prefix
                if (prefix.isEmpty()) {
                        System.out.println("-1");
                } else {
                        System.out.println(prefix);
                }
        }
}
