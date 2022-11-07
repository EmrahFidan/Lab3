	
public class BmiFunctions {

	public static double calculateBMI(double weight, double height) {
		
		weight = (0.45359237) * weight;
		height = (0.0254) * height;
		
		double BMI = weight / (height*height); 
		
		return BMI;
    }

    public static String interpretBMI(double BMI) {
		
		String result = null;
		
		if(BMI < 18.5) {
			result = "Underweight";
		}
		else if(BMI >= 18.5 && BMI < 25.0) {
			result = "Normal";
		}
			
		else if(BMI >= 25 && BMI < 30.0) {
			result = "Owerweight";
		}
			
		else if(BMI >= 30.0) {
			result = "Obese";
		}
			
		
		return result;
		
	}
		
}

