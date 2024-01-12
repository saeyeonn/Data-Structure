package classMaterial;

import java.util.PriorityQueue;

public class SelectionSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public SelectionSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public T[] iterativeSelection() {
		T[] result = array.clone();
		for (int i=result.length-1 ; i > 0 ; i--) {
			swap(result, i, getMaxIndex(result, i));
		}	
		return result;
	}
	private int getMaxIndex(T[] a, int n) {
		int maxIndex = 0;
		T max=a[0];
		for (int i = 1 ; i <= n ; i++) {
			if (max.compareTo(a[i]) < 0) {
				max = a[i];
				maxIndex = i;
			}
		}
		return maxIndex;
	}

	public T[] recursiveSelection() {	// Recursive Selection Sort
		T[] result = array.clone();
		selectionSort(result, result.length - 1);

		return result;
	}

	private void selectionSort(T[] a, int n) {
		if (n == 0) return;
		swap(a, n, getMaxIndex(a, n));
		selectionSort(a, n - 1);
	}
}
