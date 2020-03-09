package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0269 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0269();
		return table;
	}

	public static final String O = "O";
	public static final String R = "R";

	private Table0269(){
		setTableName("Charge On Indicator");
		setOID("2.16.840.1.113883.12.269");

		putMap("O", "Charge on Order");
		putMap("R", "Charge on Result");

	}

}
