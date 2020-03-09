package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0223 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0223();
		return table;
	}

	public static final String C = "C";
	public static final String CB = "CB";
	public static final String D = "D";
	public static final String M = "M";
	public static final String O = "O";
	public static final String S = "S";
	public static final String U = "U";
	public static final String WU = "WU";

	private Table0223(){
		setTableName("Living dependency");
		setOID("2.16.840.1.113883.12.223");

		putMap("C", "Small Children Dependent");
		putMap("CB", "Common Bath");
		putMap("D", "Spouse dependent");
		putMap("M", "Medical Supervision Required");
		putMap("O", "Other");
		putMap("S", "Spouse Dependent");
		putMap("U", "Unknown");
		putMap("WU", "Walk up");

	}

}
