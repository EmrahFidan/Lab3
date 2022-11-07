import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try{

			// I created arrays
			String nameArray[] = new String[3]; 
			int ageArray[] = new int[3];
			double weightArray[] = new double[3]; 
			double heightArray[] = new double[3];
			String interpretArray[] = new String[3];
			
			Scanner scan = new Scanner(System.in);
			
			for( int i = 0; i < 3; i++) {
					
				System.out.println("Enter name, age, weight, height: (as space separated): ");
				String input = scan.nextLine();
				
				interpretArray[i] = input;
				
				String [] inputs = input.split(" ");
				
				nameArray[i] = inputs[0].concat(" ").concat(inputs[1]);
				
				int age = Integer.valueOf(inputs[2]); 
				ageArray[i] = age;
				
				double weight = Double.valueOf(inputs[3]);
				weightArray[i] = weight;
				
				double height = Double.valueOf(inputs[4]);
				heightArray[i] = height;
				
				// I called BmiFunctions Class
				double BMI = BmiFunctions.calculateBMI(weight, height);
				interpretArray[i] = BmiFunctions.interpretBMI(BMI);
				System.out.println();
				}
				// elements added to series

				// output part
				for (int i=0;i < 3; i++) {
					System.out.println("---ENTER PERSON "+(i+1)+"'S VALUES---");
					System.out.println("** The BMI result for "+nameArray[i]+" ("+" Age: "+ageArray[i]+" Weight: "+weightArray[i]+" Height: "+heightArray[i]+")"+" is");
					System.out.println(interpretArray[i]);
				}
		}
			catch (Exception e) {
				// in case of incorrect value entry
				System.out.println("invalid input, please restart program");
			}

	}

}
