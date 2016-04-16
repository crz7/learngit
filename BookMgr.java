package bookManage;

import java.util.Scanner;

public class BookMgr {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		//数据初始化 最多6本书
		//图书：图书名称  图书借阅状态 图书借阅日期 图书借阅次数
		String[] names = new String[6];
		int[] status = new int[6];//0可借 1已借出
		int[] dates = new int[6];
		int[] counts = new int[6];

		names[0]="白雪公主";
		dates[0]=5;
		status[0]=1;
		counts[0]=10;

		names[0]="葫芦兄弟";
		dates[0]=0;
		status[0]=0;
		counts[0]=16;

		names[0]="舒克贝塔";
		dates[0]=0;
		status[0]=0;
		counts[0]=78;
		boolean flag = true;//true 不退出
		int num = 0;//用户输入0返回主菜单
		//图书管理相关操作：查看图书信息  新增图书  借阅图书  归还图书  删除图书  退出系统		

		do{
			System.out.println("欢迎使用迷你图书管理器");
			System.out.println("--------------");

			System.out.println("1.新增图书");
			System.out.println("2.查看图书");
			System.out.println("3.删除图书");
			System.out.println("4.借出图书");
			System.out.println("5.归还图书");
			System.out.println("6.退出图书");

			System.out.println("--------------");

			System.out.println("请选择：");
			int choose =input.nextInt();
			switch(choose){
				case 1:
					//查看图书
					break;
				case 2:
					//新增图书
					break;
				case 3:
					//借阅图书
					break;

				case 4:
					//归还图书
					break;

				case 5:
					//删除图书
					break;
				case 6:
					//退出系统,flag标识成false,跳出循环
					flag = false;
					break;
				default:
					//输入了错误的数值
					flag = false;
					break;
			}
			//如果flase==false
			if(!flag){
				break;
			}
			else{
				//用户不结束使用系统，代表用户想返回主菜单继续操作
				System.out.print("请输入0返回：");
				num = input.nextInt();
			}
		}while(num==0);
		System.out.println("斜线，欢迎使用！");



	}

}
package bookManage;

import java.util.Scanner;

public class BookMgr {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		//数据初始化 最多6本书
		//图书：图书名称  图书借阅状态 图书借阅日期 图书借阅次数
		String[] names = new String[6];
		int[] status = new int[6];//0可借 1已借出
		int[] dates = new int[6];
		int[] counts = new int[6];

		names[0]="白雪公主";
		dates[0]=5;
		status[0]=1;
		counts[0]=10;

		names[1]="葫芦兄弟";
		dates[1]=0;
		status[1]=0;
		counts[1]=16;

		names[2]="舒克贝塔";
		dates[2]=0;
		status[2]=0;
		counts[2]=78;
		boolean flag = true;//true 不退出
		int num = 0;//用户输入0返回主菜单
		//图书管理相关操作：查看图书信息  新增图书  借阅图书  归还图书  删除图书  退出系统		

		do{
			System.out.println("欢迎使用迷你图书管理器");
			System.out.println("--------------");

			System.out.println("1.新增图书");
			System.out.println("2.查看图书");
			System.out.println("3.删除图书");
			System.out.println("4.借出图书");
			System.out.println("5.归还图书");
			System.out.println("6.退出图书");

			System.out.println("--------------");

			System.out.println("请选择：");
			int choose =input.nextInt();
			switch(choose){
				case 1:
					//查看图书
					System.out.println("图书信息列表-->");
					System.out.println("图书序号\t图书名称\t图书状态\t借阅日期\t借阅次数");
					//循环遍历所有图书信息并输出
					for(int i=0;i<names.length;i++){
						if(names[i]!=null){
							String state=((status[i]==0)?"可借阅":"已借出");
							String date=(dates[i]==0)?"":dates[i]+"日";
							String count=counts[i]+"次";

							System.out.println((i+1)+"\t"+names[i]+"\t"+state+"\t"+date+"\t"+count);
						}else{

							break;

						}
					}
					break;
				case 2:
					//新增图书
					break;
				case 3:
					//借阅图书
					break;

				case 4:
					//归还图书
					break;

				case 5:
					//删除图书
					break;
				case 6:
					//退出系统,flag标识成false,跳出循环
					flag = false;
					break;
				default:
					//输入了错误的数值
					flag = false;
					break;
			}
			//如果flase==false
			if(!flag){
				break;
			}
			else{
				//用户不结束使用系统，代表用户想返回主菜单继续操作
				System.out.print("请输入0返回：");
				num = input.nextInt();
			}
		}while(num==0);
		System.out.println("斜线，欢迎使用！");



	}

}

