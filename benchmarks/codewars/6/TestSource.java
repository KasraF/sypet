public static boolean test() throws Throwable
{
	return reverse("world").equals("dlrow") &&
		reverse("hello").equals("olleh") &&
		reverse("").equals("") &&
		reverse("h").equals("h");
}
