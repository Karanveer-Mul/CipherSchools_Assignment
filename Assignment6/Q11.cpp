using System;

class GFG {
	static int min(int x, int y, int z)
	{
		if (x <= y && x <= z)
			return x;
		if (y <= x && y <= z)
			return y;
		else
			return z;
	}

	static int editDist(String str1, String str2, int m,
						int n)
	{
		if (m == 0)
			return n;

		if (n == 0)
			return m;

		if (str1[m - 1] == str2[n - 1])
			return editDist(str1, str2, m - 1, n - 1);

		return 1
			+ min(editDist(str1, str2, m, n - 1), 
				editDist(str1, str2, m - 1, n), 
				editDist(str1, str2, m - 1,
						n - 1) 
			);
	}

	public static void Main()
	{
		String str1 = "sunday";
		String str2 = "saturday";
		Console.WriteLine(
			editDist(str1, str2, str1.Length, str2.Length));
	}
}
