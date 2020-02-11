public static boolean test0() throws Throwable {
	return spinWordsWhole("Welcome").equals("emocleW");
}

public static boolean test1() throws Throwable {
	return spinWordsWhole("Hey fellow warriors").equals("Hey wollef sroirraw");
}

public static boolean test2() throws Throwable {
	return spinWordsWhole("This is a test").equals("This is a test");
}

public static boolean test3() throws Throwable {
	return spinWordsWhole("This is another test").equals("This is rehtona test");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3();
}
