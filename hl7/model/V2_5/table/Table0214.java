package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0214 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0214();
		return table;
	}

	public static final String CH = "CH";
	public static final String ES = "ES";
	public static final String FP = "FP";
	public static final String O = "O";
	public static final String U = "U";

	private Table0214(){
		setTableName("Special Program Code");
		setOID("2.16.840.1.113883.12.214");

		putMap("CH", "Child Health Assistance");
		putMap("ES", "Elective Surgery Program");
		putMap("FP", "Family Planning");
		putMap("O", "Other");
		putMap("U", "Unknown");

	}

}
