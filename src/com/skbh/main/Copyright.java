package com.skbh.main;

import java.lang.annotation.Documented;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface Copyright {
	String info() default "skbh";
	int copyWriteId() default 101;
	String copyWriteName();
	String copyWriteAddress();
	String copyWriteContacts() default "9999439248";
}


@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
@interface NotNullKey {
	String copyWriteName();
}

class TestAnnotationParser{
	public void parseAnnotation(){
		NotNullKey notNullKey = null;
		try {
			notNullKey = this.getClass().getMethod("parseAnnotation").getAnnotation(NotNullKey.class);
			if(notNullKey.equals(null))
				System.out.println("Please provide value for field");
		} catch (NoSuchMethodException | SecurityException exceptionObject) {
			exceptionObject.printStackTrace();
		}
	}
	
}
