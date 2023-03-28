package ch5;

public class MyAssignment {
    public static class RDChar {
        public String reverseDoubleChar(String word) {
            char reverse;
            String concatStr = "";
            int count = 1;
            for (int i = 0; i < word.length(); i++) {
                reverse = word.charAt(word.length() - count); //gets the last char each time
                concatStr = concatStr + reverse + reverse; //adds the last char twice each time
                count++;
            }
            return concatStr;
        }
    }

    public static class SumDigits {
        public int numSum(int n) {
            int i = 0;
            int total = 0;
            int x = 0;
            String input = String.valueOf(n); //conversion from int to String
            while (i < input.length()) {
                x = n % 10; //Modulos number
                n /= 10; //gets rid of last digit
                total += x; //adds modulos to last number
                i++;
            }
            return total;
        }
    }

    public static class BName {
        public String birthdayName(String name) {
            String birthday = "Happy Birthday " + name + "!"; //adds name in the middle of happy bday and !
            return birthday;
        }
    }

    public static class MFront {
        public String missingFront(String str) {
            return str.substring(3); //missing front three letters
        }
    }

    public static class SEnds {
        public String swapEnds(String str) {
            if (str.length() <= 1) {
                return str; //in the case that there are no letters.
            }
            return str.charAt(str.length() - 1) + str.substring(1, str.length() - 1) + str.charAt(0);
            //takes the last letter puts it in front, concatenated substring without first and last letter and the first letter charAt(0);
        }
    }

    public static class EOther {
        public String everyOther(String str) {
            String concat = "";
            for (int i = 0; i < str.length(); i += 2) {
                concat += str.charAt(i); //charAt i because i += 2 and that skips odd numbers
            }
            return concat;
        }
    }

    public static class NStart {
        public String nonStart(String a, String b) {
            if (a.length() < 1 || b.length() < 1) {
                return "";
            }
            return a.substring(1) + b.substring(1);
        }
    }

    public static class FibSeq {
        public int fibonacci(int n) {
            if (n < 2) {
                return n;
            }
            return fibonacci(n - 1) + fibonacci(n - 2); //basically getting fibonacci of fibonacci, simplifying the given numbers to 1 and 0s
        }
    }

    public static class LSum {
        public int luckySum(int a, int b, int c) {
            if (a == 13) { //first number equalling 13
                return 0;
            }
            if (b == 13) { //second number equalling 13
                return a;
            }
            if (c == 13) { //third number equalling 13
                return a + b;
            } else { //no numbers equalling 13
                return a + b + c;
            }
        }
    }

    public static class Palindrome {
        public boolean hasPalindrome(String str) {
            char reverse;
            String concatStr = "";
            String newStr = "";
            int count = 1;

            for (int i = 0; i < str.length(); i++) {
                boolean b1 = Character.isDigit(str.charAt(i));
                boolean b2 = Character.isAlphabetic(str.charAt(i));
                if (b1 || b2) {
                    newStr += str.substring(i, i + 1);
                }
            } //Gets rid of symbols
            newStr = newStr.toLowerCase(); //formats the string into lowercase

            for (int i = 0; i < newStr.length(); i++) {
                reverse = newStr.charAt(newStr.length() - count);
                concatStr = concatStr + reverse;
                count++;
            } //reversed string
            return concatStr.equals(newStr);
        }
    }

    public static class PowerOf2 {
        public boolean powerOfTwo(int n) {
            while (n > 1 && n % 2 == 0) {
                return true;
            }
            if (n == 1) {
                return true;
            }
            return false;
        }
    }

    public void main(String[] args) {
        RDChar revChar = new RDChar();
        SumDigits numSum = new SumDigits();
        BName birthdayName = new BName();
        MFront missFront = new MFront();
        SEnds swpEnds = new SEnds();
        EOther evryOther = new EOther();
        NStart nonStrt = new NStart();
        FibSeq fibonacci = new FibSeq();
        LSum lSum = new LSum();
        PowerOf2 pOf2 = new PowerOf2();
        Palindrome palindrm = new Palindrome();
        System.out.println(revChar.reverseDoubleChar("hello"));
        System.out.println(numSum.numSum(165));
        System.out.println(birthdayName.birthdayName("Amy"));
        System.out.println(missFront.missingFront("happiness"));
        System.out.println(swpEnds.swapEnds("Hello There"));
        System.out.println(evryOther.everyOther("Amity"));
        System.out.println(nonStrt.nonStart("Hello", "There"));
        System.out.println(fibonacci.fibonacci(5));
        System.out.println(lSum.luckySum(1, 6, 13));
        System.out.println(palindrm.hasPalindrome("Radar"));
        System.out.println(pOf2.powerOfTwo(32));
    }
}
