public class Question2 {
    public static void main(String[] args) {
        String[] names = { "Ali", "Zara", "Ahmed", "Fatima", "Usman" };
        int[] marks = { 85, 92, 76, 90, 88 };

        for (int i = 0; i < marks.length; i++) {
            for (int j = 0; j < marks.length - i - 1; j++) {
                if (marks[j] < marks[j + 1]) {

                    String temp0 = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = temp0;

                    int temp = marks[j];
                    marks[j] = marks[j + 1];
                    marks[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < marks.length; i++) {
            System.out.println(names[i] + " - " + marks[i]);
        }
    }
}
