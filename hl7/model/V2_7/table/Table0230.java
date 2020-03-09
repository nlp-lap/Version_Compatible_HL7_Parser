package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0230 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0230();
		return table;
	}

	public static final String A = "A";
	public static final String D = "D";
	public static final String I = "I";
	public static final String P = "P";

	private Table0230(){
		setTableName("Procedure Functional Type");
		setOID("");

		putMap("A", "Anesthesia");
		putMap("D", "Diagnostic procedure");
		putMap("I", "Invasive procedure not classified elsewhere (e.g., IV, catheter, etc.)");
		putMap("P", "Procedure for treatment (therapeutic, including operations)");

	}

}
