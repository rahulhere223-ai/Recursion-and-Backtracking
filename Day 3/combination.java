import java.util.*;

public class combination{
public static void getcomb(int idx,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result,int arr[],int target,int sum){
    if(sum == target){
        result.add(new ArrayList<>(list));
        return;
    }
    if(idx >= arr.length || sum > target){
        return;
    }
    list.add(arr[idx]);
    sum += arr[idx];
    getcomb(idx, list, result, arr, target, sum);
    list.remove(list.size()-1);
    sum -= arr[idx];
    getcomb(idx+1, list, result, arr, target, sum);
}

    public static void main(String[] args) {
        int arr[]={2,3,6,7};
        int target=7;
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();

        getcomb(0,list,result,arr,target,0);
        System.out.println(result);

    }
}