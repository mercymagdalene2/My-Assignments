package language;

public class Automation extends Multiplelanguage {

	@Override
	public void Selenium() {
		System.out.println("The 1st language is Selenium");
		
	}

	@Override
	public void Java() {
		System.out.println("The second language is Java");
		
	}
	public static void main(String[] args) {
		Automation AT= new Automation();
		AT.python();
		AT.ruby();
		AT.Selenium();
		AT.Java();
	}

}
