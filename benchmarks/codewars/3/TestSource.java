public static boolean test() throws Throwable
{
	return dnaToRna("TTTT").equals("UUUU") &&
		dnaToRna("GCAT").equals("GCAU") &&
		dnaToRna("GACCGCCGCC").equals("GACCGCCGCC");
}
