    import java.util.*;
    public class Main {
        
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Choose a number between 1 and 50");
            
            int r = (int)(Math.random()*50);
            int high = 0;
            int low = 0;
            
            while(true){
                String userin = input.nextLine();
                int guess = Integer.parseInt(userin);
                
                if(r == guess){
                    System.out.println("You got it " + high + " tries high and " 
                    + low + " low tries");
                    break;
                }
                if(guess > r){
                    System.out.println("Too high");
                    high++;
                }
                else if(guess < r){
                    System.out.println("Too low");
                    low++;
                }
        }
    }
}
//set a range for how large or small the numbers can be
//set a random number to a variable
//make a user entry space, allow user to enter only numbers
//keep track of how many guesses user submits
//tell user too large for a big guess
//tell user too small for a small guess
//tell user if they guessed correctly and how many tries it took