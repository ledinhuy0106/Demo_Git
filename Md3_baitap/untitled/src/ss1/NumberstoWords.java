
import java.util.Scanner;

public class NumberstoWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số cần đọc (0-999): ");
        int number = scanner.nextInt();
            String result = "";

            // Bước 5: Đọc các số có ba chữ số
            if (number >= 100) {
                int hundreds = number / 100;
                result += getDigitInWords(hundreds) + " hundred";
                number %= 100;
                if (number > 0) {
                    result += " ";
                }
            }

            // Bước 4: Đọc các số có hai chữ số lớn hơn hoặc bằng 20
            if (number >= 20) {
                int tens = number / 10;
                result += getTensInWords(tens);
                number %= 10;
                if (number > 0) {
                    result += " ";
                }
            }
            if (number > 0) {
                result += getDigitOrTeenInWords(number);
            }

            System.out.println(result);
        }
    public static String getDigitInWords(int digit) {
        switch (digit) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String getTensInWords(int tens) {
        switch (tens) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }

    public static String getDigitOrTeenInWords(int number) {
        if (number >= 10 && number <= 19) {
            switch (number) {
                case 10:
                    return "ten";
                case 11:
                    return "eleven";
                case 12:
                    return "twelve";
                case 13:
                    return "thirteen";
                case 14:
                    return "fourteen";
                case 15:
                    return "fifteen";
                case 16:
                    return "sixteen";
                case 17:
                    return "seventeen";
                case 18:
                    return "eighteen";
                case 19:
                    return "nineteen";
                default:
                    return "";
            }
        }
        else {
            return getDigitInWords(number);
        }
    }
}
