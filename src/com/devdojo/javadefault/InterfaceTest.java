package com.devdojo.javadefault;

import com.devdojo.javadefault.interfaces.MyList;

public class InterfaceTest implements MyList {
	
	public static void main(String[] args) {
		MyList.sort();
		new InterfaceTest().remove();
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
