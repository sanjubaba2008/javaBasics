package mitAssignments;

public class Marathon {

	public static void main(String[] args) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex", "Emma", "John", "James",
				"Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}

		System.out.println("------------------------------------");

		System.out.println(getMinIndex(times));

		System.out.println("------------------------------------");

		int secondMinIndex = getSecondMinIndex(times);

		System.out.println(secondMinIndex);

		System.out.println(names[secondMinIndex] + ": " + times[secondMinIndex]);

		int thirdMinIndex = getThirdMinIndex(times);
		System.out.println(names[thirdMinIndex] + ": " + times[thirdMinIndex]);
	}

	public static int getMinIndex(int[] array) {

		int minValue = Integer.MAX_VALUE;
		// System.out.println(minValue);
		int minIndex = -1;

		for (int i = 0; i < array.length; i++) {

			if (array[i] < minValue) {

				minValue = array[i];
				minIndex = i;
			}

		} // end of for
		return minIndex;
	}

	public static int getSecondMinIndex(int[] array) {

		int minIndex = getMinIndex(array);
		int secondIndex = -1;

		for (int i = 0; i < array.length; i++) {

			if (i == minIndex)
				continue;
			if ((secondIndex == -1) || (array[i] < array[secondIndex])) {

				secondIndex = i;
			}
		}

		return secondIndex;
	}

	public static int getThirdMinIndex(int[] array) {

		int thirdIndex = -1;
		int secondMinIndex = getSecondMinIndex(array);
		int firstMinIndex = getMinIndex(array);

		for (int i = 0; i < array.length; i++) {

			if (i == firstMinIndex || i == secondMinIndex)

				continue;

			if ((thirdIndex == -1) || (array[i] < array[thirdIndex])) {

				thirdIndex = i;
			}

		}
		return thirdIndex;
	}
}
