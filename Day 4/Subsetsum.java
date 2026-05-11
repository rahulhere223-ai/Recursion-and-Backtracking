import java.util.*;

public class Subsetsum {
    public static void subset(int idx,int sum,ArrayList<Integer> list,int arr[]){
          if(idx == arr.length){
            list.add(sum);
            return;
          }
        //   pick
          subset(idx+1,sum + arr[idx],list,arr);

        //   not pick
        subset(idx+1,sum,list,arr);
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();

        subset(0,0,list,arr);
        Collections.sort(list);

        System.out.println(list);



    }
}
