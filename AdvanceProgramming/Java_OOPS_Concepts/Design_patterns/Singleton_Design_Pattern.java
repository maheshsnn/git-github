package Design_patterns;

import com.taobao.gecko.service.SingleRequestCallBackListener;

public class Singleton_Design_Pattern {

	public static void main(String[] args) {

		driverobjclass object2 = driverobjclass.getinstance();

	}

}

class driverobjclass {
	// for singleton class first step is to create a static object
	private static driverobjclass obj = new driverobjclass();

	// Create a private constructor
	private driverobjclass() {
		System.out.println("this is a constructor");
	}

	// create a static method with any name which should return obj
	public static driverobjclass getinstance() {

		return obj;
	}

}