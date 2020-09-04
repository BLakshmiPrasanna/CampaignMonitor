package solutionsOne;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class TestStringNull {

	@Test
	public void test() {
		QuestionOne test = new QuestionOne();
		boolean output = test.checkString("null");
		assertEquals(false,output);
	}

}
