package Stack;

import java.util.List;
import java.util.Stack;

public class EqualStack {
    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        Stack<Integer> s3 = new Stack<>();

        int height1 = 0;
        int height2 = 0;
        int height3 = 0;

        if (h1 == null || h2 == null || h3 == null) {
            return 0;
        }

        for (int i = h1.size() - 1 ; i >= 0 ; i--) {
            s1.push(h1.get(i));
            height1 += h1.get(i);
        }
        for (int i = h2.size() - 1 ; i >= 0 ; i--) {
            s2.push(h2.get(i));
            height2 += h2.get(i);
        }
        for (int i = h3.size() - 1 ; i >= 0 ; i--) {
            s3.push(h3.get(i));
            height3 += h3.get(i);
        }

        while (!s1.empty() && !s2.empty() && !s3.empty()) {
            if (height1 == height2 && height2 == height3) {
                return height1;
            }
            if (height1 >= height2 && height1 >= height3) {
                height1 -= s1.pop();
            } else if (height2 >= height3 && height2 >= height1) {
                height2 -= s2.pop();
            } else if (height3 >= height2 && height3 >= height1) {
                height3 -= s3.pop();
            }
        }

        return 0;
    }
}
