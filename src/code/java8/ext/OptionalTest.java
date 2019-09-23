package code.java8.ext;

import java.util.Optional;
//https://www.slideshare.net/scolebourne/java-se-8-best-practices-53975908?ref=https://jaxlondon.com/blog/java-core-languages/java-8-best-practices-pdf/
class Db{
	private Integer id;
	private String dbName;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	
}


public class OptionalTest {

	private Optional<String>  getKey(String string) {
		//Optional<String> op=Optional.of(string);// throw null pointer exception
		Optional<String> opn=Optional.ofNullable(string);// does not throw null pointer exception
		Optional<String> opt=Optional.empty();
		System.out.println(opt.isPresent());
		System.out.println(opn.isPresent());
		
		
		return opn;
	}
	
	private String OptionTest(){
		
		String s=getKey(null).orElse("Optional Null");
		
		return getKey("null").orElseThrow(RuntimeException::new);
	}
	
	public static void main(String[] args) {
		System.out.println(new OptionalTest().OptionTest());
		
		
	}

}
