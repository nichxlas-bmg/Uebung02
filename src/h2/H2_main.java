package h2;
import java.util.Scanner;
public class H2_main {

	public static void main(String[] args) {
		int i = 1;
		int j = 2;
		int k = 3;
		int min = 0;
		int max = 0;

		if (i > j) {
			if (j > k) {
				min = k;
				max = i;
			} else {
				if (k > i) {
					max = k;
					min = i;
				}
			}

		} else {
			if (j > k) {
				max = j;
				if (k > i) {
					min = i;
				} else {
					min = k;
				}
			}
		}
		
		
		
		
		
		if (i > k) {
			if (k > j) {
				min = j;
				max = i;
			}
		
		} else {
			if (k > j) {
				max = k;
				if (i > j) {
					min = j;
				} else {
					min = i;
				}
			}
		}

		System.out.println (min);
		System.out.println (max);
	}
}
