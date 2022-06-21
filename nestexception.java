
//JAVA NESTED TRY EXAMPLE
 class nestexception    {
 	public static void main(String[] args) {
 		try{
 			try{
 				System.out.println("going to devide");
 				int b=30/00;
 			}
 			catch(ArithmeticException e){
                System.out.println(e);
 			}
 			try{
 				int a[] = new int[5];
 				a[5]=77;
 			}
 			catch(ArrayIndexOutOfBoundsException e){
 				System.out.println(e);
 			    System.out.println("other statement");
            }
 		}
 		 catch(Exception e){
            	System.out.println("Handled");
            }
 		 System.out.println("rest statement");
 	}
 }                                                 