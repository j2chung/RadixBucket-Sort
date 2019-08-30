package cs21as04;
import java.util.ArrayList;
import java.util.Scanner;

public class p4 {	
	public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        while(stdin.hasNextInt() && stdin.hasNextLine()) {
            arr.add(stdin.nextInt());
        }
        radixBucketSort(arr, arr.size(), 10, 9);
        for(int i = 0; i < arr.size(); i++) {
            System.out.println(String.format("%09d",arr.get(i)));
        }
	}
	
	public static void radixBucketSort(ArrayList<Integer> A, int n, int d, int r) {
		int count = 0;
		ArrayList<ArrayList<Integer>> bucket = new ArrayList<ArrayList<Integer>>(r);
		for (int i = 0; i < d; i++) {
			bucket.add(new ArrayList<Integer>());
		}
		for (int i = 1; i <= d; i++) {
			for (int j = 0; j < n; j++) {
				r = getnthDigit(A.get(j), i - 1);
				bucket.get(r).add(A.get(j));
			}
			for (int k = 0; k < 10; k++) {			
				for (int p = 0; p < bucket.get(k).size(); p++) {
					A.set(count, bucket.get(k).get(p));
					count++;
				}
				bucket.get(k).clear();
			}
			count = 0;
		}
	}
	
	public static int getnthDigit(int num, int d) {
		for (int i = 0; i < d; i++) {
			num = num / 10;
		}
		return num % 10;
	}
}
