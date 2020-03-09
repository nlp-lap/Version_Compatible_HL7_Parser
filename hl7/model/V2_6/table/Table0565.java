package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0565 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0565();
		return table;
	}

	public static final String DISP = "DISP";
	public static final String GST = "GST";
	public static final String HST = "HST";
	public static final String MKUP = "MKUP";
	public static final String PST = "PST";

	private Table0565(){
		setTableName("Provider Adjustment Reason Code");
		setOID("2.16.840.1.113883.12.565");

		putMap("DISP", "Dispensing Fee");
		putMap("GST", "Goods and Services Tax");
		putMap("HST", "Harmonized Sales Tax");
		putMap("MKUP", "Mark up Fee");
		putMap("PST", "Provincial Sales Tax");

	}

}
