import java.util.Arrays;
public class ArraySorterAndFinder {

	public static void main(String[] args) {
		float salaries[]= {96325.25f, 85693.25f, 75698.45f};
		
		String cities[]= {"HYD", "PUNE", "BENGALURU", "GURUFRAM", "VIJAYAWADA"};
		
		System.out.println("Array salaries without sorting");
		
		for (float salary : salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(salaries);
		
		System.out.println("Array salaries after sorting");
		for(float salary : salaries) {
			System.out.println(salary);
		}
		
		Arrays.sort(cities);
		
		for(String city : cities) {
			System.out.println(city);
		}
		//Binary Search - pre requisite - array has to be sorted
		
		int index = Arrays.binarySearch(cities, "PUNE");
		//return the index of the available element
		
		if (index< 0) {
			System.out.println("Search element is not found");
		}else {
			System.out.println("City fount at index" + index);
		}

	}

}
