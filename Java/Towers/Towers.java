public class Towers{
    // Solution to the Towers of Hanoi game
    // number of discs
    private int numDiscs;
    // creates a tower with specified amount of discs
    public Towers(int n){
        this.numDiscs = n;
        // move the number of discs from peg 1 to peg 3
        // using peg 2 as a temp storage location
        // calls recursive method
        this.moveDiscs(this.numDiscs, 1, 3, 2);
    }

    private void moveDiscs(int num, int fromPeg, int toPeg, int tempPeg){
        if (num > 0){
            // recursive call - creates another whole copy of method in RAM
            moveDiscs(num - 1, fromPeg, toPeg, tempPeg);
            System.out.println("Move a disc from peg " + fromPeg + " to peg " + toPeg);
            moveDiscs(num - 1, tempPeg, toPeg, fromPeg);
        }
    }


}