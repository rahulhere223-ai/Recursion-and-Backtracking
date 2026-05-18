import java.util.*;

public class permutation{
    public static void waystopair(ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result,int arr[],boolean freq[]){
        if(list.size() == arr.length){
            result.add(new ArrayList<>(list));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i]=true;
                list.add(arr[i]);
                waystopair(list, result, arr, freq);
                list.remove(list.size() -1);
                freq[i]=false;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3};
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        boolean freq[]=new boolean[arr.length];
        waystopair(list, result, arr, freq);
        System.out.println(result);
    }
}