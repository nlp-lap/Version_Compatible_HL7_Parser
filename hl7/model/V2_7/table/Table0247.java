package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0247 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0247();
		return table;
	}

	public static final String A = "A";
	public static final String C = "C";
	public static final String D = "D";
	public static final String I = "I";
	public static final String K = "K";
	public static final String O = "O";
	public static final String P = "P";
	public static final String Q = "Q";
	public static final String R = "R";
	public static final String U = "U";
	public static final String X = "X";
	public static final String Y = "Y";

	private Table0247(){
		setTableName("Status of Evaluation");
		setOID("");

		putMap("A", "Evaluation anticipated, but not yet begun");
		putMap("C", "Product received in condition which made analysis impossible");
		putMap("D", "Product discarded -- unable to follow up");
		putMap("I", "Product remains implanted -- unable to follow up");
		putMap("K", "Problem already known, no evaluation necessary");
		putMap("O", "Other");
		putMap("P", "Evaluation in progress");
		putMap("Q", "Product under quarantine -- unable to follow up");
		putMap("R", "Product under recall/corrective action");
		putMap("U", "Product unavailable for follow up investigation");
		putMap("X", "Product not made by company");
		putMap("Y", "Evaluation completed");

	}

}
