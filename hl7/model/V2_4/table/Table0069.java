package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0069 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0069();
		return table;
	}

	public static final String CAR = "CAR";
	public static final String MED = "MED";
	public static final String PUL = "PUL";
	public static final String SUR = "SUR";
	public static final String URO = "URO";

	private Table0069(){
		setTableName("Hospital service");
		setOID("2.16.840.1.113883.12.69");

		putMap("CAR", "Cardiac Service");
		putMap("MED", "Medical Service");
		putMap("PUL", "Pulmonary Service");
		putMap("SUR", "Surgical Service");
		putMap("URO", "Urology Service");

	}

}
