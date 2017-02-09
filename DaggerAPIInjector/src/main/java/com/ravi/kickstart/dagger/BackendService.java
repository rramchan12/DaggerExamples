package com.ravi.kickstart.dagger;

import javax.inject.Inject;
import javax.inject.Named;

public class BackendService {

    //Field Injection
	@Inject
    public User user;
	public LogWatcher logWatcher;
   
    public String serverUrl;

    
    //Constructor Injection
    @Inject    
    public BackendService(@Named("serverUrl") String serverUrl) {
            this.serverUrl = serverUrl;
    }

    public boolean callServer() {
    	logWatcher.log("Calling the server");
    	System.out.println("User: " + user + " ServerUrl: "  + serverUrl);
            if (user !=null && serverUrl!=null && serverUrl.length()>0) {
                    System.out.println("User: " + user + " ServerUrl: "  + serverUrl);
                    return true;
            }
            return false;
    }
   
    
    //Method Injection
    //Required if the class requires a full Fledged Backend service or part of this
    @Inject
    public void registerLogWatcher(LogWatcher watcher){
    	this.logWatcher = watcher;
    }
}
