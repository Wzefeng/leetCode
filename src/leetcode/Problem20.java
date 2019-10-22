package leetcode;

import java.util.Stack;

/**
 * <p>
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 * <p>
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 * <p>
 * 输入: "{[]}"
 * 输出: true
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * </p>
 *
 * @author wangzefeng
 */
public class Problem20 {
    public static void main(String[] args) {

    }

    // leetcode解法用map key=左括号，value=右括号来处理左右括号对应关系，学习一下
    private static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char c : chars) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
            }
            if (c == '}' || c == ']' || c == ')') {
                if (stack.empty()) {
                    return false;
                }
                char pop = stack.pop();
                if (!((pop == '{' && c == '}') || (pop == '[' && c == ']') || (pop == '(' && c == ')'))) {
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
