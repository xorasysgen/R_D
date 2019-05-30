package code.test.statistics;

import java.util.Scanner;

public class WeightedMean {

	
	private static double weightedMeanCalulator(Integer n,Integer [] x,Integer [] w) {
		double wm=0,mean_x=0;
		for (int i = 0; i < n; i++) {
			wm+=x[i]*w[i];
			mean_x=mean_x+=w[i];
			
		}
		System.out.println(mean_x);
		System.out.println(wm);
		return Math.round(wm/mean_x*10.0)/10.0;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter N");
		Integer n=s.nextInt();
        Integer x[]=new Integer[n];
        Integer w[]=new Integer[n];
        
        System.out.println("Enter x");
        for(int i=0;i<n;i++)//for reading array
        	x[i]=s.nextInt();
        System.out.println("Enter W");
        for(int i=0;i<n;i++)//for reading array
        	w[i]=s.nextInt();
        s.close();
        
        System.out.println(WeightedMean.weightedMeanCalulator(n, x, w));

	}
	

}
