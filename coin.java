import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		int k = in.nextInt();
		int cnt =  0;
		
		int a[] = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = in.nextInt();
		}
		
		for(int i=n-1;i>=0;i--) {
			if(a[i]<=k) {
				cnt += k/a[i];
				k %= a[i];
			}
		}
		
		System.out.println(cnt);
		
		in.close();
	}

}
