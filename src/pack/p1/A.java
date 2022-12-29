package pack.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class A {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(3, 2, 2, 3, 7, 3, 5);

		int x = list.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
		int x1 = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(x);
		System.out.println(x1);
		int s = m2(x, x1);
		System.out.println("Sum = " + s);

	}

	public static int m2(int x, int y) {
		int sum = x + y;
		return sum;
	}

}
