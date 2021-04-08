

public class Main {

	public static void main(String[] args) {
		Animals Goat = new Animals();	//Create new object Goat
		Goat.printAnimals("Goat","Mammals","Herbivore","Warm-blooded");
		Goat.layeggs(false);
		Goat.Behaviour();
		Goat.printDetailsScanner();
		Goat.printAverageAgeScanner();
		Goat.AverageWeightScanner();
		Goat.AverageFoodWeightScanner();
		
		
		System.out.println();
		
		Animals Crocodile = new Animals();	//Create new object Crocodile
		Crocodile.printAnimals("Crocodile","Reptiles","Carnivore","Cold-blooded");
		Crocodile.layeggs(true);
		Crocodile.Behaviour();
		Goat.printDetailsScanner();
		Crocodile.printAverageAgeScanner();
		Crocodile.AverageWeightScanner();
		Crocodile.AverageFoodWeightScanner();

	}

}
