public static boolean test0() throws Throwable {
	return rot(1, "abc def").equals("fab cde");
}

public static boolean test1() throws Throwable {
	return rot(2, "abc def").equals("efa bcd");
}

public static boolean test2() throws Throwable {
	return rot(3, "abc def").equals("def abc");
}

public static boolean test3() throws Throwable {
	return rot(4, "abc def").equals("cde fab");
}

public static boolean test4() throws Throwable {
	return rot(5, "abc def").equals("bcd efa");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3() && test4();
}
