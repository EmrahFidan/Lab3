
public class Bmi {
	// constructor 1
	public Bmi() {
		
	}
	
    // constructor 2
	public Bmi(String name,double weight,double height) {
		
		_name = name;
		_weight = weight;
		_height = height;
		
	}

    // constructor 3
	public Bmi(String name,int age,double weight,double height) {
		
		_name = name;
		_age = age;
		_weight = weight;
		_height = height;
		
	}
	
	// constructor for defaulr value

	private String _name;
	private int _age;
	private double _weight;
	private double _height;
	
    public static final double KILOGRAMS_PER_POUND(double weight) {
		
		return (0.45359237) *weight;
		
	}
	
	public static final double METERS_PER_INCH(double height) {
		
		return (0.0254) *height;
		
	}
	
	public static double getBMI(double weight, double height) {
		
		double Weight = KILOGRAMS_PER_POUND(weight);
		double Height = METERS_PER_INCH(height);
		
		double Bmı = Weight / (Height*Height);
		
		// I use math.round method
		double BMI = Math.round(Bmı);
		
		return BMI;
		
	}
	
	public static String getStatus(double BMI) {
		
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
