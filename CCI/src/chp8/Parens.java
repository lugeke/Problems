package chp8;

import java.util.LinkedList;
import java.util.List;

public class Parens {

    private int left;
    private int right;

    private List<String> result = new LinkedList<>();
    private StringBuffer stack;

    public Parens(int n) {
        left = right = n;
        stack = new StringBuffer(n*2);
    }

    public List<String> parentheses() {
        stack.append('(');
        left--;
        dfs();
        return result;
    }

    void dfs() {
        if (stack.length() == stack.capacity()) {
            result.add(stack.toString());
            return;
        }

        // 总是可以添加 '('
        if (left > 0) {
            stack.append('(');
            left--;
            dfs();
            left++;
            stack.setLength(stack.length()-1);
        }
        // 有未配对的 '('
        if (left < right) {
            stack.append(')');
            right--;
            dfs();
            right++;
            stack.setLength(stack.length()-1);
        }

    }
}
