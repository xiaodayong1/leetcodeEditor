//给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 
//
// 有效字符串需满足： 
//
// 
// 左括号必须用相同类型的右括号闭合。 
// 左括号必须以正确的顺序闭合。 
// 
//
// 注意空字符串可被认为是有效字符串。 
//
// 示例 1: 
//
// 输入: "()"
//输出: true
// 
//
// 示例 2: 
//
// 输入: "()[]{}"
//输出: true
// 
//
// 示例 3: 
//
// 输入: "(]"
//输出: false
// 
//
// 示例 4: 
//
// 输入: "([)]"
//输出: false
// 
//
// 示例 5: 
//
// 输入: "{[]}"
//输出: true 
// Related Topics 栈 字符串 
// 👍 2022 👎 0


package leetcode.editor.cn.stack;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

//Java：有效的括号
public class P20ValidParentheses{
    public static void main(String[] args) {
        Solution solution = new Solution();
        boolean valid = solution.isValid("([)]");
        System.out.println(valid);
        // TO TEST
    }
}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0){
           return false;
        }
        HashMap<Character, Character> characterCharacterHashMap = new HashMap<>();
        characterCharacterHashMap.put('}','{');
        characterCharacterHashMap.put(')','(');
        characterCharacterHashMap.put(']','[');

        Stack<Character> isValid = new Stack<>();
        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (characterCharacterHashMap.containsKey(c)) {
                if (isValid.isEmpty() || isValid.peek() != characterCharacterHashMap.get(c)){
                     return false;
                }
                isValid.pop();
            } else {
                isValid.push(c);
            }
        }
        return isValid.isEmpty();
    }
}
//leetcode submit region end(Prohibit modification and deletion)
