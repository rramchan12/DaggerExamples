package com.ravi.kickstart.dagger;


import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
@Module
public class UserModule {
	
	    @Provides
	    @Singleton
	    User providesUser() {
	            return new User("Ravi", "R");
	   
	}

}
