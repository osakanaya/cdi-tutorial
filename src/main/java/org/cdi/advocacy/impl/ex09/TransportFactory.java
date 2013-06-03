package org.cdi.advocacy.impl.ex09;

import javax.enterprise.inject.Produces;

import org.cdi.advocacy.api.ATMTransport;

public class TransportFactory {
	private boolean useJSON = true;
	private boolean behindFirewall = true;

	@Produces
	@MultiTransport
	public ATMTransport createTransport(
			@Soap ATMTransport soapTransport, 
			@Json ATMTransport jsonTransport,
			@Standard ATMTransport standardTransport) {
		if (!behindFirewall) {
			return standardTransport;
		} else {
			if (useJSON) {
				return jsonTransport;
			} else {
				return soapTransport;
			}
		}
	}
	
}
