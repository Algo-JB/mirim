package q4673;

public class Main {

	
	public static void main(String[] args) {
	
    int selfnums[] = new int [10001];
    int notselfnum =0;
    
    
    for (int i =1; i<selfnums.length; i++) {
    	
           notselfnum = getSelfNum(i);
           
           //받은 값이 1000을 넘어가지 않도록 
         if(notselfnum < selfnums.length) {
           selfnums[notselfnum] = notselfnum;
         }
           
    }      
     
	
    for (int i =1; i< selfnums.length; i++) {
    	if (selfnums[i] == 0) {
    		System.out.println(i);
    	}
    }
	

 }
	
	
	
	static int getSelfNum(int inum) {
		
		int total = inum;
		
		while(inum !=0) {
			total += inum%10;
			inum = inum/10;
		}
		
		return total;
	}
}