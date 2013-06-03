package org.cdi.advocacy.impl.ex11;

import java.util.logging.Logger;

import org.cdi.advocacy.api.ATMTransport;

@Transport(type=TransportType.STANDARD, priorityLevel=2)
public class StandardAtmTransport implements ATMTransport {
	private static final Logger logger = Logger.getLogger(StandardAtmTransport.class.getName());

	@Override
	public void communicateWithBank(byte[] datapacket) {
		logger.info("communicating with bank via Standard transport");
	}

}
