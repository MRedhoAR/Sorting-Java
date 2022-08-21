package mergesort;

public class MergeSort {

    public static void main(String[] args) {
        int[] a = { 6, 5, 3, 1, 8, 7, 2, 4, 0 };
		doMergerSort(a);

		for (int i = 0; i < a.length; i++)
			System.err.print(a[i] + " ");

	}

	private static void doMergerSort(int[] a) {
		mergerSort(a, 1, a.length);
	}

	private static void mergerSort(int[] a, int start, int end) {
		int n = end - start + 1;
		if (n <= 1)
			return;

		int middle = start + (n / 2) - 1;
		mergerSort(a, start, middle);
		mergerSort(a, middle + 1, end);
		merge(a, start, middle, end);
	}

	private static void merge(int[] a, int start, int middle, int end) {
		int[] b = new int[end - start + 1];

		int i = start;
		int j = middle + 1;

		for (int k = 0; k < b.length; k++) { if (j > end) {
				b[k] = a[i - 1];
				i++;
			} else if (i > middle) {
				b[k] = a[j - 1];
				j++;
			} else if (a[i - 1] < a[j - 1]) {
				b[k] = a[i - 1];
				i++;
			} else {
				b[k] = a[j - 1];
				j++;
			}
		}

		for (int k = 0; k < b.length; k++) {
			a[start - 1 + k] = b[k];
		}
    }
    
}
