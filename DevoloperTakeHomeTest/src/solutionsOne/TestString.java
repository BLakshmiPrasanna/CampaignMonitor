package solutionsOne;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestString {

	@Test
	public void testString() {
		QuestionOne test = new QuestionOne();
		boolean output = test.checkString("a");
		assertEquals(false,output);
	}

}
