package check;

import constants.Constants;

public class Check {
	
	private static String firstName= "中村";
	private static String lastName= "健太";
	
	
	public static void main(String[] args) {
		
	
	printName(firstName,lastName);
	
	
	
	Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
	pet.introduce();

	RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
	robotPet.introduce();
	}

//	private static String plus(String firstName, String lastName) {
//		return firstName + lastName;
//	}
	
	private static void printName(String firstName, String lastName) {
		String plus = firstName + lastName;
		System.out.println(plus);
	}
	
	
}
