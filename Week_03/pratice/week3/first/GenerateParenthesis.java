package pratice.week3.first;

import java.util.ArrayList;
import java.util.List;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-21 14:28
 */
public class GenerateParenthesis {

    private List<String> result = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        generate(0, 0, n, "");
        return result;
    }

    private void generate(int leftNum, int rightNum, int n, String s) {
        if(leftNum >= n && rightNum >= n){
            result.add(s);
            return;
        }

        if(leftNum < n){
            generate(leftNum + 1, rightNum, n, s + "(");
        }
        if(rightNum < leftNum){
            generate(leftNum, rightNum + 1, n, s + ")");
        }
    }
}
