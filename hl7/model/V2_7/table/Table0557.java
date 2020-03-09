package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0557 extends Table{
	private static final String VERSION = "2.7";
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
		setOID("");

		putMap("EMPL", "Employer");
		putMap("ORG", "Payee Organization");
		putMap("PERS", "Person");
		putMap("PPER", "Pay Person");

	}

}
