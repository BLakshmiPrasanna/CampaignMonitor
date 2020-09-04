package solutionsOne;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestNull {

	@Test
	public void testNull() {
		QuestionOne test = new QuestionOne();
		boolean output = test.checkString(null);
		assertEquals(true,output);
	}

}
