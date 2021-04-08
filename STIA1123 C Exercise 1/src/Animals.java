
import java.util.Scanner;

public class Animals {
	Scanner s = new Scanner(System.in);
	String name;
	String type;
	String Dietary;
	String Thermoregulation;
	boolean layeggs;
	double [] foodweight;
	void printAnimals(String name, String type, String Dietary, String Thermoregulation) {
		System.out.println("Animal: " + name + "\n" + "Type: " + type + "\n" + "Dietary: " + Dietary + "\n" 
							+ "Thermoregulation: " + Thermoregulation + "\n");
	}
	
	void printDetailsScanner() {
		System.out.println("Enter your animal's name, type, age(in years) and weight(in kg): ");
		String n = s.nextLine();
		String t = s.nextLine();
		int a = s.nextInt();
		double w = s.nextDouble();
		System.out.println("Animals Details:");
		System.out.println("Name: " + n + "\n" + "Type: " + t + "\n" + "Age: " + a + " years old" + "\n" + "Weight: " + w + "kg");
	}
	
	void printAverageAgeScanner() {
		int count = 0, respond, i;
		int totalage = 0;
		double averageage;
		System.out.print("How much animals do you want to use to count average age?:");
		respond = s.nextInt();
		int [] age = new int [respond];
		System.out.print("Please enter " + respond + " animals' age (in years): ");
		for (i=0; i<age.length; i++) {
			age[i] = s.nextInt();
			totalage += age[i];
			count++;
		}
		averageage = (double)totalage/count;
		System.out.printf("The average age of animals is = %.2f %n",averageage);
	}
	
	void AverageWeightScanner() {
		double [] weight = new double [100];
		double totalweight = 0, averageweight = 0;
		int count = 0, respond;
		do {
			System.out.print("Please enter the weight of an animal(in kg): ");
			weight[count] = s.nextDouble();
			totalweight += weight[count];
			count++;
			System.out.print("Do you want to continue?(1 for yes 0 for no): ");
			respond = s.nextInt();
		} while (respond == 1);
		averageweight = totalweight/count;
		System.out.printf("The total weight of animals are = %.2f kg %n",totalweight);
		System.out.printf("The average weight of animals are = %.2f kg %n",averageweight);
	}
	
	void AverageFoodWeightScanner(){
		double [] foodweight = new double [3];
		double totalfoodweight = 0, averagefoodweight = 0;
		int count = 0;
		System.out.println("Please enter the weight of 3 meals for animal each day(in kg): ");
		for(int i=0; i<foodweight.length; i++) {
			foodweight[i] = s.nextDouble();
			totalfoodweight += foodweight[i];
			count++;
		}
		averagefoodweight = totalfoodweight/count;
		System.out.printf("The total food weight consumed by animal per day = %.2f kg %n",totalfoodweight);
		System.out.printf("The average food weight consumed by animal per meal = %.2f kg %n",averagefoodweight);
	}
	
	void layeggs (boolean layeggs) {
		if (layeggs == true) {
			System.out.println("The animal reproduce by laying eggs");
		}
		else {
			System.out.println("The animal reproduce by giving birth to child");
		}
	}
	
	void Behaviour(){
		String Behaviour = ("1.Walk \n" + "2.Eat \n" + "3.Breath \n" + "4.Excrete waste");
		System.out.println("Bahavior : \n" + Behaviour);
	}
}
