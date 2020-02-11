public static boolean test0() throws Throwable {
	return getMiddle("test").equals("es");
}

public static boolean test1() throws Throwable {
	return getMiddle("testing").equals("t");
}

public static boolean test2() throws Throwable {
	return getMiddle("middle").equals("dd");
}

public static boolean test3() throws Throwable {
	return getMiddle("A").equals("A");
}

public static boolean test4() throws Throwable {
	return getMiddle("of").equals("of");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3() && test4();
}
