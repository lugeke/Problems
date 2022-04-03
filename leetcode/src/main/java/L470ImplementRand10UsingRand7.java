import java.util.concurrent.ThreadLocalRandom;

public class L470ImplementRand10UsingRand7 {

    private int rand7() {
        return ThreadLocalRandom.current().nextInt(1, 8);
    }

    //  (randX() - 1)*Y + randY() 可以等概率的生成[1, X * Y]范围的随机数
    // 用拒绝采样法，> 40的丢弃
    public int rand10() {

        while (true) {
            int row = rand7();
            int col = rand7();
            int r = (row - 1) * 7 + col;
            if (r < 41) return (r % 10) + 1;
        }
    }

//    链接：https://leetcode-cn.com/problems/implement-rand10-using-rand7/solution/xiang-xi-si-lu-ji-you-hua-si-lu-fen-xi-zhu-xing-ji/
    // 利用拒绝的数据
    public int rand10_use_rejected_sample() {
        while (true){
            int num = (rand7() - 1) * 7 + rand7();
            // 如果在40以内，那就直接返回
            if(num <= 40) return 1 + num % 10;
            // 说明刚才生成的在41-49之间，利用随机数再操作一遍
            num = (num - 40 - 1) * 7 + rand7();
            if(num <= 60) return 1 + num % 10;
            // 说明刚才生成的在61-63之间，利用随机数再操作一遍
            num = (num - 60 - 1) * 7 + rand7();
            if(num <= 20) return 1 + num % 10;

        }
    }

}
