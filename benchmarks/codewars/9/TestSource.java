public static boolean test() throws Throwable
{
	return fakeBin("45385593107843568").equals("01011110001100111") &&
		fakeBin("509321967506747").equals("101000111101101") &&
		fakeBin("366058562030849490134388085").equals("011011110000101010000011011") &&
		fakeBin("15889923").equals("01111100") &&
		fakeBin("800857237867").equals("100111001111");
}
