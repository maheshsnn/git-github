package Threads;

public class Userdefined_Thread implements Runnable {
	
public static void main(String[] args) {
	Userdefined_Thread ss=new Userdefined_Thread();
	ss.run();
	
}
/*
@Override
public void run() {
	for(int i=0;i<10;i++)
	{
		System.out.println("Runnable thread");
	}
	
}*/
@Override
public synchronized void run()
{
	Thread t=new Thread();
	notifyAll();// notify ,wait, notify all should be used inside sync block otherwise we get synchronisation issue
	
	System.out.println("test");
}
}
