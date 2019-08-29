package code.reflection;

import java.lang.reflect.Field;	
import java.lang.reflect.Modifier;

class Knowledge {

	private static final int ANSWER = 5000;

	public String askQuestion(String question) {
		return "The answer to '" + question + "' is: " + ANSWER;
	}

}

public class KnowledgeTest {
	private static void setFinalStaticField(Class<?> clazz, String fieldName, Object value)
			throws ReflectiveOperationException {

		Field field = clazz.getDeclaredField(fieldName);
		field.setAccessible(true);

		Field modifiers = Field.class.getDeclaredField("modifiers");
		modifiers.setAccessible(true);
		modifiers.setInt(field, field.getModifiers() & ~Modifier.FINAL);

		field.set(null, value);
	}

	public static void main(String[] args) throws ReflectiveOperationException {
		Knowledge knowledge = new Knowledge();
		String answer = knowledge.askQuestion("question?");
		KnowledgeTest.setFinalStaticField(Knowledge.class, "ANSWER", 50000);
		answer = knowledge.askQuestion("question? ");
		System.out.println(answer);
	}

}
