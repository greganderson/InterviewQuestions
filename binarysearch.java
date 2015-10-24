//    func(int[] sorted, int search) -> index of search in sorted (-1 if not found)
//
//    [3, 4, 5, 6, 7, 8, 9, 10]      7
//              6 < 7
//                 7, 8, 9, 10
//                    8 > 7
//                 7
//                 7 == 7
//                   -> 4

//  sorted   [1, 2, 3] -> 3
//  search    3
//  start     2
//  mid       2
//  end       2

public int func(int[] sorted, int search) {
	int start = 0;
	int end = sorted.length - 1;
	int mid = sorted.length / 2;
	return recurse(sorted, search, start, mid, end);
}

private int recurse(int[] sorted, int search, int start, int mid, int end) {
	// Base case
	if (start > end)
		return -1;

	if (sorted[mid] == search) {
		return mid;   
	}
	else {
		if (sorted[mid] < search) {
			start = mid + 1;
		}
		else {
			end = mid - 1;
		}
		mid = ((end - start) / 2) + start;
		return recurse(sorted, search, start, mid, end);
	}
}
