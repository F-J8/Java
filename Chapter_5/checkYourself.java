public String checkYourself(int guess) {
    String result = "miss";

    for(int cell : locationCells){
        if(guess == cell){
            resut = "hit";
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

