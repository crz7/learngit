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
					System.out.println("\n新增图书-->");
					System.out.print("请输入新增图书名称：");
					String name=input.next();
					boolean flagAdd=false;
					for(int i=0;i<names.length;i++){
						if(names[i]==null){
							flagAdd=true;
							names[i]=name;
							System.out.println("图书《"+name+"》添加成功！");
							break;
						}
					}
					if(!flagAdd==true){
						System.out.print("对不起，货架已满，无法添加图书！");
					}
					break;
				case 3:
					//借阅图书
					System.out.println("\n借阅图书--->");
					System.out.print("请输入借阅图书的名称：");
					String want = input.next();
					for(int i=0;i<names.length;i++){
						if(names[i]==null){
							System.out.println("没有找到您要借的书！");
							break;
						}else if(names[i].equals(want) && status[i]==0){
							//找到了您要借的书，书的状态是可借的
							System.out.println("请输入借阅日期：");
							while(dates[i]<1 || dates[i]>31){
								System.out.print("数字格式不正确，请输入1-31之间的数字");
								dates[i] = input.nextInt();
							}
							System.out.println("借出《"+want+"》成功！");
							status[i] = 1;
							counts[i]++;
							break;

						}else if(names[i].equals(want) && status[i]==1){
							//找到了您要借的书，书得状态是不可借
							System.out.println("该书已经借出去了");
							break;
						}
					}
					break;

				case 4:
					//归还图书
					System.out.println("\n归还图书--->");
					System.out.print("请输入归还图书的名称：");
					String returnBook = input.next();
					for(int i=0;i<names.length;i++){
						if(names[i]==null){
							System.out.println("这不是我们的书，不用归还！");
							break;
						}else if(names[i].equals(returnBook)&&status[i]==1){
							System.out.print("请输入归还日期：");
							int date = input.nextInt();
							while(date<1 || date >31 || date<dates[i]){
								if(date<1 || date>31){
									System.out.print("数字格式不正确，请输入1-31之间的数");
									date = input.nextInt();
								}else if(date<dates[i]){
									System.out.print("归还日期不能小于借阅日期，请重新输入");
									date = input.nextInt();

								}
							}

							System.out.println("归还《"+returnBook+"》成功！");
							status[i]=0;

							int rent = (date-dates[i])*1;
							System.out.println("应付租金（元）："+rent);
							dates[i]=0;
						}

					}
					break;

				case 5:
					//删除图书
					System.out.println("思路待定");
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

