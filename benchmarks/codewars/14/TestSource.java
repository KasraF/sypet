public static boolean test0() throws Throwable {
	return duplicateEncode("din").equals("(((");
}

public static boolean test1() throws Throwable {
	return duplicateEncode("recede").equals("()()()");
}

public static boolean test2() throws Throwable {
	return duplicateEncode("Success").equals(")())())");
}

public static boolean test3() throws Throwable {
	return duplicateEncode("(( @").equals("))((");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3();
}
