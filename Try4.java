public class Try4 {
    //Finally use

	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
					
		}
		catch(ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs");
			
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("Array Index Out Of Bounds Exception oocurs");
		}
	          catch(Exception e) {
	        	  System.out.println( "Handel The All Exception" );
	          }
		finally {
			System.out.println("All Code Run");
		}
	        	  
	        	  
		
		

	}

}

    

