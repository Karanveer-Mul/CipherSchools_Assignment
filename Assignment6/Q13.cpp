using System;

class GFG {
	static int minJumps(int[] arr, int l, int h)
	{
		if (h == l)
			return 0;

		if (arr[l] == 0)
			return int.MaxValue;

		int min = int.MaxValue;
		for (int i = l + 1; i <= h && i <= l + arr[l]; i++) {
			int jumps = minJumps(arr, i, h);
			if (jumps != int.MaxValue && jumps + 1 < min)
				min = jumps + 1;
		}
		return min;
	}

	public static void Main()
	{
		int[] arr = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
		int n = arr.Length;
		Console.Write("Minimum number of jumps to reach end is "
					+ minJumps(arr, 0, n - 1));
	}
}
