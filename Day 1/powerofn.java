public class powerofn{
    public static int power1(int x,int n){
       if(n==0) return 1;
        return x * power1(x, n-1);
    } 
    public static int power2(int x,int n){
        if(n==1) return 2;

        int halfsquare=power2(x, n/2) * power2(x, n/2);

        if(n % 2 != 0){
            halfsquare=x *halfsquare;
        }
        return halfsquare;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;

        System.out.println(power1(x, n));
        System.out.println(power2(x, n));

    }
}