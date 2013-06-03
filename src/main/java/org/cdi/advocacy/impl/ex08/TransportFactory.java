package org.cdi.advocacy.impl.ex08;

import javax.enterprise.inject.Produces;

import org.cdi.advocacy.api.ATMTransport;

public class TransportFactory {
	private boolean useJSON = true;
	private boolean behindFirewall = true;

	@Produces
	@MultiTransport
	public ATMTransport createTransport() {
		if (!behindFirewall) {
			return new StandardAtmTransport();
		} else {
			if (useJSON) {
				return new JsonRestAtmTransport();
			} else {
				return new SoapAtmTransport();
			}
		}
	}
	
}
