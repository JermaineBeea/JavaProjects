package ClassInheritance;

public class Human{

	public String ethnicity;
	public int age;

    //Default variables
    public int intellectual_qoutient = 108; // Average Global IQ
	public double body_temp = 36.6; // Average body temperature in Celcius
	public double testosterone = 50; // Average testosterone in humans in nanograms per deciliter
	
    // Constructor for Human class
	public Human(String ethnicity, int age){
		this.ethnicity = ethnicity;
		this.age = age;
	}
	
    // Male class inherits Human Class 
	public static class Male extends Human{
		public Male(String ethnicity, int age){
			super(ethnicity, age);
            // Variables specific to being Male
			this.body_temp = 36.8; 
			this.testosterone = 175; 
	    }
    }
	
    //Female class inherits Human Class
	public static class Female extends Human{
		public Female(String ethnicity, int age){
			super(ethnicity, age);
            // Variables specific to being Female
			this.body_temp = 36.3; 
			this.testosterone = 20; 
		}
	}

    // Methods to fetch instance variables
    public String get_ethnicity(){
        return ethnicity;
    }

	public int get_age(){
		return age;
	}

    public int get_IQ(){
        return intellectual_qoutient;
    }
	
	public double get_testosterone(){
		return testosterone;
	}
	
	public double get_body_temperature(){
		return body_temp;
	}
	
}