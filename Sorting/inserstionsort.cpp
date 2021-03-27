
#include<iostream>
using namespace std;
    void insertionSort(int a[], int len){
        
        for(int i =1; i<len; i++){
            int val = a[i]; int j=i-1;
    
            while(j >-1 && a[i]>a[j]){
                if(a[i]>a[j]){
                    a[j+1] = a[j];
                }
            }
            a[j+1] = val;

        }    
    }  

int main(){
    int array[] = {2,4,9,6,10};int len =5;
    
     insertionSort(array, len);

     for(int i =0; i<5; i++){
         cout<<array[i]<< " ";
     }



    return 0;
}