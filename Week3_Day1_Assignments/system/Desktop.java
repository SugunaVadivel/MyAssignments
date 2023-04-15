package system;

public class Desktop extends Computer {
	public void desktopSize()
	{
		System.out.println("Desktop size is Medium");
	}

	public static void main(String[] args) {
		
		Desktop object = new Desktop();
		object.desktopSize();
		object.computerModel();
		
		Computer obj1 = new Computer();
		obj1.computerModel();
		
	}

}
