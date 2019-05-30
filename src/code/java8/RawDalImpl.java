package code.java8;

public class RawDalImpl  implements RawDal{

	
	@Override
	public void dalmkhani() {
		System.out.println("dalmkhani");
		
	}

	@Override
	public void dalFry() {
		System.out.println("dalFry");
		
	}

	@Override
	public void dalButter() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		RawDalImpl RawDalImpl=new RawDalImpl();
		
		RawDalImpl.dalmkhani();
		
		RawDal r=new RawDal() {

			@Override
			public void dalmkhani() {
				System.out.println("Inner dalmkhani");
				
			}

			@Override
			public void dalFry() {
				System.out.println("Inner dal fry");
				
			}

			@Override
			public void dalButter() {
				// TODO Auto-generated method stub
				
			}
			
		};
		r.dalmkhani();
		
	}

}
