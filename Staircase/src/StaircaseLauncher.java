
public class StaircaseLauncher {

	public static void main(String[] args) {
		Staircase sc1 = new Staircase();
		int k = 7;
		int solForNSC = sc1.getSoln(k);
		System.out.println("The number of ways of reaching "+k+"th step is "+solForNSC);
	}

}
