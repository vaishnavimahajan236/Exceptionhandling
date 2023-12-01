//multiple try one catch
public class Try3 {
	
	
	public static void main(String[] args) {
		try {
			int a[]=new int[5];
			a[5]=30/0;
			
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
			catch(ArrayIndexOutOfBoundsException ae) {
				
				System.out.println("Array Index Out Of Bounds Exception oocurs");
				
				
			}
			catch(Exception e) {
				System.out.println("parent exceptin occurs ");
			}
		
		System.out.println("rest of the code");
				
				
		}
		
		}
	
	


