public class Gridways {
    public static int ways(int i,int j,int n,int m){
        if(i > m-1 || j>n-1){
            return 0;
        }
        if(i == m-1 && j==n-1){
            return 1;
        }
        int w1=ways(i, j+1, n, m);
        int w2=ways(i+1, j, n, m);
        return w1 +w2;
    }
   public static void main(String[] args) {
    int m=3,n=3;
    System.out.println(ways(0, 0, n, m));

   }    
}
