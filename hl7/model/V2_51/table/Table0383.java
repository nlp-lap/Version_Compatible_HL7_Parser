package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0383 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0383();
		return table;
	}

	public static final String CE = "CE";
	public static final String CW = "CW";
	public static final String EE = "EE";
	public static final String EW = "EW";
	public static final String NE = "NE";
	public static final String NW = "NW";
	public static final String OE = "OE";
	public static final String OK = "OK";
	public static final String OW = "OW";
	public static final String QE = "QE";
	public static final String QW = "QW";

	private Table0383(){
		setTableName("Substance status");
		setOID("2.16.840.1.113883.12.383");

		putMap("CE", "Calibration Error");
		putMap("CW", "Calibration Warning");
		putMap("EE", "Expired Error");
		putMap("EW", "Expired Warning");
		putMap("NE", "Not Available Error");
		putMap("NW", "Not Available Warning");
		putMap("OE", "Other Error");
		putMap("OK", "OK Status");
		putMap("OW", "Other Warning");
		putMap("QE", "QC Error");
		putMap("QW", "QC Warning");

	}

}
