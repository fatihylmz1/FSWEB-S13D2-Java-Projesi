public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("---------------------------------------");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
        System.out.println("---------------------------------------");
        System.out.println(numberToWords(12345));
    }
    public static boolean isPalindrome(int sayi) {
        int originalSayi = sayi;
        int tersSayi = 0;

        while (sayi<0 || sayi>0) {
            int basamak = sayi % 10;
            tersSayi = tersSayi * 10 + basamak;
            sayi /= 10;
        }

        return originalSayi == tersSayi;
    }

    public static boolean isPerfectNumber(int num){
        int sumOfDividers = 0;
        for(int i=1; i<num; i++){
            if(num % i == 0){
                sumOfDividers += i;
            }

        }
        return sumOfDividers == num;
    }

    public static String numberToWords(int num){
        String sayi = Integer.toString(num);
        char[] karakterDizisi = new char[sayi.length()];
        StringBuilder wordOfNumber = new StringBuilder();

        for (int i = 0; i < sayi.length(); i++) {
            karakterDizisi[i] = sayi.charAt(i);
        }
        for (char karakter : karakterDizisi) {
            switch (karakter){
                case '1':
                    wordOfNumber.append("one ");
                    break;
                case '2':
                    wordOfNumber.append("two ");
                    break;
                case '3':
                    wordOfNumber.append("three ");
                    break;
                case '4':
                    wordOfNumber.append("four ");
                    break;
                case '5':
                    wordOfNumber.append("five ");
                    break;
                case '6':
                    wordOfNumber.append("six ");
                    break;
                case '7':
                    wordOfNumber.append("seven ");
                    break;
                case '8':
                    wordOfNumber.append("eight ");
                    break;
                case '9':
                    wordOfNumber.append("nine ");
                    break;
                default:
                    break;
            }
        }

        return wordOfNumber.toString();
    }
}