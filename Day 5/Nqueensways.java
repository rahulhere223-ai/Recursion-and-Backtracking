public class Nqueensways {
    public static boolean issafe(char board[][],int row,int col){
        // vertically up
        for(int i=row-1;i>=0;i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }

        // diagonally left up
        for(int i=row-1,j=col-1;i>=0 && j>=0 ;i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonally right up
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }
    public static int nqueen2(char board[][],int row,int count){
        if(row == board.length){
            count++;
            return count;
        }

        for(int j=0;j<board.length;j++){
            if(issafe(board,row,j)){
                board[row][j]='Q';
                count=nqueen2(board, row+1,count);
                board[row][j]='.';
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int n=8;
        int count=0;
        char board[][]=new char[n][n];

        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                board[i][j]='.';
            }
        }

        System.out.println(nqueen2(board,0,count));
    }
}
