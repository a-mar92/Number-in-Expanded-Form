// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String test = expandedForm(70304);
        System.out.println(test);
    }



    public static String expandedForm(int num) {
        StringBuilder result = new StringBuilder();
        String number = String.valueOf(num);
        int length = number.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            int placeValue = (int) Math.pow(10, length - i - 1);
            int value = digit * placeValue;

            if (value != 0) {
                result.append(value);
                if (i != length - 1 && value != 0) {
                    result.append(" + ");
                }
            }
        }

        String expandedForm = result.toString();
        if (expandedForm.endsWith(" + ")) {
            expandedForm = expandedForm.substring(0, expandedForm.length() - 3);
        }

        return expandedForm;
    }}
