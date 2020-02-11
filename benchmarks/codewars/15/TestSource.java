public static boolean test0() throws Throwable {
	return order("is2 Thi1s T4est 3a").equals("Thi1s is2 3a T4est");
}

public static boolean test1() throws Throwable {
	return order("4of Fo1r pe6ople g3ood th5e the2").equals("Fo1r the2 g3ood 4of th5e pe6ople");
}

public static boolean test2() throws Throwable {
	return order("").equals("");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2();
}
