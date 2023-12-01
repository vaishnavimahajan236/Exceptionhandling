//one try multiple catch
public class Try2 {

	public static void main(String[] args)
	{
		try {
				int a[]=new int[5];
				a [5]=30/0;
				
		

	}catch (ArithmeticException e) {
		System.out.println("Arithmetic Exception occures");
		
	}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("ArrayIndexOutOfBounds Exception Occure");
			
		}
	
		catch (Exception e) {
			System.out.println("Handle The All Exception");
			
		}
		
		
	}
	

}
