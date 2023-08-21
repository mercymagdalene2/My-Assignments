package week1.day1;

import java.util.Iterator;

public class Fibbinocci {
public static void main(String[] args) {
	int n1=0, n2=1, sum=0, count=11;
	System.out.println(n1);
	for (int i = 1; i <= count; i++) {
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.println(sum);
		
	}
}
}
