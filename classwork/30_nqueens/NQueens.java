public class NQueens{
  private int[][]board;

  /*Initialize board with a size by size 2D array. All values should be 0*/
  public NQueens(int size){

  }
  

  /**
  *@return true when the queen added correctly, false Otherwise
  *@precondition r and c are valid indices of the board array
  *@postcondition the board is only changed when the function returns true
  * in which case the queen is added and all it's threatened positions are incremented
  */
  private boolean addQueen(int r, int c){
    return false;
  }

  /**Remove the queen that was added to r,c
  *@precondition r and c are valid indices of the board array and there is a queen at position r,c
  *@postcondition the board is modified to remove that queen and all it's
  *threatened positions are decremented
  */
  private void removeQueen(int r, int c){

  }


  /**Find the first solution configuration possible for this size board. Start by placing
  *  the 1st queen in the top left corner, and each new queen in the next ROW. When backtracking
  *  move the previous queen to the next valid space. This means everyone will generate the same
  *  first solution. You must clear the board before attempting to solve.
  *@postcondition: the board remains in a solved state.
  *@return false when the board is not solveable and leaves the board filled with zeros;
  *        returns true when the board is solveable, and leaves the board in a solved state
  */
  public boolean solve(){
    return false;
  }


  /**Find all possible solutions to this size board. You must clear the board before attempting to solve.
  *@return the number of solutions found, and leaves the board filled with only 0's
  */
  public int countSolutions(){
    return -1;
  }

  /*reset all values of the board to 0. */
  private void clear(){
   
  }
  
  
  /**
  *@return The output string formatted as follows:
  *All numbers that represent queens are replaced with 'Q'
  *all others are displayed as underscores '_'
  *There are spaces between each symbol:
  _ _ Q _
  Q _ _ _
  _ _ _ Q
  _ Q _ _
  * returned string should look like this:
  * "_ _ Q _\nQ _ _ _\n_ _ _ Q\n_ Q _ _"
  */
  public String toString(){
    return "";
  }
  

}
