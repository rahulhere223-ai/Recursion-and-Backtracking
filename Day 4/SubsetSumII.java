import java.util.*;

public class SubsetSumII {
public static void backtrack(int idx,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result,int arr[]){
    if(idx == arr.length){
        result.add(new ArrayList<>(list));
        return;
    }

    list.add(arr[idx]);
    backtrack(idx+1, list, result, arr);

    // Avoid duplicate
    while(idx+1 <arr.length && arr[idx] == arr[idx+1]){
        idx++;
    }

    list.remove(list.size()-1);
    backtrack(idx+1, list, result, arr);

    }
    public static void main(String[] args) {
        int arr[]={4,4,4,1,4};

        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(arr);

        backtrack(0, list, result, arr);
        System.out.println(result);


    }
}
