public class SearchInPivotSortedArray {
		public static int findPivot(int[] input, int low, int high) {
			if(high < low) {
				return -1;
			}
			if(high == low) {
				return low;
			}
			int mid = low + (high - low)/2;
			if(mid > high && input[mid] > input[mid + 1]) {
				return mid;
			}
			if(mid < low  && input[mid] < input[mid - 1]) {
				return mid -1;
			}
			if(input[low] >= mid) {
				return findPivot(input, low, mid -1);
			}
			return findPivot(input, mid +1, high);
		}
		public static int binarySearch(int[] input, int low, int high, int key) {
			
			if(high < low) {
				return -1;
			}
			int mid = low + (high - low)/2;
			if(input[mid] == key) {
				return mid;
			}
			if(input[mid] > key) {
				return binarySearch(input, low, mid - 1, key);
			}
			return binarySearch(input, mid + 1, high, key);
		}
		public static int pivotedBinarySearch(int [] input, int n, int key) {
			int pivot = findPivot(input, 0, n -1);
			
			if(pivot == -1) {
				return binarySearch(input, 0, n - 1 ,key);
			}
			if(input[pivot] == key) {
				return pivot;
			}
			
			// 8, 9, 10, 1, 2,3
			if(input[0] <= key) {
				return binarySearch(input, 0, pivot -1, key);
			}
			return binarySearch(input, pivot + 1, n - 1, key);
		}

		// main function
		public static void main(String args[])
		{
			// Let us search 3 in below array
			int arr1[] = { 564, 567, 571, 574, 578, 583, 584, 588, 591, 594, 596, 604, 611, 619, 622, 625, 632, 637,
					639, 640, 642, 644, 650, 652, 658, 660, 663, 666, 667, 668, 673, 674, 678, 680, 683, 686, 694, 699,
					709, 716, 717, 719, 721, 723, 727, 730, 736, 761, 762, 763, 775, 777, 778, 784, 788, 791, 794, 798,
					806, 814, 815, 816, 821, 824, 826, 828, 829, 834, 840, 845, 851, 852, 853, 854, 857, 858, 860, 861,
					869, 872, 876, 878, 887, 889, 891, 893, 899, 903, 911, 913, 920, 929, 931, 932, 933, 934, 949, 950,
					953, 955, 956, 957, 958, 961, 963, 968, 970, 971, 973, 977, 978, 981, 982, 983, 986, 988, 990, 991,
					992, 998, 1000, 1, 3, 9, 11, 12, 16, 17, 18, 20, 22, 30, 31, 33, 38, 40, 43, 51, 53, 54, 58, 63, 68,
					70, 72, 76, 82, 84, 85, 87, 88, 98, 100, 101, 105, 110, 113, 115, 117, 123, 126, 127, 128, 132, 134,
					135, 137, 141, 142, 148, 150, 153, 154, 155, 156, 157, 160, 161, 171, 172, 173, 174, 175, 180, 182,
					184, 185, 190, 193, 196, 198, 199, 200, 208, 212, 217, 218, 224, 225, 226, 232, 239, 246, 255, 264,
					265, 267, 270, 279, 281, 282, 284, 286, 287, 290, 296, 297, 298, 299, 301, 305, 306, 309, 310, 311,
					314, 315, 324, 326, 327, 335, 338, 339, 342, 344, 351, 352, 353, 355, 356, 359, 361, 362, 365, 369,
					377, 378, 379, 383, 384, 394, 399, 400, 405, 413, 416, 419, 422, 425, 427, 429, 434, 438, 440, 446,
					466, 469, 470, 473, 475, 476, 477, 483, 484, 486, 488, 490, 491, 492, 495, 497, 507, 512, 518, 526,
					529, 533, 536, 538, 539, 540, 542, 549, 552, 553, 556, 560, 563 };
			int n = arr1.length;
			int key = 281;
			System.out.println("Index of the element is : "
							+ pivotedBinarySearch(arr1, n, key));
		}


}
