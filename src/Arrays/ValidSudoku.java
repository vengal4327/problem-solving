class Solution {
    public boolean isValidSudoku(char[][] board) {
     
     // In hashset store strings in format -- "5-in row-2","5-in column-3", "5-in box-1-2"   
     Set<String> result = new HashSet();  
        
      for(int i=0; i<9;i++)
      {
       for(int j=0; j<9;j++)
       {
         if(board[i][j]!='.')
         {
         if(!result.add(board[i][j] + "-in row-" + i) ||  
            !result.add(board[i][j] + "-in column-" + j) ||
            !result.add(board[i][j] + "-in box-" + i/3 + " - " + j/3))   
         {
             return false;
         }
         }
       }  
      }
        
      return true;  
    }
}
