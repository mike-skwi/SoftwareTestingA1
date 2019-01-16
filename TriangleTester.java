import java.util.Scanner;

public class TriangleTester{

	
	public TriangleTester(int side1, int side2, int side3){
		// TODO make a case for negatives
		// TODO Change it from accepting inputs from the cli to system in
		// equillateral
		if(side1 == side2 && side1 == side3){

			System.out.println("Equallateral triangle");
		}
		// None of the sides are equal
		else if (side1 != side2 && side1 != side3){
			System.out.println("Scalene Triangle");
		}
		else{
			System.out.println("Else..");
		}



		System.out.println("Isoceles Triangle");
		}
	public TriangleTester(){
		// Mark as failed //
	}

	public static void main(String[] args){
		// Make sure this only takes positive integers.
		// TODO make a new for loop. 
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int entered = 0;
		int[] nums = new int[3];
	
		for(int i = 0; i<nums.length; i++){
			System.out.println("\nEnter an integer: ");
			nums[i] = reader.nextInt();		
			//nums[entered] = n;
			//entered++;
		}
		

		//Check if there are exactly 3 command line args
		//if(args.length!=3 ){
		//	System.out.println("Incorrect Input. You need to enter 3 inputs");
			// Mark as failed //
			//throw new IllegalArgumentException("Please enter 3 different integers");
		//}
		// Turn command line args into ints
		//else{
			// Here's the main for loop.
			// With this I should be able to:
			// put everthing in the correct array/parse the strings to int
			// test what kind of triangle it is
		//	for( int i = 0; i < 3; i++ ){

				// Catch an error if someone puts in a string/anything else.
		//		try{
		//			nums[i] = Integer.parseInt(args[i]);
		//		}
		//		catch(Exception notInt){
		//			System.out.println("Error: Non integer entered.");
		//		}

		//	}

		}
		//TriangleTester theTest = new TriangleTester(nums[0],nums[1],nums[2]);


	}

