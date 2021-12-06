package com.shajal16;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;


public class Domain {


	String record;
	String header;
	String cash;

	SimpleDateFormat formatter= new SimpleDateFormat("ddMMMyyyy", Locale.ENGLISH);
	Date date = new Date(System.currentTimeMillis());
	String today = formatter.format(date);
	public String getToday() {
		return today.toUpperCase();
	}




	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}



	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {

		this.header = header;
	}

	public String getCash() {
		return cash;
	}

	public void setCash(String cash) {
		this.cash = cash;
	}

}