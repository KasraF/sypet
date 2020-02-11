public static boolean test0() throws Throwable {
	return reverse("world").equals("dlrow");
}

public static boolean test1() throws Throwable {
	return reverse("hello").equals("olleh");
}

public static boolean test2() throws Throwable {
	return reverse("").equals("");
}

public static boolean test3() throws Throwable {
	return reverse("h").equals("h");
}

public static boolean test() throws Throwable
{
	return test0() && test1() && test2() && test3();
}
