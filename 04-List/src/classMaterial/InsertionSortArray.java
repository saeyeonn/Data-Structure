package classMaterial;

import java.util.PriorityQueue;

public class InsertionSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public InsertionSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public T[] iterativeInsertion() {
		T[] result = array.clone();
		for (int i = 1 ; i < result.length ; i++) {
			for (int j = i - 1 ; j >= 0 && result[j + 1].compareTo(result[j]) <= 0; j--){
				if (result[j + 1].compareTo(result[j]) < 0) {
					swap(result, j, j + 1);
				}
			}
		}	
		return result;
	}

	public T[] recursiveInsertion() {
		T[] result = array.clone();
		for (int i = 1 ; i < result.length ; i++) {
			if (result[i].compareTo(result[i - 1]) < 0) {
				insertionSort(result, result[i], i - 1);
			}
		}
		return result;
	}

	private void insertionSort(T[] a, T value, int n) {
		if (n >= 0 && value.compareTo(a[n]) < 0) {
			swap(a, n, n + 1);
			insertionSort(a, value, n - 1);
		}
	}
}
