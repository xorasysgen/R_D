package code.java8;

import java.util.Date;
//immutable class and get object from factory pattern
public  final class Immutable {
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Immutable [code=");
		builder.append(code);
		builder.append(", value=");
		builder.append(value);
		builder.append(", timeStamp=");
		builder.append(timeStamp);
		builder.append("]");
		return builder.toString();
	}

	private final Integer code;
	private final String value;
	private final Date timeStamp;
	
	private Immutable(Integer code, String value,Date timeStamp) {
		this.code = code;
		this.value = value;
		this.timeStamp=timeStamp;
	}
	
	public static Immutable  getFactoryObject(Integer code, String value,Date timeStamp) {
		return new Immutable(code,value,timeStamp);
	}
	
	public Integer getCodSe() {
		return code;
	}
	
	public String getValue() {
		return value;
	}

	public Date getTimeStamp() {
		return timeStamp;
	}
	
}
