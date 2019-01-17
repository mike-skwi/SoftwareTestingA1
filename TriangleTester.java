import java.util.Scanner;

public class TriangleTester{

	
	public TriangleTester(int side1, int side2, int side3){

		if(side1 == side2 && side1 == side3){
			System.out.println("This is an equilateral triangle.");
		}

		else if (side1 != side2 && side1 != side3 && side2 != side3){
			System.out.println("This is a scalene triangle.");
		}
		else{
			System.out.println("This is an isosceles triangle.");
		}


	}

	public static void main(String[] args){
 
		Scanner reader = new Scanner(System.in);
		int entered = 0;
		int[] nums = new int[3];
	
		for(int i = 0; i < 3 ; i++){
			System.out.println("\nEnter a non-negative/non-zero integer: ");
			int enteredNumber = reader.nextInt();		
			if(enteredNumber > 0){
				nums[i] = enteredNumber;
			}
			else{
				System.out.println("PLease don't enter non-zero/non-negative number.");
				i--;
			}

		}	
	
		TriangleTester theTest = new TriangleTester(nums[0],nums[1],nums[2]);


		}
		
	}
