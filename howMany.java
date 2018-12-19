import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author Jugat Singh
 *How Many
 */
public class howMany 
{

	public static void main(String[] args) 
	{
		Scanner user= new Scanner(System.in);
		Random rand= new Random();
		
		System.out.println("How many times would you like to roll: ");
		int times= user.nextInt();
		
		int one= 0;
		int two= 0;
		int three= 0;
		int four= 0;
		int five= 0;
		int six=0;
		
		for (int num=1; num<=times+1;num++)
		{
			int dice= rand.nextInt(6)+1;
			if (dice==1)
				one+=1;
			if (dice==2)
				two+=1;
			if (dice==3)
				three+=1;
			if (dice==4)
				four+=1;
			if (dice==5)
				five+=1;
			if (dice==6)
				six+=1;
		}
		System.out.println("Number\tNumber of Times");
		System.out.println("One\t"+one);
		System.out.println("Two\t"+two);
		System.out.println("Three\t"+three);
		System.out.println("Four\t"+four);
		System.out.println("Five\t"+five);
		System.out.println("Six\t"+six);


	}

}