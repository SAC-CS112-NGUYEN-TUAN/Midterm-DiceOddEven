import java.util.Scanner;

import javax.swing.JOptionPane;

public class DiceOddEven {

	public static void main(String[] args) {
		String again;
		String again1;
		Float count= (float) 1;
		Float percent;
		int wingame=0;
		Float evenguess= (float) 0;
		Float evenpercent= (float)0;
		Float oddguess= (float) 0;
		Float oddpercent= (float) 0;
		do{
		
		//CPU roll dice
		Scanner input = new Scanner(System.in);
		int computerNum;
		computerNum = 0 + (int) (Math.random()*6);
		System.out.println(computerNum); //debug
		
		//dice is odd/even
		String result;
	    if ( computerNum % 2 == 0 )
	         result = "even";
	      else
	         result = "odd";
	    
	    System.out.println(result);
		
		// Inputs		
		String guess1 = JOptionPane.showInputDialog("A dice is throwed !!!\nIs it odd or even");
		String guess =guess1.toLowerCase();
		System.out.println(guess);
		
		//odd and even guess;
		if (guess.equals("even")){
			evenguess++; 
			evenpercent = evenguess*100/count;
			System.out.println(evenpercent);//debugg
		}
		if (guess.equals("odd")) {oddguess++;
			oddpercent = oddguess*100/count;
			System.out.println(oddpercent);//debugg
		}
		
		
		//winning percent
		if (guess.equals(result)){wingame++;}
		
		percent =  wingame*100/count;
		System.out.println(percent); //debug
		
		
		//winning or not
		if (guess.equals(result)){
			JOptionPane.showMessageDialog(null,"Game number: "+count+" The dice roll is: "+ computerNum +"\nIt is " + result+" Player is right\nYour winning rate is "+percent+
												"\nEven pick is: "+evenpercent+ " % Odd pick is: "+oddpercent+" %");
		}
		else{
		JOptionPane.showMessageDialog(null,"Game number: "+count+" The dice roll is: "+ computerNum +"\nIt is " + result+" Player is wrong\nYour winning rate is "+percent+
											"\nEven pick is: "+evenpercent+ " % Odd pick is: "+oddpercent+" %");
		}

		again1 = JOptionPane.showInputDialog(null,"Again ? \nType ; Y N");
		again = again1.toLowerCase();
		//tracking number play
		
		if ( again.equals("y")){
			count++;
		}
		System.out.println(count);	
	}
		while ( again.equals("y")) ;

	
	
	
	
}
}
