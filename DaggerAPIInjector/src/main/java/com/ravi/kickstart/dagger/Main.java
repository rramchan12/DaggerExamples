package com.ravi.kickstart.dagger;

public class Main {
	
	
	private BackendService backendService ;
    private Main(){
    	MyComponent component = DaggerMyComponent.builder().build();
    			
    	
    	this.backendService = component.provideBackendService();
    	component.inject(this.backendService);
    	this.backendService.callServer();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Main main = new Main();
		main.callServer();
	}
	
	private void callServer() {
        boolean callServer = backendService.callServer();
        
        if (callServer) {
            System.out.println("Server call was successful. ");
        } else {
            System.out.println("Server call failed. ");
        }
    }

}
