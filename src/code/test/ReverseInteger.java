package code.test;

public class ReverseInteger {

	private static  int reverseIntegers(int input) {
		System.err.println(input);
		long result=0;
		boolean flag=false;
		if(input<0) {
			  flag=true;
			  input=~input+1;
		 }
		 
		while(input>0) {
			result=input%10+result*10;
			input=input/10;
  		    if(result> Integer.MAX_VALUE || result<Integer.MIN_VALUE) return 0;
		}

		if(flag==true)
		return (int) (~result+1);
		return	(int) result;
	}
	
	public static void main(String[] args) {
		System.out.println("result #" + ReverseInteger.reverseIntegers(0123));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
   }

}
