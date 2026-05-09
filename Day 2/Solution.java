import java.util.*;

public class Solution {
public static void printallsubseq(int idx,List<Integer> list,int nums[], List<List<Integer>> result){
    if(idx == nums.length){
        result.add(new ArrayList<>(list));
        return ;
    }
    list.add(nums[idx]);
    printallsubseq(idx+1,list,nums,result);
    list.remove(list.size()-1);
    printallsubseq(idx+1,list,nums,result);
    
}
    public static void main(String[] args) {
        int nums[]={3,5,6,7};
        int target=9;
       ArrayList<Integer> list=new ArrayList<>();
       ArrayList<List<Integer>> result=new ArrayList<>();
       int count=0;

       printallsubseq(0,list,nums,result);

       for(int i=0;i<result.size();i++){

            List<Integer> curr = result.get(i);
           int min=Integer.MAX_VALUE;
           int max=Integer.MIN_VALUE;

           for(int j=0;j<curr.size();j++){
            min=Math.min(min,curr.get(j));
            max=Math.max(max,curr.get(j));
           }

           if(min + max <= target){
            count++;
           }
       }
    System.out.println(count-1);
       
    }
}
