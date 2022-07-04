
import java.util.Scanner;
class bublesort{
    void sort(int arr[]){
    	int n=arr.length;
    	//System.out.println(n); //4
        for(int i=0; i<n; ++i){
        	for(int j=0; j<n-1-i; ++j){
        		if(arr[j]>arr[j+1]){
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
    }
    void printarr(int arr[]){
    	int n=arr.length;
    	for(int i=0; i<n; ++i){
    		System.out.print(" "+arr[i]+" ");
    	}
    }

	public static void main(String[] args) {
		
        bublesort s = new bublesort(); // object create
		int arr[]={33,3,4,5,100,200,221,2123,24,43554,24113,24,112};
		s.sort(arr); // calling sort method
		s.printarr(arr); // calling printarr methd
	} // function in c / c++ but in java method is same thing :)
}