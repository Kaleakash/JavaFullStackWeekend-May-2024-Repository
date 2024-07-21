package com;

public class DefaultThread {

	public static void main(String[] args) {
	Thread t = Thread.currentThread();
	System.out.println(t);
	t.setName("Demo Thread");
	t.setPriority(1);
	System.out.println(t);
	t.setPriority(Thread.MAX_PRIORITY);   //10
	System.out.println(t);
	t.setPriority(6);
	System.out.println(t);
	ThreadGroup tg = t.getThreadGroup();
	System.out.println(tg.getName());
	System.out.println(tg);
	
	}

}
