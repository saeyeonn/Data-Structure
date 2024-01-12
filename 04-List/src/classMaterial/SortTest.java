package classMaterial;

import java.util.Arrays;

public class SortTest {
	public static void main(String[] args) {
		Double[] original;
		for(int k = 100; k <= 5000; k += 100) {
			System.out.print(k + "\t");
			original = new Double[k];	//	Double[] original = new Double[8];

			for(int i = 0 ; i < original.length ; i ++) {
				original[i] = Math.random();
			}

			Arrays.sort(original);
			long t0, t1;

			BubbleSortArray<Double> bubble = new BubbleSortArray<>(original);
			SelectionSortArray<Double> selection = new SelectionSortArray<>(original);
			InsertionSortArray<Double> insertion = new InsertionSortArray<>(original);
			ShellSortArray<Double> shell = new ShellSortArray<>(original);
			MergeSortArray<Double> merge = new MergeSortArray<>(original);
			QuickSortArray<Double> quick = new QuickSortArray<>(original);
			HeapSortArray<Double> heap = new HeapSortArray<>(original);


			t0 = System.currentTimeMillis();
			int same = Arrays.compare(original, bubble.iterativeBubble());
			t1 = System.currentTimeMillis();
			System.out.print("iterative bubble : " + (t1 - t0) + "\n");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, bubble.recursiveBubble());
			t1 = System.currentTimeMillis();
			System.out.print("recursive bubble : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, selection.iterativeSelection());
			t1 = System.currentTimeMillis();
			System.out.print("iterative selection : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, selection.recursiveSelection());
			t1 = System.currentTimeMillis();
			System.out.print("recursive selection : " + (t1 - t0) +"\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, insertion.iterativeInsertion());
			t1 = System.currentTimeMillis();
			System.out.print("iterative insertion : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, insertion.recursiveInsertion());
			t1 = System.currentTimeMillis();
			System.out.print("recursion insertion : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, shell.iterativeShell());
			t1 = System.currentTimeMillis();
			System.out.print("shell : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, merge.mergeSort());
			t1 = System.currentTimeMillis();
			System.out.print("merge : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, quick.quickSort());
			t1 = System.currentTimeMillis();
			System.out.print("quick : " + (t1 - t0) + "\t");
			System.out.println(same + "\n\n");

			t0 = System.currentTimeMillis();
			same = Arrays.compare(original, heap.heapSort());
			t1  = System.currentTimeMillis();
			System.out.print("heap : " + (t1 - t0) + "\n");
			System.out.println(same + "\n\n");
		}
	}
}
