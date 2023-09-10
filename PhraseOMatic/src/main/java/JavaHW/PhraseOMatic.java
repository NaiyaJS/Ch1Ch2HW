package JavaHW;

public class PhraseOMatic {
    public static void main(String[] args){
        //make three sets of words to choose from. Add your own
        String[] wordListOne = { "infinite", "eternal", "endless", "timeless", "immortal"};
        String[] wordListTwo = { "finite", "limited","terminable", "bounded", "conditioned"};
        String[] wordListThree = {"nonbeing", "nonexistance","nonentity","oblivion","nothing"};

        //find out how many words are on each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generate three random numbers
        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        //now build a phrase
        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //print out the phrase
        System.out.println("Name three contradicting words. Example: " + phrase);

    }
}
