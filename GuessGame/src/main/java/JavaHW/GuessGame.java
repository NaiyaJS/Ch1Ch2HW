package JavaHW;

public class GuessGame {
    //GuessGame has three variables for the three player objects
   Player p1;
   Player p2;
   Player p3;

   //create three player objects and assign them to the three player instance variables
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        //declare three variables to hold the  three guesses the players make
        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        //declare three variable to hold a true or false base on the player's answer
        boolean p1isRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        //make a 'target' number that the players have to guess
        int targetNumber = (int) (Math.random() * 10);
        System.out.println("I'm thinking of a number between 0 and 9...");

        while(true) {
            System.out.println("Number to guess is " + targetNumber);

            //call each player's guess() method
            p1.guess();
            p2.guess();
            p3.guess();

            //get each player's guess (the result of their guess() method running) by accessing the number variable of each player
            guessp1 = p1.number;
            System.out.println("Player one guessed " + guessp1);

            guessp2 = p2.number;
            System.out.println("Player two guessed " + guessp2);

            guessp3 = p3.number;
            System.out.println("Player three guessed " + guessp3);

            //set false by default so this is for if player's guess is right
            if (guessp1 == targetNumber) {
                p1isRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }

            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("We have a winner!");
                System.out.println("Player one got it right?" + p1isRight);
                System.out.println("Player two got it right?" + p2isRight);
                System.out.println("Player three got it right?" + p3isRight);
                System.out.println("Game is over.");
                break; //game is over, so break out of the loop
            } else{
                //we must keep going because nobody got it right
                System.out.println("Players will have to try again");
            }//end if/else loop
        }//end loop
    }//end method
}//end class
