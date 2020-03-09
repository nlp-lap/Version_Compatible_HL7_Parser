package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0273 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0273();
		return table;
	}

	public static final String AV = "AV";
	public static final String UN = "UN";

	private Table0273(){
		setTableName("Document Availability Status");
		setOID("2.16.840.1.113883.12.273");

		putMap("AV", "Available for patient care");
		putMap("UN", "Unavailable for patient care");

	}

}
