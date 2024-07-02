package javaPractice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.testng.annotations.Test;

public class RegexPrograms {
	@Test
	public void p1() {
//		System.out.println(Pattern.matches("ab+c","abc"));
//	Matcher ma = Pattern.compile("sq").matcher("[a-z && p-y]");
		System.out.println(Pattern.matches("([a-z])\2", "ee"));
	
	}
}
