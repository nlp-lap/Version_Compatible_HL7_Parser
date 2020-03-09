package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0208 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0208();
		return table;
	}

	public static final String AE = "AE";
	public static final String AR = "AR";
	public static final String NF = "NF";
	public static final String OK = "OK";

	private Table0208(){
		setTableName("Query Response Status");
		setOID("");

		putMap("AE", "Application error");
		putMap("AR", "Application reject");
		putMap("NF", "No data found, no errors");
		putMap("OK", "Data found, no errors (this is the default)");

	}

}
