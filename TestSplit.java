package hello;

public class TestSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=new String();
		a="boooaoo";
		String[] b;
		b=a.split("o", -2);
		//    System.out.println(b[0]);
		//    System.out.print(b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		System.out.println(b.length);

	}

}

