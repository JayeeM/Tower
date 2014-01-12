import java.util.Comparator;


public class ojasmal {
	public static void main(String [] args) {
		NumberComparer n  = new NumberComparer();
		System.out.println(reverseNumber(1234)); 
	}
	// Assume that there are 4 digits
	public static int reverseNumber(int x) {
		int newnumber = 0;
		int factor = 1;
		int limit = (int) Math.pow(10, countDigits(x)-1);
		while (factor <= 1000) {
			newnumber += ((x/factor)% 10) * (1000/factor);
			factor = factor* 10;
		}
		return newnumber;
		//int a = x%10;
		//int b = (x/10) % 10;
		//int c = (x/100) % 10;
		//int d = (x/1000) % 10;
		//int e = (a*1000) + (b*100) + (c*10) + (d*1);
		//return e;
	}
	public static int countDigits(int x) {
		int count = 0;
		if(x == 0) {
			return 1;
		}
		while (count > 0) {
			count = count +1;
			x = x/10;
		}
		return count;
}

}
class NumberComparer implements Comparator <Integer> {

	@Override
	public int compare(Integer arg0, Integer arg1) {
		// TODO Auto-generated method stub
		return arg0 - arg1;
	}
	
	}
