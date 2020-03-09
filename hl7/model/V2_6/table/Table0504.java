package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0504 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0504();
		return table;
	}

	public static final String EE = "EE";
	public static final String ES = "ES";
	public static final String SE = "SE";
	public static final String SS = "SS";

	private Table0504(){
		setTableName("Sequence Condition Code");
		setOID("2.16.840.1.113883.12.504");

		putMap("EE", "End related service request(s), end current service request.");
		putMap("ES", "End related service request(s), start current service request.");
		putMap("SE", "Start related service request(s), end current service request.");
		putMap("SS", "Start related service request(s), start current service request.");

	}

}
