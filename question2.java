package nazansonal_211805027_lab1;

public class question2 {

	public static void main(String[] args) {
		
		System.out.println("Term\t\tπ");
		
		double pi = 0.0;
		for (int n = 0; n <200; n++) {
			
			 double pi2=(n % 2 == 0) ? 4.0 / (2 * n + 1) : -4.0 / (2 * n + 1) ;
			 {
				pi += pi2;
				
				System.out.printf("%d\t\t%.6f\n",n+1,pi);
	}
						
		}
				
			}
			    }

	


