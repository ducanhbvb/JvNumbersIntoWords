import java.util.Scanner;

public class NumbersIntoWords {
    public static String checkNumeral( int number){
        switch (number){
            case 0:
                return "";
            case 1:
                return"One";
            case 2:
                return"Two";
            case 3:
                return"three";
            case 4:
                return"four";
            case 5:
                return"five";
            case 6:
                return"six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";

        }return "";
    }
    public static String checkTens( int tens){
        switch (tens){
            case 1:
                return"teen";
            case 2:
                return"twenty";
            case 3:
                return"thirty";
            case 4:
                return"forty";
            case 5:
                return"fifty";
            case 6:
                return"sixty";
            case 7:
                return "seventy ";
            case 8:
                return "eighty";
            case 9:
                return "ninety";

        }
        return"";
    }
    public static String checkteen( int number){
        switch (number){
            case 10:
                return"ten";
            case 11:
                return"eleven";
            case 12:
                return"twelve";
            case 13:
                return"thirteen";
            case 14:
                return"fourteen";
            case 15:
                return"fifteen";
            case 16:
                return"sixteen";
            case 17:
                return "seventeen ";
            case 18:
                return "eighteen";
            case 19:
                return "nineteen";
        }
        return"";
    }
    public static void main(String[] avg) {

        Scanner scanner = new Scanner(System.in);
        int number = 1;
        while (number != 0) {
            System.out.println("Input Number Into Words");
            number = scanner.nextInt();
            int hundreds=Math.floorDiv(number,100);
            int tens = Math.floorDiv((number-hundreds*100), 10);
            int numeral = number % 10;
            if (number < 10) {
                System.out.println(checkNumeral(numeral));
            } else if (number < 20) {
                System.out.println(checkteen(number));
            } else if (number < 100) {
                System.out.println(checkTens(tens) +" "+ checkNumeral(numeral));
            }else if(number<999){
                if(tens==1){
                    System.out.println(checkNumeral(hundreds)+" hundred "+checkteen(tens*10+numeral));
                }else{
                    System.out.println(checkNumeral(hundreds)+" hundred "+checkTens(tens)+" "+checkNumeral(numeral));
                }
            }
        }
    }
}
