package com.ravi.kickstart.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module (includes = {TyreModule.class, EngineModule.class})
public  class CarModule {

	

	@Provides @Singleton
	Car provideCar(Tyre tyre){
		return new MarutiErtigo(tyre);
	}
	
	
	
	
	
}
