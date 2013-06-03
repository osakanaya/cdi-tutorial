package org.cdi.advocacy.api;

public interface ATMTransport {
	public void communicateWithBank(byte[] datapacket);
}
