public class GridPath
{
    private int[][] grid;
    public Location getNextLoc(int row, int col)
    { 
        Location rightward = new Location(row, col + 1); 
        Location under = new Location(row + 1, col);
        if (grid[0].length - 1 == col)
        {
            return under; 
        }
        if (grid.length - 1 == row)
        {
            return rightward; 
        }
        if (grid[row + 1][col] < grid[row][col + 1])
        {
            return under; 
        } else {
            return rightward; 
        }
    }

    public int sumPath(int row, int col)
    {}
}