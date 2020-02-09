public static boolean test() throws Throwable
{
		return stringToNumber("1234").equals(1234) &&
		stringToNumber("605").equals(605) &&
		stringToNumber("1405").equals(1405);
}
