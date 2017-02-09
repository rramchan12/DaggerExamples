package com.ravi.kickstart.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class LogWatcherModule {
	
	@Provides
	public LogWatcher provideLogWatcher(){
		return new LogWatcher();
	}

}
