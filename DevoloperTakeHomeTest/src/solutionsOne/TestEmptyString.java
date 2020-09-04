package solutionsOne;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestEmptyString {

	@Test
	public void testEmptyString() {
		QuestionOne test = new QuestionOne();
		boolean output = test.checkString("");
		assertEquals(true,output);
	}

}
