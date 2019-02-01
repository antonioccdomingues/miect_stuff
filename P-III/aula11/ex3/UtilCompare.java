package aula11.ex3;

import java.util.Arrays;

public abstract class UtilCompare {
	@SuppressWarnings("unchecked")
	public static <T> Comparable<T> findMax(Comparable<T>[] c) {
		Comparable<T> max = c[0];
		for(Comparable<T> o : c) {
			if(o.compareTo((T) max) == 1) max = o;
		}
		return max;
	}
	
	public static <T> void sortArray(Comparable<T>[] c) {
		Arrays.sort(c);
	}
}
