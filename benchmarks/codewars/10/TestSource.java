public static boolean test0() throws Throwable {
	return compDna("AAA").equals("TTT");
}

public static boolean test1() throws Throwable {
	return compDna("ATTGC").equals("TAACG");
}

public static boolean test2() throws Throwable {
	return compDna("GTAT").equals("CATA");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2();
}
