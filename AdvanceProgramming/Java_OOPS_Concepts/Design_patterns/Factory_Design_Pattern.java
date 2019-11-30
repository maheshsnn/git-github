package Design_patterns;

interface OS {
	void spec();

}

public class Factory_Design_Pattern {

	public static void main(String[] args) {

		Factory_Design_Pattern ifo = new Factory_Design_Pattern();
		OS IAF = ifo.getinstance("windows");
		IAF.spec();

	}

	public OS getinstance(String str) {

		if (str.equals("windows")) {

			return new Windows();
		}

		else {

			return new Andriod();
		}

	}

}

class Windows implements OS {

	@Override
	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("Windows");
	}

}

class Andriod implements OS {

	@Override
	public void spec() {
		// TODO Auto-generated method stub
		System.out.println("Andriod");
	}

}
