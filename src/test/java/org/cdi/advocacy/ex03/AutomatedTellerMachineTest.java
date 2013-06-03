package org.cdi.advocacy.ex03;

import java.math.BigDecimal;
import java.util.logging.Logger;

import javax.inject.Inject;

import org.cdi.advocacy.api.ATMTransport;
import org.cdi.advocacy.api.AutomatedTellerMachine;
import org.cdi.advocacy.impl.common.StandardAtmTransport;
import org.cdi.advocacy.impl.ex03.AutomatedTellerMachineImpl;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Arquillian.class)
public class AutomatedTellerMachineTest {
	private static final Logger logger = Logger.getLogger("org.cdi.advocacy");
	
	@Deployment
	public static JavaArchive createDeployment() {
		JavaArchive jar = ShrinkWrap.create(JavaArchive.class)
				.addPackages(true, 
						ATMTransport.class.getPackage(),
						AutomatedTellerMachineImpl.class.getPackage(),
						StandardAtmTransport.class.getPackage(),
						AutomatedTellerMachineTest.class.getPackage()
				)
				.addAsManifestResource("beans.xml", "beans.xml");

		logger.info(jar.toString(true));
		return jar;
	}
	
	@Inject
	private AutomatedTellerMachine atm;
	
	@Test
	public void testBankTransaction() throws Exception {
		atm.withdraw(new BigDecimal("10.00"));
		atm.deposit(new BigDecimal("100.00"));
	}
}
