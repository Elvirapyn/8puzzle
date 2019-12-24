package PuzzleProblem;
import java.util.ArrayList;
import java.util.Random;

public class Generator{
	private int num = 9;

	public int[][] generateInitMatrix() {
		int list[] = new int[this.num]; 
		int matrix[][] = new int[3][3];
		ArrayList<Integer> ranArrayList = new ArrayList<Integer>();
		Random ran = new Random();     //随机数种子
		int temp;
		int i = 0;
		while (i < this.num){
			temp = ran.nextInt(num);
			if (!ranArrayList.contains(temp)) {
				list[i] = temp;
				ranArrayList.add(temp);
				i++;
			}
		}
		for(i=0;i<3;i++)
			for(int j=0;j<3;j++)
				matrix[i][j]=list[i*3+j];	
		return matrix;  
	}
	
	public int[][] generateGoalMatrix() {
		int matrix[][] ={{1,2,3},{4,5,6},{7,8,0}};
		return matrix;  
	}
}
