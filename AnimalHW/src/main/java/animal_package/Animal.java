package animal_package;

public class Animal {
    public String animalType;
     public double microChipNum[];
     public boolean isAgressive;

     public String animalSound;

     public void printAnimalSound(){
         System.out.println(animalSound);

     }
     public void printMicrochipNum(){
         for (int i = 0; i < microChipNum.length; i++){
             System.out.println(microChipNum[i]);

         }
     }
}
