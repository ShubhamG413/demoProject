
public class Assignment3 extends Assignment2 {

	final static int overs=5;
	final static int innings=5;
	static int[] scores;
	
	public static void main(String[] args) {
		Assignment3 a3=new Assignment3();
		a3.balls=6*innings*overs;
		scores=a3.scoresGenerator();
		calculateLastScore(a3);
		a3.computeScore(scores);
		a3.printRuns();
	}
	
	public static void calculateLastScore(Assignment3 a3) {
		int start_counter=0;
		int end_counter=30;
		int totalInningsSum=0;
		int totalInningsAverageSum=0;
		
		while(end_counter!=180) {
			int inning_sum=0;
			for(;start_counter<end_counter;start_counter++) {
				inning_sum+=scores[start_counter];
			}
			totalInningsSum+=inning_sum;
			end_counter+=30;
		}
		totalInningsAverageSum=totalInningsSum/innings;
		
		System.out.println("Average Score of last 5 matches is "+totalInningsAverageSum);
	}
}
