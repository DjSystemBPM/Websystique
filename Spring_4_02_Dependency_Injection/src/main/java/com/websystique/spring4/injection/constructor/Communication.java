package com.websystique.spring4.injection.constructor;

public class Communication {

	private Encryption encryption;
	
	public Communication(Encryption encryption){
        this.encryption = encryption;
    }
	
	public void communicate(){
        encryption.encryptData();
    }
}
