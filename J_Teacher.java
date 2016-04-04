package hello;

public class J_Teacher extends J_Employee {//定义J_Teacher类
	public int m_classHour;
	public J_Teacher(int m_workYear,int m_classHour){//带参数的构造函数。由于构造函数初始化的参数为父类的成员变量，
		super(m_workYear);//super的适用情况：子类使用带参数的构造函数进行初始化，若参数是父类的成员变量，且使用该参数进行构造函数初始化
		System.out.println(m_classHour);
		this.m_classHour=m_classHour;

	}
	public void mb_printInfo(){
		System.out.println("该教师的工作年限为"+m_workYear);
		System.out.println("该教师授课的课时为"+m_classHour);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		J_Teacher tom = new J_Teacher(2,9);
		tom.mb_printInfo();
	}

}

