import java.util.Scanner;

public class Runner {

	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		/////////////////////////////////////
		System.out.println("Welcome to the Dating Simulator");
		System.out.println("Type BEGIN to begin.");
		
		String start = input.next();
		/////////////////////////////////////
		
		if (start.equalsIgnoreCase("Begin")) {
			System.out.println("");
			System.out.println("'You see a girl across the bar'");
		}
		
		System.out.println("(1) Go up to her	 (2) Do nothing");
		
		int a = input.nextInt();
		System.out.println("");
		//////////////////////////////////////
		if (a == 1) {
			System.out.println("Girl: Hi how are you?"); 
			
			System.out.println("(1) 'Just fine, my name is Garrett by the way. What is your name?' (2) 'Good'") ;
			
			int b = input.nextInt();
			System.out.println("");
			
			if (b == 1) {
				
				System.out.println("Ashe: 'Ashe, what brings you here?'");
				
				System.out.println("(1) 'I'm new in town, and I'm looking for some company.' (2) 'Just got let off my job and trying to drink the sorrow away.' ");
				
				int c = input.nextInt();
				System.out.println("");
				
				if (c == 1) {
					
					System.out.println("Ashe: 'Well I'm your girl!'");
					
					System.out.println("(1) Do you want to come back to my place for some fun? (2) Sorry I'm not into blondes");
					
					int d = input.nextInt();
					System.out.println("");
					
					if (d == 1) {
						System.out.println("Ashe: 'Hell yeah dude'");
						
						System.out.println("(1) Bring her out the back door (2) Bring her out the front door");
						
						int e = input.nextInt();
						System.out.println("");
						
						if (e == 1) {
							System.out.println("Ashe gets shot by a druggy");
						}
						
						else if (e == 2) {
							System.out.println("Ashe gets hit by a car");
						}
					}
					else if (d == 2) {
						System.out.println("Game over");
					}
				}
				
				else if (c == 2) {
					System.out.println("Ashe: 'Harsh'");
					
					System.out.println("(1) 'Yeah my name is ____ by the way, you want to go back to my place for some fun?' (2) 'I think I am having a kidney failure'");
					
					int f = input.nextInt();
					System.out.println(""); 
					
					if (f == 1) {
						System.out.println("Sure thing bud!");
						
						System.out.println("(1) Bring her out the back door (2) Bring her out the front door");
						
						int g = input.nextInt();
						System.out.println("");
						
						if (g == 1) {
							System.out.println("Ashe gets shot by a druggy");
						}
						
						else if (g == 2) {
							System.out.println("Ashe gets hit by a car");
						}
					}
					else if (f == 2)
						System.out.println("'You die'");
					
				}
				
			}
			
			else if  (b == 2) {
				System.out.println("Girl: 'Umm... what's your name?'");
				
				System.out.println("(1) 'Garrett'	(2) 'I'm too drunk to remember'");
				
				int h = input.nextInt();
				System.out.println(""); 
				
				if (h == 1) {
					System.out.println("Girl: 'That's a stupid name'");
					System.out.println("'The girl walks away from you'");
				}
				
				else if (h == 2) {
					System.out.println("Girl: 'In that case can I have your wallet?'");
					
					System.out.println("(1) 'Of course!'     (2) 'I guess so' "); 
					
					int i = input.nextInt();
					System.out.println("");
					if (i == 1 || i == 2) {
						
						System.out.println("'The girl just runs away with your wallet'");
						
					}
				}
			}
		}
		
		else if (a == 2) {
			System.out.println("'The waiter brings you a drink from the girl down the bar'");
			
			System.out.println("(1) walk up to the girl 	(2) Thank the guy next to you");
			
			int j = input.nextInt();
			if (j == 1) {
				System.out.println("'I'm not looking for charity'");
				
				
			}
			
			else if (j == 2) {
				System.out.println("'The gay parade comes to town'");
			}
		}
	}
	
}
