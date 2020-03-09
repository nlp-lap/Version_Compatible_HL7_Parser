package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0240 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0240();
		return table;
	}

	public static final String C = "C";
	public static final String D = "D";
	public static final String H = "H";
	public static final String I = "I";
	public static final String J = "J";
	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";

	private Table0240(){
		setTableName("Event consequence");
		setOID("2.16.840.1.113883.12.240");

		putMap("C", "Congenital anomaly/birth defect");
		putMap("D", "Death");
		putMap("H", "Caused hospitalized");
		putMap("I", "Incapacity which is significant, persistent or permanent");
		putMap("J", "Disability which is significant, persistent or permanent");
		putMap("L", "Life threatening");
		putMap("O", "Other");
		putMap("P", "Prolonged hospitalization");
		putMap("R", "Required intervention to prevent permanent impairment/damage");

	}

}
