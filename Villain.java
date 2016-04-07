package sample;
class Villain {
	private String name;
	protected void set(String nm) {//成员函数set:初始化成员变量name
		name = nm;
	}
	public Villain(String name) {//构造函数初始化name
		this.name = name;
	}
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}
