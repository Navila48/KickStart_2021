package Round_A;

import java.util.Scanner;

public class K_GoodnessString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
int t=scan.nextInt();
for(int i=1;i<=t;i++) {
	int l=scan.nextInt();
	int k=scan.nextInt();
	String s=scan.next();
	int res=GoodnessString(s,k);
	System.out.println("Case #"+i+": "+res);
}

	}
public static int GoodnessString(String s,int k) {
	int n=s.length();
	int c=0;
	int end=(n/2);
	for(int i=0;i<end;i++) {
		int j=n-i-1;
		if(s.charAt(i)!=s.charAt(j)) {
			c++;
		}
		if(c>=k)
			return 0;
	}
	return k-c;
}
}
