package ThreadGroup;

public class ThreadGroupdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
		
		ThreadGroup parent=new ThreadGroup("parent");
		System.out.println(parent.getName());
		ThreadGroup child=new ThreadGroup(parent,"child");
		System.out.println(child.getName());
		System.out.println(child.getParent().getName());
		
	}

}
