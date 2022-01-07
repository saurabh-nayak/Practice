package com.saurabh.innerclass;

public class OuterCl{

	public OuterCl(int i) {
		super();
		this.i = i;
	}

	private int i;
	static int k;
	
	void accessJ() {
		InnerCl i1=new InnerCl(20);
		System.out.println("Accessed private member of inner "+i1.j);
		an.fun();
		localInner();
		System.out.println("k in instance "+k);
	}
	
	//inner class 
	 class InnerCl{
		 
		 /*cannot declare static because outer type is not static so technically 
			 * to access this class need to create object of InnerCl 
			 * because InnerCl itself instance inner member of outer class then 
			 * no meaning to declare inner methods and variables as static
			 * 
			 * static int o=10;
			 * 
			 * */
		 
		public InnerCl(int j) {
			super();
			this.j = j;
		}
		private int j;
		public void fun()
		{
			System.out.println("Accessed private member of outer class "+i);
		}
	}
	 
	 //Anonymous inner class
	 AnoInterface an= new AnoInterface() {
		
		@Override
		public void fun() {
			System.out.println("called anonymous interface");	
		}
	};
	 
	// local inner class. need to create instance and call method inside method 
	void localInner() {
		
		/*local variable must be initialized before its use
		 * only final allowed in local variable. access modifiers are not allowed
		*/
		 int i = 0;
		 class localInnnerClass{
			/*
			 * static method or static variable not allowed in inner class
			 * because to access instance method we need object so there is 
			 * no meaning to create static objects and methods in inner class or local inner class
			 * 
			 * static int l;*/
			 void fun() {
				System.out.println("fun called "+i);
			}
		}
		new localInnnerClass().fun();
	}
	
	//static inner class
	static class StaticRef{
		
		/*can create static member methods and variables as 
		 * there is no need to create object to access outer
		 * class StaticRef
		*/
		
		static int i=50;
		 void fun() {
			 System.out.println("static k from static inner class "+k);
		}
	}
	
	//local inner class in static method only final is allowed as no access modifiers allowed in local level
	static void innerStaticFun() {
		//cannot declare as static class because of its a local property
		final class StaticRefLocal{
			
			/*cannot declare static because outer type is not static so technically 
			 * to access this method need to create object of StaticRefLocal then 
			 * no meaning to declare inner methods and variables as static
			 * 
			 * static int o=10;
			 * 
			 * */
			
			 void fun() {
				 System.out.println("static k from local inner class from local static function "+k);
			}
		}
		new StaticRefLocal().fun();
	}
}
