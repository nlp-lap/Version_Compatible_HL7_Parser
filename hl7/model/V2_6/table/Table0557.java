package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0557 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0557();
		return table;
	}

	public static final String EMPL = "EMPL";
	public static final String ORG = "ORG";
	public static final String PERS = "PERS";
	public static final String PPER = "PPER";

	private Table0557(){
		setTableName("Payee Type");
		setOID("2.16.840.1.113883.12.557");

		putMap("EMPL", "Employer");
		putMap("ORG", "Payee Organization");
		putMap("PERS", "Person");
		putMap("PPER", "Pay Person");

	}

}
