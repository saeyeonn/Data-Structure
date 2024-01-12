package classMaterial;

import java.util.PriorityQueue;

public class ShellSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public ShellSortArray(T[] a) {
		array = a.clone();
	}

	private void swap(T[] a, int i, int j) {
		T temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private void iterativeInsertion(T[] a, int c, int d) {
		for (int i = c + d ; i < a.length ; i += d) {
			for (int j = i - d ; j >= c && a[j + d].compareTo(a[j]) <= 0; j--){
				if(a[j+d].compareTo(a[j]) < 0) {
					swap(a, j + d, j);
				}
			}
		}
	}

	public T[] iterativeShell() {
		T[] result = array.clone();
		for (int d=result.length / 2 ; d > 0 ; d = d / 2) {
			for (int c = 0 ; c < d ; c++ )
				iterativeInsertion (result, c, d);
		}
		return result;
	}
}