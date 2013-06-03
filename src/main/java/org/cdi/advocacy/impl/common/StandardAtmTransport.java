package org.cdi.advocacy.impl.common;

import java.util.logging.Logger;

import javax.enterprise.inject.Default;

import org.cdi.advocacy.api.ATMTransport;

@Default
public class StandardAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(StandardAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via Standard transport");
	}

}
