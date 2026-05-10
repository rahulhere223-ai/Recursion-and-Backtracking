import java.util.*;

public class palindromepartitioning{
    public static boolean isPalindrome(String s,int i,int j){
        int n=s.length();
        if(n == 1) return true;

        while(i < j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
    public static void partitioning(int idx,String s,ArrayList<String> list,ArrayList<ArrayList<String>> result){
        if(idx == s.length()){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=idx;i<s.length();i++){
            if(isPalindrome(s, idx, i)){
                list.add(s.substring(idx,i+1));
                partitioning(i+1, s, list, result);
                list.remove(list.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        String s="aab";
        ArrayList<String> list=new ArrayList<>();
        ArrayList<ArrayList<String>> result=new ArrayList<>();
        partitioning(0,s,list,result);
        System.out.println(result);
        

    }
}