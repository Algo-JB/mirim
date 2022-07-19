package q15596;

public class Test {
	long sum(int[] a) {
		long result = 0; //리턴을 long으로 
		for(int num : a) {
			result += num;
		}
		return result;
	}
}
