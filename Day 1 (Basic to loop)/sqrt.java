public class sqrt {
    public static void main(String[] args) {
        int n = 26;
        int start = 1, end = n, ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                ans = mid;
                break;
            } else if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        System.out.println("Square root: " + ans);
    }
}
