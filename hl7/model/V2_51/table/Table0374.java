package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0374 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0374();
		return table;
	}

	public static final String CNTM = "CNTM";

	private Table0374(){
		setTableName("System induced contaminants");
		setOID("2.16.840.1.113883.12.374");

		putMap("CNTM", "Present, type of contamination unspecified");

	}

}
