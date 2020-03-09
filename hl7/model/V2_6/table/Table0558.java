package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0558 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0558();
		return table;
	}

	public static final String FM = "FM";
	public static final String GT = "GT";
	public static final String PT = "PT";
	public static final String SB = "SB";

	private Table0558(){
		setTableName("Payee Relationship to Invoice");
		setOID("2.16.840.1.113883.12.558");

		putMap("FM", "Family Member");
		putMap("GT", "Guarantor");
		putMap("PT", "Patient");
		putMap("SB", "Subscriber");

	}

}
