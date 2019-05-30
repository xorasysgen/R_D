package code.test;

public class LogicalTest {

	public static void main(String[] args) {
		String TO = null,  CC = null,  BCC = "sushil",  subject = "sushil",  body = "sushil";
		boolean bcc=false,cc=false,to=false;
		if (BCC != null && BCC.length()>0) 
			bcc=true;
		if(CC != null && CC.length()>0)
			cc=true;			
		if(TO != null && TO.length()>0)
			to=true;
		
		if(!((subject!=null && body!=null && subject.length()>0 && body.length()>0) && (bcc || cc || to ))) {
			System.out.println("null");
		}
		else
		System.out.println("not null" + TO + " " +CC + " " +BCC + " "+subject + " "+body+ " "+bcc + " "+ cc+ " " + to);
		System.out.println(
		        0xb1 - 0b1 - 0xbp1
		);
	}
	
	

}
