package com.ravi.kickstart.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class EngineModule {

	@Provides @Singleton
	public Engine provideEngine(){
		return new Ferrari4Cylinder();
	}
}
