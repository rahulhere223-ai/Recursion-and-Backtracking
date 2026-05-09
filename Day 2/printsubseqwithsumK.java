import java.util.*;

public class printsubseqwithsumK {
    public static void printsubsesumk(int idx,ArrayList<Integer> list,int arr[],int sum){
        if(idx == arr.length){
            if(sum==0){
                System.out.println(list);
            }
            return;
        }
        // pick
        list.add(arr[idx]);
        printsubsesumk(idx+1, list, arr, sum-arr[idx]);
        list.remove(list.size() -1);
        
        // not pick
        printsubsesumk(idx+1, list, arr, sum);
    }
    public static void main(String[] args) {
        int arr[]={1,2,1};
        ArrayList<Integer> list=new ArrayList<>();
        printsubsesumk(0, list, arr, 2);
    }
}
