package q15596;

public class Main {

	public static void main(String[] args) {
		Test test = new Test();
		int a[] = new int[5];
		
		for(int i=0;i<a.length;i++) {
			a[i] = i;
		}
		
		System.out.println(test.sum(a));
	}

}
