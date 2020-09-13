package pratice.week1.first;

import java.util.Stack;

/**
 * @author yd
 * @version 1.0
 * @date 2020-09-13 10:21
 */
public class MinStack {

    private Stack<Integer> mainStack;

    private Stack<Integer> helpStack;

    /** initialize your data structure here. */
    public MinStack() {
        mainStack = new Stack<>();
        helpStack = new Stack<>();
    }

    public void push(int x) {
        mainStack.add(x);
        if(!helpStack.isEmpty() && x > helpStack.peek()){
            helpStack.add(helpStack.peek());
        }else {
            helpStack.add(x);
        }
    }

    public void pop() {
        if(!mainStack.isEmpty()){
            mainStack.pop();
            helpStack.pop();
        }
    }

    public int top() {
        if(!mainStack.isEmpty()){
            return mainStack.peek();
        }
        throw new RuntimeException("栈为空");
    }

    public int getMin() {
        if(!helpStack.isEmpty()){
            return helpStack.peek();
        }
        throw new RuntimeException("栈为空");
    }
}
