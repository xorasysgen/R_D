package com.skbh.main;

interface Ranjeet
{
	
	public void runmeJob();
}

public class Temp  implements Ranjeet {
	
static class sclazz{
		
		private String z;

		public String getZ() {
			return z;
		}

		public void setZ(String z) {
			this.z = z;
		}
		
		public String getValues() {
			return getZ()+"400#";
			
		} 
		
	}
	
	
	class clazz{
		
		private String z;

		public String getZ() {
			return z;
		}

		public void setZ(String z) {
			this.z = z;
		}
		
		public String getValues() {
			return getZ()+"200#";
			
		} 
		
	}
	
	
	public static void main(String[] args) {
		new Ranjeet() {
		@Override
		public void runmeJob() {
			System.out.println("Run Anonymous method Inner class");
			new Temp().runmeJob();
			
		}
	
	}.runmeJob();
	
	clazz z=new Temp().new clazz();
	sclazz zz=new Temp.sclazz();
	System.out.println(zz.getValues());
	System.out.println(z.getValues());
	
	
}//end main

	@Override
	public void runmeJob() {
		
		System.out.println("Run Overridden method");
	}
	
}
