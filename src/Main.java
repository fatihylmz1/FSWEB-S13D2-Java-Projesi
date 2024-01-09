public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
        System.out.println("---------------------------------------");
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
}