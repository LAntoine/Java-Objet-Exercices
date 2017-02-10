package myMains;

import java.util.Scanner;

import myInterfaces.IntQuestion;
import myUtils.AdditionQuestion;

public class EE57 {

	public static void main(String[] args) {
		IntQuestion[] questions = new AdditionQuestion[10];
		for (int i=0; i<10;i++){
			questions[i] = new AdditionQuestion();
		}
		Scanner sc = new Scanner(System.in);
		int[] answers = new int[10];
		for (int i=0; i<10;i++){
			System.out.println(questions[i].getQuestion());
			answers[i] = sc.nextInt();
		}
		sc.close();
		for (int i=0; i<10;i++){
			if (questions[i].getCorrectAnswer() == answers[i]){
				System.out.println("You wrote "+answers[i]+" to the question "+questions[i].getCorrectAnswer()+"and you where right !");
			}
			else {
				System.out.println("You wrote "+answers[i]+" to the question "+questions[i].getCorrectAnswer()+"but you where wrong :( The answer was "+questions[i].getCorrectAnswer());
			}
		}

	}

}
