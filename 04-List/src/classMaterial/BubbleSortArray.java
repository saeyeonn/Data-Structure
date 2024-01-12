package classMaterial;

import java.util.PriorityQueue;

public class BubbleSortArray<T extends Comparable<? super T>> {
	private final T[] array;

	BubbleSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public T[] iterativeBubble() {
		T[] result = array.clone();
		for (int i = result.length -1 ; i > 0 ; i--) {
			for (int j = 0; j < i ; j++) {
				if (result[j].compareTo(result[j + 1]) > 0) {
					swap(result, j, j + 1);
				}
			}
		}

		return result;
	}

	public T[] recursiveBubble() {
		T[] result = array.clone();
		if (array.length >= 2) {
			for (int i = result.length - 1 ; i > 0 ; i--) {
				bubbleSort(result, 0, i);
			}
		}

		return result;
	}

	private void bubbleSort(T[] a, int n1, int n2) {
		if (n1 >= n2) {
			return;
		} else if (a[n1].compareTo(a[n1 + 1]) > 0) {
			swap(a, n1, n1 + 1);
		}
		bubbleSort(a, n1 + 1, n2);
	}

}
