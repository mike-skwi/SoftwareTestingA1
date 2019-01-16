import java.util.Scanner;

public class TriangleTester{

	
	public TriangleTester(int side1, int side2, int side3){

		//TODO fix spelling

		if(side1 == side2 && side1 == side3){
			System.out.println("Equallateral triangle");
		}
			// None of the sides are equal
		else if (side1 != side2 && side1 != side3){
			System.out.println("Scalene Triangle");
		}
		else{
			//TODO fix the spelling
			System.out.println("isoceles");
		}


	}
		
	public TriangleTester(){
		// Mark as failed //
	}

	public static void main(String[] args){
		// Make sure this only takes positive integers.
		// TODO make a new for loop. 
		Scanner reader = new Scanner(System.in);
		int entered = 0;
		int[] nums = new int[3];
	
		for(int i = 0; i < 3 ; i++){
			//TODO This is where I will make the case for negative numbers.
			System.out.println("\nEnter an integer: ");
			nums[i] = reader.nextInt();		
			//nums[entered] = n;
			//entered++;
		}	
	
		TriangleTester theTest = new TriangleTester(nums[0],nums[1],nums[2]);


		}
		
	}

