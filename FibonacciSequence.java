import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	
	int n1 = 0, n2 = 1, n3;
	System.out.print("Enter the term of number: ");
	int num = scanner.nextInt();
	
	if(num == 1){
    System.out.println(n2);
	}else if(num == 0){
    System.out.println(n1);
	}else {
	System.out.println("\n" + n1 + "\n" + n2);
	}
	
	for(int i = 2; i <= num; i++){
		 n3 = n1 + n2;
		 System.out.println(n3);
		 
		 n1 = n2;
		 n2 = n3;
	}
	
	}
}