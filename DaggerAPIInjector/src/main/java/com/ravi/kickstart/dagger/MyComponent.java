package com.ravi.kickstart.dagger;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
	@Component(modules = { BackendServiceModule.class })
	public interface MyComponent {

	    // provide the dependency for dependent components
	    // (not needed for single-component setups)
	        BackendService provideBackendService();

	        // allow to inject into our Main class
	        // method name not important
	        void inject(BackendService backendService); 
	}

