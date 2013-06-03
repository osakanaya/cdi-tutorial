package org.cdi.advocacy.impl.ex04;

import java.util.logging.Logger;

import javax.enterprise.inject.Produces;

import org.cdi.advocacy.api.ATMTransport;

public class TransportFactory {
	private static final Logger logger = Logger.getLogger(TransportFactory.class.getName());
	
	@Produces
	@Factory
	ATMTransport createTransport() {
		System.out.println("ATMTransport created with producer");

		return new ATMTransport() {
			
			@Override
			public void communicateWithBank(byte[] datapacket) {
				logger.info("communicating with bank via factory-created transport");
			}
		};
	}
}
