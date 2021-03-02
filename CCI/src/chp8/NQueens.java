package chp8;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    int n;
    List<Integer> position;
    List<List<Integer>> result = new ArrayList<>();

    public NQueens(int n) {
        this.n = n;
        position = new ArrayList<>(n);
    }

    List<List<String>> positions() {
        dfs();

        List<List<String>> l = new ArrayList<>();
        for (List<Integer> list: result) {
            List<String> p = new ArrayList<>(n);
            for (Integer c: list) {
                char[] chars = new char[n];
                for (int col = 0; col < n; col++) {
                    if (col == c-1) chars[col] = 'Q';
                    else chars[col] = '.';
                }
                p.add(new String(chars));
            }
            l.add(p);
        }
        return l;
    }

    void dfs() {
        if (position.size() == n) {
            result.add(new ArrayList<>(position));
            return;
        }
        //放置第row(从1开始) 行，
        int row = position.size() + 1;

        // 放置在i 列
        outer: for (int i = 1; i <= n ; i++) {
            // 判断是否在同一列
            if (position.contains(i)) continue;
            // 判断【row 行， i 列】与【j行，position.get(j-1)列】
            // 是否在对角线上
            for (int j = 1; j < row; j++) {
                if (row - j == i - position.get(j-1)) continue outer;
                if (row - j == position.get(j-1) - i) continue outer;
            }
            position.add(i);
            dfs();
            position.remove(position.size()-1);
        }
    }
}
