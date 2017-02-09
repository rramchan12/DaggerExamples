package com.ravi.kickstart.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class TyreModule {

	@Provides @Singleton
	Tyre provideTyre(){
		return new MRFRadial();
	}
}
