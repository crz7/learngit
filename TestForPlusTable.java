package hello;

import java.util.Scanner;

public class TestForPlusTable {

	public static void main(String[] args) {
		//		Scanner input = new Scanner(System.in);
		//		System.out.print("请输入一个值：");
		//		int z=input.nextInt();
		//		for(int i=0,j=0;i<=z;i++){
		//			j=z-i;
		//			System.out.println(i+"+"+j+"="+z);
		//			
		//		}
		for(int i=0;i<5;i++){
			for(int j=0;j<5;j++){
				if(j==0){
					for(int k=0;k<(5-1-i);k++){
						System.out.print(" ");
					}
					System.out.print("*");
				}
				else{
					System.out.print("*");
					if(j==4){
						System.out.println("");
					}
				}
			}

		}
		int ii=0,jj=0,kk=0;
		for( ii=0;ii<5;ii++){
			for( jj=0;jj<2*ii+1;jj++){
				if(jj==0){
					for(int k=0;k<(5-1-ii);k++){
						System.out.print(" ");

					}
					System.out.print("*");
					if(jj==2*ii){
						System.out.println("");
					}
				}
				else{
					System.out.print("*");
					if(jj==2*ii){
						System.out.println("");
					}
				}

			}
		}
		for(int i=0;i<5;i++){
			System.out.println("*****");
		}
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j);
				System.out.print(" ");
				if(j==i){
					System.out.println("");
				}

			}

		}
	}


}

