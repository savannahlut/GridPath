public class Main 
{
    public static void main(String[] args)
    {
        GridPath holmer = new GridPath(); 
        holmer.grid = new int [][] 
        {
            {12, 3, 4, 13, 5}, 
            {11, 21, 2, 14, 16},
            {7, 8, 9, 15, 0},
            {10, 17, 20, 19, 1},
            {18, 22, 30, 25, 6}
        }; 
        System.out.println(holmer.getNextLoc(0, 0));
        System.out.println(holmer.getNextLoc(0, 0).getRow() + "," + holmer.getNextLoc(0, 0).getCol());
        System.out.println(holmer.getNextLoc(1, 3));
        System.out.println(holmer.getNextLoc(1, 3).getRow() + "," + holmer.getNextLoc(1, 3).getCol());
        System.out.println(holmer.getNextLoc(2, 4));
        System.out.println(holmer.getNextLoc(2, 4).getRow() + "," + holmer.getNextLoc(2, 4).getCol());
        System.out.println(holmer.getNextLoc(4, 3));
        System.out.println(holmer.getNextLoc(4, 3).getRow() + "," + holmer.getNextLoc(4, 3).getCol());
    }
}