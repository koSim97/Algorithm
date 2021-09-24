#include <stdio.h>


void main() {
	int N;
	scanf("%d", &N);

	int arr[1000];
	int i, j, key;
	for (i = 0; i < N; i++) {
		scanf("%d", &arr[i]);
	}

	for (i = 0; i < N - 1; i++) { 
		j = i; 
		while (j >= 0 && arr[j] > arr[j + 1]) { 
			key = arr[j]; 
			arr[j] = arr[j + 1]; 
			arr[j + 1] = key; 
			j--; 
		} 
	}

	int sum = 0, sum2 = 0;

	for (i = 0; i < N; i++) {
		sum += arr[i];
		sum2 += sum;
	}
	printf("%d\n", sum2);
}
