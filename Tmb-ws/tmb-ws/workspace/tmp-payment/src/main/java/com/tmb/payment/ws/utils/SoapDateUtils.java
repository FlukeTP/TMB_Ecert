package com.tmb.payment.ws.utils;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.apache.commons.lang3.time.DateFormatUtils;
import org.apache.commons.lang3.time.DateUtils;

public class SoapDateUtils {

	public static final String DD_MM_YYYY = "dd/MM/yyyy";
	public static final String POST_DATE_FORMAT = "dd/MM/yyyy";
	public static final String POST_TIME_FORMAT = "HHmmSS";
	public static final String PAY_MENT_DATE = "dd/MM/yyyy HH:mm:SS";
	
	public static XMLGregorianCalendar toDate(Date d) {
		try {
			if (d == null)
				return null;
			GregorianCalendar c = new GregorianCalendar();
			c.setTime(d);
			XMLGregorianCalendar date2;
			date2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
			return date2;
		} catch (DatatypeConfigurationException e) {
//			e.printStackTrace(); //TODO Skip in log
		}
		return null;
	}

	public static Date toDate(XMLGregorianCalendar d) {
		if (d == null)
			return null;
		return d.toGregorianCalendar().getTime();
	}
	
	public static String getGenUUID() {
		UUID uuid = UUID.randomUUID();
		return uuid.toString();
	}
	
	public static String formatDate(Date d) {
		return DateFormatUtils.format(d, POST_DATE_FORMAT);
	}
	
	public static String toClientDate(Date d) {
		if (d == null)
			return null;
		return DateFormatUtils.format(d, "yyyy-MM-dd'T'HH:mm:ss+07:00");
	}
	
	public static Date parsePostDate(String d) {
		try {
			return DateUtils.parseDate(d, POST_DATE_FORMAT);
		} catch (ParseException e) {
//			e.printStackTrace(); //TODO Skip in log
		}
		return null;
	}

	public static Date parseDDMMYYYYDate(String d) {
		try {
			return DateUtils.parseDate(d, DD_MM_YYYY);
		} catch (ParseException e) {
//			e.printStackTrace(); //TODO Skip in log
		}
		return null;
	}

	public static Date parsePaymentDate(String d) {
		try {
			return DateUtils.parseDate(d, PAY_MENT_DATE);
		} catch (ParseException e) {
//			e.printStackTrace(); //TODO Skip in log
		}
		return null;
	}

	public static String parsePostDate(Date d) {
		return DateFormatUtils.format(d, POST_DATE_FORMAT);
	}

	public static String parsePostTime(Date d) {
		return DateFormatUtils.format(d, POST_TIME_FORMAT);
	}
}
