package com.ravi.kickstart.dagger;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module (includes = {UserModule.class, LogWatcherModule.class})
public class BackendServiceModule {
	
	
	
	
	@Provides
	@Singleton	
	BackendService provideBackendService(@Named("serverUrl")String serverUrL) {
	       return new BackendService(serverUrL);
	    }

	
	@Provides
    @Named("serverUrl")
    String provideServerUrl() {
       return "http://www.ravi.com";
    }
	

}
