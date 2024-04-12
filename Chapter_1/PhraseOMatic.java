import java.util.Random;

public class PhraseOMatic {
    public static void main(String[] args) {
        //make three sets of words to choose from.
        String [] wordListOne = {"agnostic", "opinionated","voice activated","haptically driven", "extensible", "reactive", "agent based", "functional", "AI enabled", "strongly typed"};
        String [] wordListTwo = {"loosely coupled", "six sigma", "asynchronous", "event driven", "pub-sub", "IoT", "cound native", "service oriented", "containerized", "serverless", "microservices", "distributed ledger"};
        String [] wordListThree = {"framework", "library", "DSL", "DSL", "REST API", "repository", "pipeline", "service mesh", "architecture", "perspective" , "design", "orientation"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //generating three random numbers
        Random randomGenerator = new Random();

        int rand1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(threeLength);
        int x = randomGenerator.nextInt(5); // random number betwwen 1 and 5 without including 5

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2]+" " + wordListThree[rand3];

        System.out.println(" What we need is a " + phrase);


    }
}