public static boolean test0() throws Throwable {
	return stringToNumber("1234").equals(1234);
}

public static boolean test1() throws Throwable {
	return stringToNumber("605").equals(605);
}

public static boolean test2() throws Throwable {
	return stringToNumber("1405").equals(1405);
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2();
}
