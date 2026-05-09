public class climbingstairs{
    public static int waystoclimb(int n){
        if(n ==1 || n==2) return n;

        return waystoclimb(n-1) + waystoclimb(n-2);
    }
    public static void main(String[] args) {
        int n=5;

        System.out.println(waystoclimb(n));

    }
}