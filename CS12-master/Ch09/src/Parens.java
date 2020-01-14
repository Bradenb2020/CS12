/**
 * Exercise on encapsulation and generalization.
 */
public class Parens {
    public static void main(String[] args) {
        String s = "((3 + 7) * 2)";
        char a = '3';
        char b = '7';
        System.out.println(equalChars(s,a,b));
        System.out.println(balanced(s));
    }
    public static int equalChars(String equation, char char1, char char2) {
    	int count = 0;

        for (int i = 0; i < equation.length(); i++) {
            char c = equation.charAt(i);
            if (c == char1) {
                count++;
            } else if (c == char2) {
                count--;
            }
        }
        return count;
    }
    public static int balanced(String equation) {
    	return equalChars(equation,'(',')');
    }
}