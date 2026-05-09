import java.util.*;

public class printallsubseq{
    public static void printsubseq(int idx,ArrayList<Integer> list,int arr[]){
        if(idx >=arr.length){
            System.out.print(list);
            return ;
        }
        list.add(arr[idx]);
        printsubseq(idx+1, list, arr);
        list.remove(list.size()-1);
        printsubseq(idx+1, list, arr);
    }
    public static void main(String[] args) {
        int arr[]={3,1,2};
        ArrayList<Integer> list=new ArrayList<>();

        printsubseq(0, list, arr);
        
    }
}