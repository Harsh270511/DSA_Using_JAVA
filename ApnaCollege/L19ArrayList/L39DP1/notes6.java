//LCS space optimization
package ApnaCollege.L19ArrayList.L39DP1;

public class notes6 {
    public static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // prev represents the previous row (i-1)
        // curr represents the current row (i)
        int[] prev = new int[m + 1];
        int[] curr = new int[m + 1];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } else {
                    curr[j] = Math.max(curr[j - 1], prev[j]);
                }
            }
            // After filling one full row, current becomes the previous for the next iteration
            // We use clone() or a manual copy to avoid reference issues
            prev = curr.clone(); 
        }
        return prev[m];
    }

    public static void main(String[] args) {
        String s1 = "abcde";
        String s2 = "bdgek";

        System.out.println("LCS Length: " + lcs(s1, s2));
    }
} 