package leetcode_9.PalindromeNumber;

public class isPalindrome {
    public static boolean isPalindrome(int x) {
        String numero = String.valueOf(x);
        String numeroAlReves = "";

        for (int i = numero.length() -1 ; i >= 0 ; i--) {
            numeroAlReves += numero.charAt(i);
            if (numeroAlReves.equals(numero)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int x = 121;
        System.out.println(isPalindrome(x));
    }
}


