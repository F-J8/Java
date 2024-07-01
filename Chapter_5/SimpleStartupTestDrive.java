public class SimpleStartupTestDrive {
    public static void main(String[] args) {
        SimpleStartup dot = new SimpleStartup(); // instantiate a Simple startup object

        int[] locations = {2,3,4}; // make an int array for the location of the startup 3 consecutive ints out of a possible 7
        dot.setLocationCells(locations); // invoke the setter method on the Startup.

        int userGuess = 2; //make a fake user guess

        String result = dot.checkYourself(userGuess); // invoke the checkYourself() method on the startup object and pass it the fake guess

        String testResult = "failed";
        if(result.equals("hit")){
            testResult = "passed"; // if the fake guess (2) gives back a "hit", it's working.
        }

        System.out.println(testResult); // Print out the test result ("passed" or "failed")
    }
}
