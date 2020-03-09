package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0534 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0534();
		return table;
	}

	public static final String L = "L";
	public static final String N = "N";
	public static final String O = "O";
	public static final String U = "U";
	public static final String Y = "Y";

	private Table0534(){
		setTableName("Notify Clergy Code");
		setOID("2.16.840.1.113883.12.534");

		putMap("L", "Last Rites only");
		putMap("N", "No");
		putMap("O", "Other");
		putMap("U", "Unknown");
		putMap("Y", "Yes");

	}

}
