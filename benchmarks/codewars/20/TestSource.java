public static boolean test0() throws Throwable {
	return phoneDirPhone("<Anastasia> +48-421-674-8974 Via Quirinal Roma\n").equals("48-421-674-8974");
}

public static boolean test1() throws Throwable {
	return phoneDirPhone("<P Salinger> Main Street, +1-098-512-2222, Denver\n").equals("1-098-512-2222");
}

public static boolean test() throws Throwable
{
	return test0() && test1();
}
