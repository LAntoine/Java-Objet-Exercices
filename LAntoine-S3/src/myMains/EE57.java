package myMains;

import java.util.Scanner;

import myInterfaces.IntQuestion;
import myUtils.AdditionQuestion;
import tester.ITesterReponse;
import tester.TesterReponseInteger;

public class EE57 {

	public static void main(String[] args) {
		IntQuestion[] questions = new IntQuestion[10];
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
		ITesterReponse tester;
		for (int i=0; i<10;i++){
			tester = new TesterReponseInteger(questions[i].getQuestion(), answers[i], questions[i].getCorrectAnswer());
			tester.printResultat();
		}

	}

}
