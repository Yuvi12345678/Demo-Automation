package Upanddowncasting;

public class upanddowncasting {
	public static void main(String[] args) {
		
		father f = new child();
		f.bus();
		f.railway();
		child f1 = (child) f;
		f1.car();
	}

}
