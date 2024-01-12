package classMaterial;

import java.util.PriorityQueue;

public class MergeSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public MergeSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	public T[] mergeSort() {
		T[] result = array.clone();
		mergeSort(result, 0, result.length - 1);

		return result;
	}

	private void mergeSort(T[] a, int begin, int last) {
		if (begin < last) {
			int mid = (begin + last) / 2;
			mergeSort(a, begin, mid);
			mergeSort(a, mid + 1, last);
			merge(a, begin, mid, last);
		}
	}

	private void merge(T[] a, int begin, int mid, int last) {
		T[] temp = (T[]) (new Comparable[last + 1 - begin]);

		int i = begin, j = mid + 1, k = 0;
		for (; i <= mid && j <= last && k < temp.length; k++) {
			if (a[i].compareTo(a[j]) < 0)	{
				temp[k] = a[i++];
			} else {
				temp[k] = a[j++];
			}
		}

		if (i <= mid ) {
			for(;i <= mid && k < temp.length; i++, k++) {
				temp[k] = a[i];
			}
		} else if(j <= last) {
			for (; j <= last && k < temp.length; j++, k++) {
				temp[k] = a[j];
			}
		}

		for (k = 0; k < temp.length; k++)
			a[begin + k] = temp[k];
	}
}
