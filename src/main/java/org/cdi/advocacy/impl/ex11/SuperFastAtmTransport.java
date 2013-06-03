package org.cdi.advocacy.impl.ex11;

import java.util.logging.Logger;

import org.cdi.advocacy.api.ATMTransport;

@Transport(type=TransportType.STANDARD, priorityLevel=1)
public class SuperFastAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(SuperFastAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via Super Fast transport");
	}

}
