package Singlenumber;
import java.util.Scanner;
public class Singlenumber {

public static int Singlenumber(int[]ar) {
		
		int result =0;
		
		for(int i=0;i<ar.length;i++) {
			result=result^ar[i];
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[]ar=new int[n];
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		int value=Singlenumber(ar);
		System.out.println(value);
		}
}