package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0123 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0123();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String F = "F";
	public static final String I = "I";
	public static final String O = "O";
	public static final String P = "P";
	public static final String R = "R";
	public static final String S = "S";
	public static final String X = "X";
	public static final String Y = "Y";
	public static final String Z = "Z";

	private Table0123(){
		setTableName("Result Status");
		setOID("2.16.840.1.113883.12.123");

		putMap("A", "Some, but not all, results available");
		putMap("C", "Correction to results");
		putMap("F", "Final results; results stored and verified.  Can only be changed with a corrected result.");
		putMap("I", "No results available; specimen received, procedure incomplete");
		putMap("O", "Order received; specimen not yet received");
		putMap("P", "Preliminary: A verified early result is available, final results not yet obtained");
		putMap("R", "Results stored; not yet verified");
		putMap("S", "No results available; procedure scheduled, but not done");
		putMap("X", "No results available; Order canceled.");
		putMap("Y", "No order on record for this test.  (Used only on queries)");
		putMap("Z", "No record of this patient. (Used only on queries)");

	}

}
