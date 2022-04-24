package aiden.study.problem;

import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode 1441
 * Build Array using Stack
 */
public class StackArray {
    public List<String> buildArray(int[] target, int n) {
        String push = "Push";
        String pop = "Pop";

        List<String> out = new ArrayList<>();
        int targetInd = 0;
        for (int i = 1; i <= n; i++) {
            if (target[targetInd] != i) {
                out.add(push);
                out.add(pop);
            } else {
                out.add(push);
                if (targetInd == target.length - 1) {
                    break;
                } else {
                    targetInd++;
                }
            }
        }

        return out;
    }
}
