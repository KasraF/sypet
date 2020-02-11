public static boolean test0() throws Throwable {
	return fakeBin("45385593107843568").equals("01011110001100111")
}

public static boolean test1() throws Throwable {
	return fakeBin("509321967506747").equals("101000111101101");
}

public static boolean test2() throws Throwable {
	return fakeBin("366058562030849490134388085").equals("011011110000101010000011011");
}

public static boolean test3() throws Throwable {
	return fakeBin("15889923").equals("01111100");
}

public static boolean test4() throws Throwable {
	return fakeBin("800857237867").equals("100111001111");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3() && test4();
}
