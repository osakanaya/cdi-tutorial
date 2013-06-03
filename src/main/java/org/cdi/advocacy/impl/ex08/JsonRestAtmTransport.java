package org.cdi.advocacy.impl.ex08;

import java.util.logging.Logger;

import org.cdi.advocacy.api.ATMTransport;

public class JsonRestAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(JsonRestAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via JSON REST transport");
	}

}
