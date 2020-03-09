package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0179 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0179();
		return table;
	}

	public static final String AL = "AL";
	public static final String ER = "ER";
	public static final String NE = "NE";
	public static final String SU = "SU";

	private Table0179(){
		setTableName("Response Level");
		setOID("2.16.840.1.113883.12.179");

		putMap("AL", "Always.  All MFA segments (whether denoting errors or not) must be returned via the application level acknowledgement message");
		putMap("ER", "Error/Reject conditions only.  Only MFA segments denoting errors must be returned via the application level acknowledgement for this message");
		putMap("NE", "Never.  no application level response needed");
		putMap("SU", "Success.  Only MFA segments denoting success must be returned via the application level acknowledgement for this message");

	}

}