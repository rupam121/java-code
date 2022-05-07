import java.util.Scanner;

class arraycreat1{
	public static void main(String[] args) {
		int arr[] = new int [4];
		Scanner sc = new Scanner(System.in);
      for(int i=0;i<4;i++){
      System.out.println(" Enter Element of "+arr[i]+" index :");
      arr[i]= sc.nextInt();
      }
      System.out.println(" Array Is: ");
      for(int i=0;i<4;i++){
      System.out.print(" "+arr[i]);
      }
	}
}