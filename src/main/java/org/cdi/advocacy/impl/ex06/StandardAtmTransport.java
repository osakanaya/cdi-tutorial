package org.cdi.advocacy.impl.ex06;

import java.util.logging.Logger;

import org.cdi.advocacy.api.ATMTransport;

public class StandardAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(StandardAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via Standard transport");
	}

}
