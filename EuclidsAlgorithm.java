import java.math.BigInteger;
import java.util.Scanner;


public class EuclidsAlgorithm {

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		BigInteger dividend,divisor;
		System.out.println("What two numbers do you want to find the Greatest Common Divisor of?");
		System.out.print("First number: ");
		BigInteger firstNum=in.nextBigInteger();
		System.out.print("Second number: ");
		BigInteger secondNum=in.nextBigInteger();
		if(firstNum.compareTo(secondNum)==1){
			dividend=firstNum;
			divisor=secondNum;
		} else {
			dividend=secondNum;
			divisor=firstNum;
		}
		while(true){
			BigInteger remainder=dividend.mod(divisor);
			if(remainder.compareTo(new BigInteger("0"))==0){
				System.out.println(divisor + " is the GCD.");
				break;
			} else {
				dividend=divisor;
				divisor=remainder;
			}
		}
	}

}
