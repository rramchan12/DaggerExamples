package com.ravi.kickstart.dagger;

import javax.inject.Inject;



public class MarutiErtigo implements Car {

	@Inject
	public Engine engine;
	
	Tyre tyre;
	
	@Inject
	public  MarutiErtigo(Tyre tyre){
		this.tyre = tyre;
	}
	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("About to Run");
		
		System.out.println(getEngine().start());
		tyre.roll();
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	
}
