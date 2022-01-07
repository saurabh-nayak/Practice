package com.saurabh.innerclass;

public class Main {

	public static void main(String[] args) {
		OuterCl o1= new OuterCl(10);
	    OuterCl.InnerCl i1 = o1.new InnerCl(20);
        i1.fun();
        o1.accessJ();
        OuterCl.StaticRef inner = new OuterCl.StaticRef();
        inner.fun();
        OuterCl.innerStaticFun();
        OuterInterface.InnerInterface oim= new OuterInterfaceImpl();
        oim.msg();
        new NestedInterfaceFromClass().abc();
	}

}
