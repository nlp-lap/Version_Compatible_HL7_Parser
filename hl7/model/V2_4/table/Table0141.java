package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0141 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0141();
		return table;
	}

	public static final String E1_____E9 = "E1 ... E9";
	public static final String O1_____O10 = "O1 ... O10";
	public static final String W1_____W4 = "W1 ... W4";

	private Table0141(){
		setTableName("Military rank/grade");
		setOID("2.16.840.1.113883.12.141");

		putMap("E1 ... E9", "Enlisted");
		putMap("O1 ... O10", "Officers");
		putMap("W1 ... W4", "Warrant Officers");

	}

}
