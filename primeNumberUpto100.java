package lab1;
public class primeNumberUpto100 {
	public static void main(String[] args) {
		int i,num,flag;
		System.out.println("Prime Numbers upto 100");
		for(i=2;i<=100;i++) {
			flag = 1;
			for(num=2;num<=i/2;num++) {
				if(i%num==0) {
					flag = 0;
					break;
				}
			}
			if(flag == 1) {
				System.out.println(i+" ");
			}
		}

	}

}
