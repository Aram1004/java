import java.util.Scanner;

public class test {
	
	public static void main(String[] args) {
	
		int num=0, sum=0;
		int index = 0;
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("enter number : ");
			num = scanner.nextInt();
			if (num == (-1)) {
				break;
			}
			sum += num;
			index++;
		}
		scanner.close();
		
		System.out.println("average : " + sum / index);
	}
	
}

