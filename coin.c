#include <stdio.h>

void main(){     

    int n, k;
    scanf("%d %d", &n, &k);
    int arr[n];
    
    for(int i=0; i<n; i++){
      scanf("%d", &arr[i]);
    }
    
    int cnt=0, idx=n-1;
    while(k!=0){
        if(k>=arr[idx]){
            k-=arr[idx];
            cnt++;
        }else{
            idx--;
        }
    }
    printf("%d",cnt);
}
