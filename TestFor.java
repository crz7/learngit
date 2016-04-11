package hello;

import java.util.Scanner;

public class TestFor {
	//	String name=null ;
	//	int[] score={0};
	//	float avg=0;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		float avg=0;
		int[] score=new int[5];
		Scanner in = new Scanner(System.in);

		System.out.print("输入学生姓名：");
		name=in.next();
		//		System.out.println("输入学生姓名："+in.next());
		for(int i=0;i<5;i++){
			System.out.print("请输入5门功课中第"+(i+1)+"门课的成绩：");

			//			System.out.print(in.nextInt());
			score[i]=in.nextInt();

			//			avg=(avg+score[i])/2;
			avg=(avg*i+score[i])/(i+1);
		}
		System.out.println(name+"的平均分是："+avg);
	}

}

