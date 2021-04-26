package com.tmb.payment.ws.consumer;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;

public class XmlInInterceptor extends AbstractPhaseInterceptor<Message> {

	private Logger loggerxml;
	public XmlInInterceptor(Logger logger) {
		super(Phase.RECEIVE);
		this.loggerxml = logger;
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		InputStream is = message.getContent(InputStream.class);
		if (is != null) {
			try {
				byte[] abys = IOUtils.toByteArray(is);
				String xml = IOUtils.toString(abys, "utf8");
				InputStream bis = new ByteArrayInputStream(abys);
				message.setContent(InputStream.class, bis);
				loggerxml.info("SOAP Response : {}" ,xml);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
