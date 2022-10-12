
public class Runner {
 public static void main(String[] args) {
//	BackTracking bb=new BackTracking();
//	int maze[][]= {{1,1,1},{1,1,0},{0,1,1}};
//	BackTrackingModified bbm=new BackTrackingModified();
//	bbm.disp(maze);
//	bbm.printVisited();
	 Combination c=new Combination();
	 int []array= {1,2,3};
	 c.find(array, 0, "",String.valueOf(array[0]) );
	 c.find(array, 0, ""," " );
}
}
