package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0499 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0499();
		return table;
	}

	public static final String E = "E";
	public static final String PJ = "PJ";

	private Table0499(){
		setTableName("Consent Bypass Reason");
		setOID("");

		putMap("E", "Emergency");
		putMap("PJ", "Professional Judgment");

	}

}
