import java.util.*;
public class QuizScoreStatistics {



    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int score, scoreCount = 0, highestScore = 0, lowestScore = 0, arithmeticAverage = 0;

        while (true) {

            System.out.print("Enter a score(0 to 10): ");

            score = in.nextInt();

            if (score == 99) break;

            if (score >= 0 && score <= 10) {

                if (scoreCount == 0 || score > highestScore) highestScore = score;

                if (scoreCount == 0 || score < lowestScore) lowestScore = score;

                arithmeticAverage += score;

                scoreCount++;

            } else {

                System.out.println("Score must be between 10 and 0");

            }

        }

        System.out.print("Number of valid scores: ");

        System.out.println(scoreCount);

        System.out.print("The highest score: ");

        System.out.println(highestScore);

        System.out.print("The lowest score: ");

        System.out.println(lowestScore);

       

 System.out.print("The average of scores: ");

        System.out.println(arithmeticAverage / (double) scoreCount);

    }

}