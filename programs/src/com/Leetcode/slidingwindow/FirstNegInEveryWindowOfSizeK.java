package slidingwindow;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class FirstNegInEveryWindowOfSizeK {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        List<Integer> arrList = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        int j = 0;
        while (j < arr.length) {
            if (arr[j] < 0)
                queue.add(arr[j]);
            if (j - i + 1 == k) {
                arrList.add(queue.isEmpty() ? 0 : queue.peek());
                if (arr[i] < 0)
                    queue.remove();
                i++;
            }
            j++;
        }
        return arrList;
    }
}