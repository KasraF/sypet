public static boolean test0() throws Throwable {
	return bonusTime(10000, true).equals("$100000");
}

public static boolean test1() throws Throwable {
	return bonusTime(25000, true).equals("$250000");
}

public static boolean test2() throws Throwable {
	return bonusTime(10000, false).equals("$10000");
}

public static boolean test3() throws Throwable {
	return bonusTime(60000, false).equals("$60000");
}

public static boolean test4() throws Throwable {
	return bonusTime(2, true).equals("$20");
}

public static boolean test5() throws Throwable {
	return bonusTime(78, false).equals("$78");
}

public static boolean test6() throws Throwable {
	return bonusTime(67890, true).equals("$678900");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3() && test4() && test5() && test6();
}
