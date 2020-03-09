package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0065 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0065();
		return table;
	}

	public static final String A = "A";
	public static final String G = "G";
	public static final String L = "L";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";

	private Table0065(){
		setTableName("Specimen Action Code");
		setOID("");

		putMap("A", "Add ordered tests to the existing specimen");
		putMap("G", "Generated order; reflex order");
		putMap("L", "Lab to obtain specimen from patient");
		putMap("O", "Specimen obtained by service other than Lab");
		putMap("P", "Pending specimen; Order sent prior to delivery");
		putMap("R", "Revised order");
		putMap("S", "Schedule the tests specified below");

	}

}
