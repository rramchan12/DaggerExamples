package com.ravi.kickstart.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {CarModule.class})
public interface MyCarComponent {
	
	public MarutiErtigo provideCar();
	void inject(MarutiErtigo car);
	
}
