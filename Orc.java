package sample;

public class Orc extends Villain {
	private int orcNumber;
	public Orc(String name, int orcNumber) {//构造函数进行初始化
		super(name);//name属于父类的成员变量
		this.orcNumber = orcNumber;
	}
	public void change(String name, int orcNumber) {//成员函数
		set(name);//调用父类成员函数
		this.orcNumber = orcNumber;
	}
	public String toString() {
		return "Orc" + orcNumber + ":" + super.toString();
	}
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}

