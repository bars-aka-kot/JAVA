package Lecture3;

public class program2 {
    public static void main(String[] args) {
        System.out.println(sum(1, 2));
        System.out.println(sum(1.0, 2));
        System.out.println(sum(1, 2.0));
        System.out.println(sum(1.2, 2.1));
        System.out.println(sum("каша", "маша"));

    }

    public static Object sum(Object a, Object b) {
        if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer) a + (Integer) b);
        } else if (a instanceof Double && b instanceof Double) {
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof String && b instanceof String) {
            return (Object) ((String) a + (String) b);
        } else if (a instanceof Integer && b instanceof Double) {
            return (Object) ((Integer) a + (Double) b);
        } else if (a instanceof Double && b instanceof Integer) {
            return (Object) ((Double) a + (Integer) b);
        } else
            return 0;
    }
}
