public class checkpalindrome {
    public static boolean ispalindrome(String s,int i,int j){
        if(i > j) return true;

        if(s.charAt(i) != s.charAt(j)){
            return false;
        }
       return ispalindrome(s,i+1,j-1);
    }
    public static void main(String[] args) {
        String s="racecar";
        System.out.println(ispalindrome(s, 0, s.length()-1));
    }
}
