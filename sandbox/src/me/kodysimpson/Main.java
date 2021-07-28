package me.kodysimpson;

public class Main {

    public static void main(String[] args) {

        //Loops - a way to repeat code

        //Score below 50 = bad score
        //Score above 50 = good score
        double[] test_scores = {13.4, 100.0, 90.5, 32.3, 5.0};
        int index = 0; //index of the array
        while(index < test_scores.length){ //index = 0, length = 5

            if (test_scores[index] <= 50){
                System.out.println("Bad Score: " + test_scores[index]);
            }else{
                System.out.println("Good Score: " + test_scores[index]);
            }

            index++;
        }

    }

}
