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
		System.out.printf("%-10s", "Number", "%-30s", "Number of Times\n");
		System.out.printf("%-10d", 1, "%-30d", one+"\n");
		System.out.printf("%-10d", 2, "%-30d", two+"\n");
		System.out.printf("%-10d", 3, "%-30d", three+"\n");
		System.out.printf("%-10d", 4, "%-30d", four+"\n");
		System.out.printf("%-10d", 5, "%-30d", five+"\n");
		System.out.printf("%-10d", 6, "%-30d", six+"\n");

	}

}