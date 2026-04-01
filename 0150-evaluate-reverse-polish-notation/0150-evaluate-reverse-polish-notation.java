import java.util.*;

class Solution {
    public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();

                    for (String token : tokens) {

                                // Check if operator
                                            if (token.equals("+") || token.equals("-") ||
                                                            token.equals("*") || token.equals("/")) {

                                                                            int a = stack.pop();  // second operand
                                                                                            int b = stack.pop();  // first operand

                                                                                                            if (token.equals("+")) {
                                                                                                                                stack.push(b + a);
                                                                                                                                                } else if (token.equals("-")) {
                                                                                                                                                                    stack.push(b - a);
                                                                                                                                                                                    } else if (token.equals("*")) {
                                                                                                                                                                                                        stack.push(b * a);
                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                            stack.push(b / a);
                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                        } else {
                                                                                                                                                                                                                                                                                        // number
                                                                                                                                                                                                                                                                                                        stack.push(Integer.parseInt(token));
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                            }

                                                                                                                                                                                                                                                                                                                                    return stack.pop();
                                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                                        }