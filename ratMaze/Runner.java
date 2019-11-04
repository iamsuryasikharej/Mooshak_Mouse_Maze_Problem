package ratMaze;

public class Runner {
	public static void main(String[] args)
	{
		int[][] maze={ { 1, 0, 0, 0 }, 
                       { 1, 1, 1, 1}, 
                       { 0, 1, 0, 0 }, 
                       { 1, 1, 1, 1 } }; 
//		int[][] maze= {{1,0,0},
//				       {1,1,0}
//		              ,{0,1,1}};
		Maze m=new Maze();
		m.disp(maze);
		m.printSol();
	}
}
