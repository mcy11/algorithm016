package pratice.week1.first;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 09:56
 */
public class IsValid {

    public boolean isValid(String s) {
        if(s.length() % 2 == 1){
            return false;
        }
        Map<Character, Character> paramMap = new HashMap<>();
        paramMap.put('}', '{');
        paramMap.put(']', '[');
        paramMap.put(')', '(');
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character character = s.charAt(i);
            if(paramMap.containsKey(character)){
                if(stack.isEmpty() || !stack.peek().equals(paramMap.get(character))){
                    return false;
                }
                stack.pop();
            }else {
                stack.push(character);
            }
        }
        return stack.empty();
    }
}
