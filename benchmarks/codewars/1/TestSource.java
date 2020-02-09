public static boolean test() throws Throwable
{
	return abbreviate("Sam Harris").equals("S.H") &&
		abbreviate("Patrick Feenan").equals("P.F") &&
		abbreviate("Evan Cole").equals("E.C") &&
		abbreviate("P Favuzzi").equals("P.F") &&
		abbreviate("David Mendieta").equals("D.M");
}
