package me.kodysimpson;

public class Main {

    public static void main(String[] args) {

        //Loops - a way to repeat code

        //The anatomy of a while loop
        //As long as the condition is true, the code inside repeats
        //while(condition){
        // CODE
        //}

        //the number to be printed out to the console
        int number = 1;
        while(number < 100){ //as long as the number is less than 100, run the code in the loop
            System.out.println(number); //print the number
            number++; //increment the number by 1 to be printed the next time
        }
        System.out.println("The loop has ended.");

        //Be careful! You can accidentally make an infinite loop that runs
        // forever if the condition never becomes false.
        int counter = 0;
//        while(true){
//            System.out.println("Cheese is yummy. " + counter);
//            counter++;
//        }

        //Loops are commonly used to go through arrays
        //for loops are usually used for this, but let me show you
        //how to do it with a good ole while loop
        double[] test_scores = {13.4, 100.0, 90.5, 32.3, 5.0};
        int index = 0; //represents the position in the array
        while(index < test_scores.length){
            //Make this more advanced by checking to see if the score
            //is a good or bad score.
            if (test_scores[index] < 50){
                System.out.println("Bad Score: " + test_scores[index]);
            }else{
                System.out.println("Score: " + test_scores[index]);
            }
            //Increment the index so that the next time the loop
            //runs, it can grab the next element.
            index++;
        }

    }
}
