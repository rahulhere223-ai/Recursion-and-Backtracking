public class tilingproblem{
    public static int waystotile(int n){
        if( n == 0|| n==1){
            return 1;
        }

        return waystotile(n-1)+waystotile(n-2);
    } 
    public static void main(String[] args) {
        int n=3;
        
        System.out.println(waystotile(n));
    }
}