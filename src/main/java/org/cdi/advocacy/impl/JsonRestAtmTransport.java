package org.cdi.advocacy.impl;

import java.util.logging.Logger;

import javax.enterprise.inject.Alternative;

import org.cdi.advocacy.api.ATMTransport;

@Alternative
public class JsonRestAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(JsonRestAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via JSON REST transport");
	}

}
