import java.util.Scanner;

public class AlternateHopKill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int power = (int) Math.ceil(((Math.log(val) / Math.log(2))));
		System.out.println(Math.pow(2, power-1));
	}

}
