import java.util.Arrays;

public class DivideAndConquer {
    public static String[] mergeSort(String str[], int low, int high) {
        if (low == high) {
            String A[] = {str[low]};
            return A;
        }
        int mid = low + (high - low) / 2;
        String str1[] = mergeSort(str, low, mid);
        String str2[] = mergeSort(str, mid + 1, high);
        String str3[] = merge(str1, str2);
        return str3;
    }
    public static String[] merge(String str1[], String str2) {
        int m = str1.length;
        int n = str2.length;
        String str3[] = new String[m + n];
        int idx = 0;
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (isAlphabeticallySmaller(str1[i], str2[j])) {
                str3[idx] = str1[i];
                i++;
                idx++;
            }
            else {
                str3[idx] = str2[j];
                j++;
                idx++;
            }
        }
        while (i < m) {
            str3[idx] = str1[i];
            i++;
            idx++;
        }
        while (j < n) {
            str3[idx] = str2[j];
            j++;
            idx++;
        }
        return str3;
    }

    public static void main(String[] args) {
        String str[] = {"sun", "earth", "mars", "mercury"};
    }
}
