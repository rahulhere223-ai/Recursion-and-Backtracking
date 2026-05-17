public class jumpgameIII{
    public static boolean canReach(int start,int arr[]){
        if(start < 0  || start >=arr.length || arr[start] < 0){
            return false;
        }
        if(arr[start] == 0){
            return true;
        }

        int jumpdistance=arr[start];
        arr[start]=-1;
        return canReach(start + jumpdistance, arr) || canReach(start - jumpdistance, arr);
    }
    public static void main(String[] args) {
        int arr[]={4,2,3,0,3,1,2};
        int start=5;

        System.out.println(canReach(start, arr));

    }
}