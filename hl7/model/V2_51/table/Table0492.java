package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0492 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0492();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String P = "P";

	private Table0492(){
		setTableName("Specimen Appropriateness");
		setOID("2.16.840.1.113883.12.492");

		putMap("A", "Appropriate");
		putMap("I", "Inappropriate");
		putMap("P", "Preferred");

	}

}
