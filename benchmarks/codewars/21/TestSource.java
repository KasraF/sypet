public static boolean test0() throws Throwable {
	return phoneDirAddress("<Anastasia> +48-421-674-8974 Via Quirinal Roma\n").equals("Via Quirinal Roma");
}

public static boolean test1() throws Throwable {
	return phoneDirAddress("<P Salinger> Main Street, +1-098-512-2222, Denver\n").equals("Main Street, Denver");
}

public static boolean test() throws Throwable
{
	return test0() && test1();
}
