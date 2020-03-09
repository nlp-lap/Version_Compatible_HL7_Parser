package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0155 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0155();
		return table;
	}

	public static final String AL = "AL";
	public static final String ER = "ER";
	public static final String NE = "NE";
	public static final String SU = "SU";

	private Table0155(){
		setTableName("Accept/Application Acknowledgement Conditions");
		setOID("2.16.840.1.113883.12.155");

		putMap("AL", "Always");
		putMap("ER", "Error/reject conditions only");
		putMap("NE", "Never");
		putMap("SU", "Successful completion only");

	}

}
