//   func(int[] notSorted) -> maximum sum of a contiguous subset
//
//        2  3      3  1          3  4     -> 16
//   [-2, 2, 3, -1, 3, 1, -4, -6, 3, 4, -3]
//        2, 3, -1, 3, 1  -> 8

//  [2, 3] -> 5
//  [-90, 10, -90] -> 10

public int func(int[] ns) {
	// Validate input
	
	// max = 10
	// sum = 10
	
	int max = ns[0];
	for (int i = 0; i < ns.length; i++) {
	   int sum = 0;
	   for (int j = i; j < ns.length; j++) {
		   sum += ns[j];
		   if (sum > max)
			   max = sum;
	   }
	}
	return max;
}
