package test.java;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.SortAlgos;
import main.java.SortDemoData;

public class AlgoTest {
	
																/* BUBBLE SORT */
	@Test
	public void bubble_sort_test_node() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("15 14 13 12 11 20 21 22 23 24");
		data.runAlgo(0);
	}
		
	@Test (expected=java.lang.NullPointerException.class)
	public void bubble_sort_test_edge() {
		SortAlgos.bubbleSort(null);
	}
																/* SELECTION SORT */
	@Test
	public void selection_sort_test_data() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("-1 1 3 -9 0");
		data.runAlgo(1);
	}
																		
	@Test (expected=java.lang.NullPointerException.class)
	public void selection_sort_test_null() {
		SortAlgos.selectionSort(null);
	}
																/* INSERTION SORT */
	@Test
	public void insertion_sort_test_data() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("100 110 200 0 -1 -2 -3");
		data.runAlgo(2);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void insertion_sort_test_null() {
		SortAlgos.insertionSort(null);
	}
																/* MERGE SORT */
	@Test
	public void merge_sort_test_data() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("10 10 10 11 13 15 6 2");
		data.runAlgo(3);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void merge_sort_test_null() {
		SortAlgos.mergeSort(null);
	}
																/* QUICK SORT */
	@Test
	public void quick_sort_test_data_1() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("10 9 8 7 7 8 9 10 5");
		data.runAlgo(4).toString();
	}
	
	@Test
	public void quick_sort_test_data_2() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("10 9 8 7 5 7 8 9 10");
		data.runAlgo(4);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void quick_sort_test_null() {
		SortAlgos.quickSort(null);
	}
																/* HEAP SORT */
	@Test
	public void heap_sort_test_data() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("100 110 200 0 -1 -2 -3");
		data.runAlgo(5);
	}
	
	@Test (expected=java.lang.NullPointerException.class)
	public void heap_sort_test_null() {
		SortAlgos.heapSort(null);
	}
																/* DEFAULT */
	@Test
	public void default_data() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("15 14 13 12 11 20 21 22 23 24");
		data.runAlgo(100);
	}
	
	@Test
	public void default_data_len_1() {
		SortDemoData data = new SortDemoData();
		data.initializeArray("15");
		data.runAlgo(-1);
	}
																/* COMMON */
	@Test (expected=java.util.NoSuchElementException.class)
	public void NoSuchElem() {
		SortDemoData data = new SortDemoData();
	    data.initializeArray("");  
	}
}
