package Design_patterns;

public class Builder_Design_pattern {
	
	
	public static void main(String[] args) {
		phone p=new phonebuilder().setos("os").getphone();
		System.out.println(p);
	}

}

class phone {

	private String os;
	private String processor;
	private String displaysize;

	public phone(String os, String processor, String displaysize) {
		this.os = os;
		this.processor = processor;
		this.displaysize = displaysize;

	}

	public String toString() {

		return "phone[OS=" + os + "       processor=" + processor + "     displaysize=" + displaysize + "]";

	}

}

class phonebuilder {
	private String os;
	private String processor;
	private String displaysize;

	public phonebuilder setos(String os) {
		this.os = os;
		return this;
	}

	public phonebuilder setprocessor(String processor) {
		this.processor = processor;
		return this;
	}

	public phonebuilder setdisplaysize(String displaysize) {
		this.displaysize = displaysize;
		return this;
	}

	public phone getphone() {

		return new phone(os, processor, displaysize);
	}

}
