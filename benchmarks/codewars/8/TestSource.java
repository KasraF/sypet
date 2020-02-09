public static boolean test() throws Throwable
{
	return bonusTime(10000, true).equals("$100000") &&
		bonusTime(25000, true).equals("$250000") &&
		bonusTime(10000, false).equals("$10000") &&
		bonusTime(60000, false).equals("$60000") &&
		bonusTime(2, true).equals("$20") &&
		bonusTime(78, false).equals("$78") &&
		bonusTime(67890, true).equals("$678900");
}
