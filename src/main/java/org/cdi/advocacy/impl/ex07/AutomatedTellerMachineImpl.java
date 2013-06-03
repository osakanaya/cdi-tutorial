package org.cdi.advocacy.impl.ex07;

import java.math.BigDecimal;
import java.util.logging.Logger;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.cdi.advocacy.api.ATMTransport;
import org.cdi.advocacy.api.AutomatedTellerMachine;

@Named("atm")
public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {
	private static final Logger logger = Logger.getLogger(AutomatedTellerMachineImpl.class.getName());

	private ATMTransport transport;
	
	@Inject @Soap
	private ATMTransport soapTransport;
	
	@Inject @Json
	private ATMTransport jsonTransport;
	
	@Inject @Standard
	private ATMTransport standardTransport;

	private boolean useJSON = true;
	private boolean behindFirewall = true;

	@PostConstruct
	protected void init() {
		if (!behindFirewall) {
			transport = standardTransport;
		} else {
			if (useJSON) {
				transport = jsonTransport;
			} else {
				transport = soapTransport;
			}
		}
	}
	
	@Override
	public void deposit(BigDecimal bd) {
		logger.info("deposit called");
		transport.communicateWithBank(null);
	}

	@Override
	public void withdraw(BigDecimal bd) {
		logger.info("withdraw called");
		transport.communicateWithBank(null);
	}

}
