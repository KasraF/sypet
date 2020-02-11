public static boolean test0() throws Throwable {
	return abbreviate("Sam Harris").equals("S.H");
}

public static boolean test1() throws Throwable {
	return abbreviate("Patrick Feenan").equals("P.F");
}

public static boolean test2() throws Throwable {
	return abbreviate("Evan Cole").equals("E.C");
}

public static boolean test3() throws Throwable {
	return abbreviate("P Favuzzi").equals("P.F");
}

public static boolean test4() throws Throwable {
	return abbreviate("David Mendieta").equals("D.M");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3() && test4();
}
