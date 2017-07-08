package com.websystique.spring4.injection.constructor;

public class RSAEncryption implements Encryption {

	@Override
	public void encryptData() {
		System.out.println("Encryptando datos usando RSA Encryption");

	}

}
