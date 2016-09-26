package org.stone6762.Sort;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Title_BubbleSort.java冒泡排序 
 * @author_Stone6762  
 * @CreationTime_2016年9月26日 下午11:26:21
 * @Description
 */
public class BubbleSort {

	private static <T> void bubbleSort(T[] arr, Comparator<? super T> cmp) {
		boolean flage = true;
		for (int i = 0; flage && i < arr.length - 1; i++) {
			flage = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (cmp.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flage = true;
				}
			}
		}
	}

	private static void bubbleSort(double[] arr) {
		boolean flage = true;
		for (int i = 0; flage && i < arr.length - 1; i++) {
			flage = false;
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					double temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flage = true;
				}
			}
		}
	}

	public static void main(String[] args) {

		Integer arr[] = { 9, 8, 2, 4, 35, 1, 25 };
		bubbleSort(arr,new FirstMax());
		System.out.println(Arrays.toString(arr));
		
	}
}
