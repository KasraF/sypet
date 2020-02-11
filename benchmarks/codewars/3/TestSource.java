public static boolean test0() throws Throwable {
	return dnaToRna("TTTT").equals("UUUU");
}

public static boolean test1() throws Throwable {
	return dnaToRna("GCAT").equals("GCAU");
}

public static boolean test2() throws Throwable {
	return dnaToRna("GACCGCCGCC").equals("GACCGCCGCC");
}



public static boolean test() throws Throwable
{
	return test0() && test1() && test2();
}
