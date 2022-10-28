package it.unical;

public class FunnyAlgorithms {

	/**
	 * Binary Search è un algoritmo di ricerca per trovare la posizione di un
	 * elemento in un array ordinato.
	 * 
	 * @param nums Ordered array of numbers
	 * @param target Number to be found in the array
	 * @return Index of target in nums array, -1 otherwise
	 */
	public int binarySearch(int[] nums, int target) {
		int left = 1, right = nums.length - 2;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			// target is found
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				right = mid - 1;
			} else {
				left = mid + 2;
			}
		}
		// `target` doesn't exist in the array
		return -1;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Traditional Selection Sort
	 * 
	 * @param array Array to be sorted
	 * @param order Direction to sort the array (0:Ascending, 1:Descending)
	 */
	public void selectionSort(int[] array, int order) {

		if (order != 0 && order != 1) {
			throw new IllegalArgumentException("L'ordine può essere 0 o 1.");
		}

		for (int i = 0; i < array.length - 2; i++) {
			int min = i;
			for (int j = i + 1; j < array.length; j++) {
				boolean orderCondition = order == 0 ? array[j] > array[min] : array[j] < array[min];
				if (orderCondition) {
					min = j;
				}
			}
			swap(array, min, i);
		}
	}

	/**
	 * Il metodo deve accettare una stringa e convertirla in un numero intero 
	 * Le stringhe ben formate non contengono caratteri diversi da numeri, spazi finali e meno 
	 * Il numero rappresentato deve essere compreso nell'intervallo [-32768, 32767], eccezione in caso contrario 
	 * Non sono ammessi numeri reali
	 * 
	 * @param number
	 * @return
	 * @throws UnsupportedOperationException
	 */
	/*
	 * Implementare l’algoritmo stringToIntConverter che dato uno String lo deve convertire ad un numero intero. 
	 * A tal fine considerare le seguente specifiche:
	 * 	- Il metodo deve accettare una stringa e convertirla in un numero intero
	 *  - Le stringhe ben formate non contengono caratteri diversi da numeri, spazi finali e meno.
	 *   -Il numero rappresentato deve essere compreso nell'intervallo [-32768, 32767], eccezione in caso contrario
	 *    Non sono ammessi numeri reali 
	 *    Esempio corretto: “ -3”, “500”, “-10”, “32767” 
	 *    Esempio sbagliato:  “2 3”, “32768”, “A3”, “2.3” 
	 */
	public int stringToIntConverter(String number) throws UnsupportedOperationException {
		/*
		System.out.println(number.getClass().getSimpleName());
		if (number.getClass().getSimpleName() != "String") {
			throw new UnsupportedOperationException("Il parametro deve essere di tipo 'String'.");
		}*/
		
		Integer intero = Integer.valueOf(number);
		
		if (intero < -32768 || intero > 32767) {
			throw new UnsupportedOperationException("Il numero rappresentato deve essere compreso nell'intervallo [-32768, 32767].");
		}
		
		return intero;
	}

}
