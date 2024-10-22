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
        Location one = holmer.getNextLoc(0, 0);
        System.out.println(one);
        System.out.println(one.getRow() + "," + one.getCol());
        System.out.println(holmer.getNextLoc(1, 3));
        System.out.println(holmer.getNextLoc(1, 3).getRow() + "," + holmer.getNextLoc(1, 3).getCol());
        System.out.println(holmer.getNextLoc(2, 4));
        System.out.println(holmer.getNextLoc(2, 4).getRow() + "," + holmer.getNextLoc(2, 4).getCol());
        System.out.println(holmer.getNextLoc(4, 3));
        System.out.println(holmer.getNextLoc(4, 3).getRow() + "," + holmer.getNextLoc(4, 3).getCol());

        GridPath pookie = new GridPath(); 
        pookie.grid = new int [][] 
        {
            {12, 30, 40, 25, 5}, 
            {11, 3, 22, 15, 43},
            {7, 2, 9, 4, 0},
            {8, 33, 18, 6, 1}
        }; 
        System.out.println(pookie.sumPath(1,1));
        // my extra test case
        System.out.println(pookie.sumPath(3,0));
    }
}