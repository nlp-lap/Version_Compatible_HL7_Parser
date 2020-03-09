package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0017 extends Table{
	private static final String VERSION = "2.5.1";
	public static Table getInstance(){
		if(table==null) new Table0017();
		return table;
	}

	public static final String AJ = "AJ";
	public static final String CD = "CD";
	public static final String CG = "CG";
	public static final String CO = "CO";
	public static final String PY = "PY";

	private Table0017(){
		setTableName("Transaction Type");
		setOID("2.16.840.1.113883.12.17");

		putMap("AJ", "Adjustment");
		putMap("CD", "Credit");
		putMap("CG", "Charge");
		putMap("CO", "Co-payment");
		putMap("PY", "Payment");

	}

}
