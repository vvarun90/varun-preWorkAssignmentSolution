import java.util.Scanner;

	public class Main {
		Scanner sc = new Scanner(System.in);
		//function to checkPalindrome
		public void checkPalindrome()  {
			System.out.println("Enter number to check for Panlindrom: ");
			Scanner sc = new Scanner(System.in);
			int r,sum=0,temp,var1;
			var1=sc.nextInt();
			temp=var1;
			while(var1>0){
				r=var1%10;
				sum=(sum*10)+r;
				var1=var1/10;
			}
			if(temp==sum){
				System.out.println("Palindrome");
			}
			else {
				System.out.println("Not a Panlindrom");
			}
		}
		//function to printPattern
		public void printPattern() {
			System.out.print("Enter pattern count: ");
			Scanner sc = new Scanner(System.in);
			int count=sc.nextInt();
			for(int i=count;i>0;i--) {
				for(int j=0;j<i;j++){
					System.out.print('*');
				}
				System.out.println();
			}
		}
		//function to check no is prime or not
		public void checkPrimeNumber() {
			System.out.print("Enter a number to check: ");
			Scanner sc = new Scanner(System.in);
			boolean flag=false;
			int num = sc.nextInt();
			for(int i=2;i<=num/2;i++){
				if(num % i == 0)
					flag=false;
				else
					flag=true;
			}
			if(!flag)
				System.out.println(num + " is not a prime number.");
			else
				System.out.println(num + " is a prime number.");
		}
		// function to print Fibonacci Series
		public void printFibonacciSeries() {
                //initialize the first and second value as 0,1 respectively.
			int first = 0,i, second = 1,third=0,count;
			System.out.print("Enter a number ");
			Scanner sc = new Scanner(System.in);
			count = sc.nextInt();
			System.out.print(first);
			System.out.print(" "+second);
			for(i=2;i<count;++i){
				third=first+second;
				System.out.print(" "+third);
				first=second;
				second=third;
			}
			System.out.println("");
		}

//main method which contains switch and do while loop

	public static void main(String[] args) {
		Main obj = new Main();
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"
			+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
			+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			System.out.println();
			System.out.print("Enter you choice: ");
			choice = sc.nextInt();
			switch (choice) {
				case 0:
				choice = 0;
				break;
			case 1: {
				obj.checkPalindrome();
				}
			break;
			case 2: {
				obj.printPattern();
				}
			break;
			case 3: {
				obj.checkPrimeNumber();
				}
			break;
			case 4: {
				obj.printFibonacciSeries();
				}
			break;
			default:
			System.out.println("Invalid choice. Enter a valid no.\n");
				}
			} while (choice != 0);
				System.out.println("Exited Successfully!!!");
				sc.close();
		}
	}