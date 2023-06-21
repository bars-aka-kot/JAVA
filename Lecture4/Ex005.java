package Lecture4;

import java.util.Stack;

public class Ex005 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // var exp = "1 2 3 * 4 * + 5 10 / * 20 -".split(" ");

        // var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        // var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3

        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        // var exp = "8 8 * 3 3 * -".split(" "); // 8^2 - 3^2
        var exp = "1 sin 1 sin *".split(" "); // sin(1)^2
        double res = 0;
        System.out.println(exp);

        Stack<Double> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Double.parseDouble(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    case "sin":
                        res = Math.sin(st.pop());
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.println(st.pop());
    }
}