
import java.util.Scanner;
public class DecisionCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int hours;
		double money;
		boolean healthy;
	
		
		System.out.print("Enter if you are healty: ");
		healthy = input.nextBoolean();
		
		if (healthy){
			System.out.println("I'll go out ");
		}else{
			System.out.println("I won't go out ");
		}
		
		System.out.print("Enter any money: ");
		money = input.nextDouble();
		
		if (money > 0){
			System.out.println("I will buy any medicaments");
		}if (money < 10){
			System.out.println("I will go to cafe"); 
		}else{
			System.out.println("I will stay at home and I will drink a coffee"); 
		}
		
		System.out.print("Enter an hours: ");
		hours = input.nextInt();	
		
		if (hours < 10){
			System.out.print("I will send a message to my friend");
		}else{
			System.out.print("I wont send a message to my friend");
		}
		
		
		input.close();
		
		
	}

}
