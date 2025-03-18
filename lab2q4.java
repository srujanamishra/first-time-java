import java.io.*;
public class lab2q4
{
	int num1;
	int num2;
	int num3;
	static int choice=0;
	InputStreamReader ibr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(ibr);

	public void menu()
	{
		System.out.println("1=addition of two numbers");
		System.out.println("2=substration of two numbers");
		System.out.println("3=multiplication of two numbers");
		System.out.println("4=division of two numbers");
		System.out.println("5=Exit");
	}

	public void addition() throws IOException
	{
		System.out.println("enter the first number");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("enter the second number");
		num2 = Integer.parseInt(br.readLine());
		num3 = num1 + num2;
		System.out.println(num3);
	}
	public void substration() throws IOException
	{
		System.out.println("enter the first number");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("enter the second number");
		num2 = Integer.parseInt(br.readLine());
		num3 = num1 - num2;
		System.out.println(num3);
	}
	public void multiplication() throws IOException
{
    System.out.println("Enter the first number");
    num1 = Integer.parseInt(br.readLine());
    System.out.println("Enter the second number");
    num2 = Integer.parseInt(br.readLine());
    num3 = num1 * num2;
    System.out.println("Result: " + num3); 
}

	public void division() throws IOException
	{
		System.out.println("enter the first number");
		num1 = Integer.parseInt(br.readLine());
		System.out.println("enter the second number");
		num2 = Integer.parseInt(br.readLine());
		num3 = num1 / num2;
		System.out.println(num3);
	}
	public static void main(String args[]) throws IOException
	{
		int x=1;
		q4 C = new lab2q4();
		while (x==1)//true
		{
			C.menu();
			System.out.println("Enter Your Choice");
			choice=Integer.parseInt(C.br.readLine());

			switch(choice)
			{
				case 1:
				C.addition();
				break;

				case 2:
				C.substration();
				break;

				case 3:
				C.multiplication();
				break;

				case 4:
				C.division();
				break;

				case 5:
				System.exit(0);
				break;

				default :
				System.out.println("Invalid Choice");
			}
			System.out.println("Do you want to continue press(y=1/n=0)");
			x=Integer.parseInt(C.br.readLine());
			}
		}
	}


