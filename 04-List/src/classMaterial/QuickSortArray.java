package classMaterial;

import java.util.*;

public class QuickSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public QuickSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public T[] quickSort() {
		T[] result = array.clone();
		quickSort(result, 0, result.length - 1);

		return result;
	}

	private void quickSort(T[] a, int begin, int last) {
		if (last <= begin) {
			return;
		}

		T pivot = a[begin];
		int pivotIndex = begin, i = begin + 1, j = last;
		boolean forward = false;

		while (i <= j) {
			if (forward) {
				if (pivot.compareTo(a[i]) < 0) {
					swap(a, i, pivotIndex);
					pivotIndex = i++;
					forward = false;
				}
			} else {
				if (pivot.compareTo(a[j]) > 0) {
					swap(a, j, pivotIndex);
					pivotIndex = j--;
					forward = true;
				}
			}
		}

		quickSort(a, begin, pivotIndex - 1);
		quickSort(a, pivotIndex + 1, last);
	}
}
