
public class Staircase {
	public int solForN[] = new int[500];
	public Staircase() {
		for(int i=0;i<500;i++) {
			solForN[i] = -1;
		}
		solForN[0] = 0;
		solForN[1] = 1;
		solForN[2] = 2;
	}
	public int getSoln(int n) {
		int result = 0;
		if(n>1) {
			if(solForN[n]==-1) {
				result = getSoln(n-1) + getSoln(n-2);
				solForN[n] = result;
				return result;
			}
			else {
				return solForN[n];
			}
			
		}
		else {
			return solForN[n];
		}
	}
	
}
