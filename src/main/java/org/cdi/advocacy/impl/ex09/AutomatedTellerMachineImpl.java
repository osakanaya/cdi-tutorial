package org.cdi.advocacy.impl.ex09;

import java.math.BigDecimal;
import java.util.logging.Logger;

import javax.inject.Inject;
import javax.inject.Named;

import org.cdi.advocacy.api.ATMTransport;
import org.cdi.advocacy.api.AutomatedTellerMachine;

@Named("atm")
public class AutomatedTellerMachineImpl implements AutomatedTellerMachine {
	private static final Logger logger = Logger.getLogger(AutomatedTellerMachineImpl.class.getName());

	@Inject
	@MultiTransport
	private ATMTransport transport;
	
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
