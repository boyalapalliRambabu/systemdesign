
package com.myls.systemdesign.designpattern.creational.factoryMethod;

public class Main {

	public static void main(String[] args) {
		Logistics logistics = new SeaLogistics();
		logistics.planDeliver();;
	}

}
