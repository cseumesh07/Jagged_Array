import java.util.Scanner;
class Jagged_Array{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int array[][] =new int[4][];
		array[0]= new int[2];
		array[1]= new int[4];
		array[2]= new int[3];
		array[3]= new int[4];
		for (int i=0;i<=array.length-1;i++){
		for (int j=0;j<=array[i].length-1;j++){
			System.out.println("Enter the value of company " + i + " 2and employee " + j);
			array[i][j] = sc.nextInt();
		}	
		}
		System.out.println("Array contents are: ");
		for (int i=0;i<=array.length-1;i++){
			for (int j=0;j<=array[i].length-1;j++){
				System.out.println(array[i][j] + " ");
			}
			System.out.println();
		}
	}
}