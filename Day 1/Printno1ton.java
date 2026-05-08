public class Printno1ton{
    public static void printno1(int n){
        if(n == 0) return;

        printno1(n-1);
        System.out.print(n+" ");
    }
    public static void printno2(int n){
        if(n == 0) return;

        System.out.print(n+" ");
        printno2(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        printno1(n);
        printno2(n);
    }
}