package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0558 extends Table{
	private static final String VERSION = "2.7";
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
		setOID("");

		putMap("FM", "Family Member");
		putMap("GT", "Guarantor");
		putMap("PT", "Patient");
		putMap("SB", "Subscriber");

	}

}
