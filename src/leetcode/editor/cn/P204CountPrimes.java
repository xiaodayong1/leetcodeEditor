//统计所有小于非负整数 n 的质数的数量。 
//
// 
//
// 示例 1： 
//
// 输入：n = 10
//输出：4
//解释：小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
// 
//
// 示例 2： 
//
// 输入：n = 0
//输出：0
// 
//
// 示例 3： 
//
// 输入：n = 1
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= n <= 5 * 106 
// 
// Related Topics 哈希表 数学 
// 👍 566 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

//Java：计数质数
public class P204CountPrimes{
    public static void main(String[] args) {
        // TO TEST
        Solution204 solution = new Solution204();
        int i = solution.countPrimes(10);
        System.out.println(i);
    }
}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution204 {
    public int countPrimes(int n) {
        boolean[] booleans = new boolean[n];
        Arrays.fill(booleans,true);
        for (int i = 2; i*i < n ; i++){
            if(booleans[i]){
                for (int j = i*i;j<n;j+=i){
                    booleans[j]=false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (booleans[i]) {
                count++;
            }
        }
        return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
