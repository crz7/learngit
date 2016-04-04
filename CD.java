package dome;

public class CD extends Item {
	private int numOfTracks = 0;


	public CD(String title,int not) {
		super(title);
		numOfTracks = not;
		// TODO Auto-generated constructor stub
	}
	public void print(){
		super.print();
		System.out.println(numOfTracks);
	}
	public static void main(String[] args){
		CD cd= new CD("Owl City",7);
		cd.print();

	}

}

