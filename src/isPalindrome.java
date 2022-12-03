public class isPalindrome {
        public static void main(String[] args) {
           String text = "123qweewq321";
            System.out.println(palindrome(text));

            StringBuilder stringBuilder = new StringBuilder(text);
            String w = stringBuilder.reverse().toString();
            System.out.println(w.equals(text));

        }


    public static boolean palindrome(String str){
        int x = 0;
        int y = str.length()-1;

        while (x<y){
            if (str.charAt(x) != str.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;


    }

}
