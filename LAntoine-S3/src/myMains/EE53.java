package myMains;

import myUtils.PairOfDice;
import myUtils.StatCalc;

/**
 * Rolls a pair of dice 10 000 times and reports the average number of rolls, 
 * the standard deviation and the maximum number of rolls needed to get the wanted number
 * @author lepean14
 *
 */
public class EE53 {
	public static void main(String[] args) {
		System.out.println("Total On Dice		Average Number Of Rolls		Standard Deviation		Max Rolls");
		System.out.println("-------------		-----------------------		------------------		---------");
		for (int i=2; i<=9; i++){
			double[] stats = getStatsForI(i);
			System.out.println("      "+i+"                        "+stats[0]+"                  "+stats[1]+"              "+stats[2]);
		}
		for (int i=10; i<=12; i++){
			double[] stats = getStatsForI(i);
			System.out.println("      "+i+"                       "+stats[0]+"                  "+stats[1]+"            "+stats[2]);
		}
	}
	
	/**
	 * 
	 * @param wanted_number Number we want to get with the two dice
	 * @return Array with average number of rolls, standard deviation and the maximum number of rolls needed
	 */
	private static double[] getStatsForI(int wanted_number){
		double[] stats = new double[3];
		StatCalc statCalc = new StatCalc();
		
		for (int i=0; i < 10000; i++){
			int total = 0;
			int count = 0;
			do {
				PairOfDice pairOfDice = new PairOfDice();
				pairOfDice.roll();
				total = pairOfDice.getTotal();
				count++;
			} while (total != wanted_number);
			statCalc.enter(count);
		}
		
		stats[0]=statCalc.getMean();
		stats[1]=statCalc.getStandardDeviation();
		stats[2]=statCalc.getMax();
		return stats;
	}

}
