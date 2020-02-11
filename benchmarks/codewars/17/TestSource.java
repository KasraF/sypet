public static boolean test0() throws Throwable {
	return spinWordsSub("Welcome").equals("emocleW");
}

public static boolean test1() throws Throwable {
	return spinWordsSub("Hey").equals("Hey");
}

public static boolean test2() throws Throwable {
	return spinWordsSub("fellow").equals("wollef");
}

public static boolean test3() throws Throwable {
	return spinWordsSub("warriors").equals("sroirraw");
}

public static boolean test4() throws Throwable {
	return spinWordsSub("This").equals("This");
}

public static boolean test5() throws Throwable {
	return spinWordsSub("is").equals("is");
}

public static boolean test6() throws Throwable {
	return spinWordsSub("a").equals("a");
}

public static boolean test7() throws Throwable {
	return spinWordsSub("test").equals("test");
}

public static boolean test8() throws Throwable {
	return spinWordsSub("another").equals("rehtona");
}

public static boolean test() throws Throwable
{
	return test0() && test1() 
		&& test2() && test3() 
		&& test4() && test5() 
		&& test6() && test7() 
		&& test8();
}
