public static boolean test0() throws Throwable {
	return phoneDirName("<Anastasia> +48-421-674-8974 Via Quirinal Roma\n").equals("Anastasia");
}

public static boolean test1() throws Throwable {
	return phoneDirName("<P Salinger> Main Street, +1-098-512-2222, Denver\n").equals("P Salinger");
}

public static boolean test() throws Throwable
{
	return test0() && test1();
}
