package classMaterial;

import java.util.PriorityQueue;

public class HeapSortArray<T extends Comparable<? super T>> {
	public T[] array;

	public HeapSortArray(T[] a) {
		array = a.clone();
	}
	public T[] heapSort() {
		T[] result = array.clone();
		PriorityQueue<T> heap = new PriorityQueue<>();

		for (int i = 0 ; i < array.length ; i++) {
			heap.add(array[i]);
		}
		for (int i = 0 ; !heap.isEmpty() && i < result.length ; i++) {
			result[i] = heap.poll();
		}
		return result;
	}
}
