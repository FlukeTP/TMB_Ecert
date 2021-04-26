package com.tmb.payment.ws.consumer;

import java.io.OutputStream;

import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.io.CacheAndWriteOutputStream;
import org.apache.cxf.io.CachedOutputStream;
import org.apache.cxf.io.CachedOutputStreamCallback;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;
import org.slf4j.Logger;

public class XmlOutInterceptor extends AbstractPhaseInterceptor<Message> {
	private Logger loggerxml;
	
	public XmlOutInterceptor(Logger logger) {
		super(Phase.PRE_STREAM);
		this.loggerxml = logger;
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		final OutputStream os = message.getContent(OutputStream.class);
		if (os != null) {
			final CacheAndWriteOutputStream newOut = new CacheAndWriteOutputStream(os);
			message.setContent(OutputStream.class, newOut);
			newOut.registerCallback(new LoggingCallback());
		}
	}

	public class LoggingCallback implements CachedOutputStreamCallback {
		public void onFlush(CachedOutputStream cos) {
		}

		public void onClose(CachedOutputStream cos) {
			try {
				StringBuilder builder = new StringBuilder();
				cos.writeCacheTo(builder);
				String soapXml = builder.toString();
				loggerxml.info("SOAP Request : {}" , soapXml);
			} catch (Exception e) {
			}
		}
	}
}
