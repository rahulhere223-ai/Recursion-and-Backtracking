public class Soduku {
    public static boolean sodukusolver(int soduku[][],int row,int col){
        if( row == 9 && col == 0){
            return true;
        }
        int nextrow=row,nextcol=col+1;
        if(col +1 == 9){
            nextrow=row+1;
            nextcol=0;
        }

        if(soduku[row][col] != col){
            return sodukusolver(soduku, nextrow, nextcol);
        }


        for(int digit=1;digit<=9;digit++){
            if(isSafe(soduku,row,col,digit)){
                soduku[row][col]=digit;
                if(sodukusolver(soduku, nextrow, nextcol)){
                    return true;
                }
                soduku[row][col]=0;
            }
        }
        return false;
    }
    public static boolean isSafe(int soduku[][],int row,int col,int value){
        // column
        for(int i=0;i<=8;i++){
            if(soduku[i][col] == value){
                return false;
            }
        }

        for(int j=0;j<=8;j++){
            if(soduku[row][j] == value){
                return false;
            }
        }

        // grid

        int srow=(row/3)*3;
        int scol=(col/3)*3;

        for(int i=srow;i<3;i++){
            for(int j=scol;j<3;j++){
                if(soduku[i][j] == value){
                    return false;
                }
            }
        }
        return true;
    }
    public static void printsoduku(int soduku[][]){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                System.out.print(soduku[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int soduku[][]={{0,0,8,0,0,0,0,0,0},
                        {4,9,0,1,5,7,0,0,2},
                        {0,0,3,0,0,4,1,9,0},
                        {1,8,5,0,6,0,0,2,0},
                        {0,0,0,0,2,0,0,6,0},
                        {9,6,0,4,0,5,3,0,0},
                        {0,3,0,0,7,2,0,0,4},
                        {0,4,9,0,3,0,0,5,7},
                        {8,2,7,0,0,9,0,1,3}};

     System.out.println(sodukusolver(soduku,0,0));
     printsoduku(soduku);

    }
}
