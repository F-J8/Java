import java.util.Scanner;

public class SimpleStartup {
    private int[] locationCells;
    private int numOfHits = 0;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfguesses= 0;
        SimpleStartup theStartup = new SimpleStartup();
        int randomNum = (int) (Math.random()*5);
        int[] locations = {randomNum, randomNum+1, randomNum+2};
        theStartup.setLocationCells(locations);
        boolean isAlive = true;
        while(isAlive){
            int n = scanner.nextInt();
            String result = theStartup.checkYourself(n);
            numOfguesses++;
            if(result == "kill"){
                isAlive = false;
                System.out.println(numOfguesses+" guesses");
            }

        }
    }

    // getIndex i use it to get the value and then change the variable to 200 to take it out of scope
    public static int getIndexOfValue(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Return -1 if the value is not found
    }
    public void setLocationCells(int[] locs){
        locationCells = locs;
    }
    public String checkYourself(int guess){
        String result = "miss"; //make a variable to hold the result we'll reutn put "miss" in as the default

        for(int cell : locationCells){
            if(guess == cell){
                int index = getIndexOfValue(locationCells, cell);
                locationCells[index]=200;
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if(numOfHits == locationCells.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}
