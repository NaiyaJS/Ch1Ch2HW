package animal_package;

public class Main {

    public static void main(String[] args) {
    Animal dog = new Animal();
    dog.animalType = "Dog";
    dog.microChipNum = new double[] {4.5, 5.7, 8.2};
    dog.isAgressive = false;
    dog.animalSound = "woof";

    dog.printAnimalSound();
    dog.printMicrochipNum();

    Animal cat = new Animal();
    cat.animalType = "Cat";
    cat.microChipNum = new double[] {7.2, 3.0};
    cat.isAgressive = true;
    cat.animalSound = "meow";

    cat.printAnimalSound();
    cat.printMicrochipNum();

    Animal fish = new Animal();
    fish.animalType = "Fish";
    fish.microChipNum = new double[] {4.8, 3.4, 7.7, 8.9};
    fish.isAgressive = true;
    fish.animalSound = "glup";

    fish.printAnimalSound();
    fish.printMicrochipNum();

    }
}
