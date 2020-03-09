package hl7.model.V2_5.table;

import hl7.bean.table.Table;

public class Table0375 extends Table{
	private static final String VERSION = "2.5";
	public static Table getInstance(){
		if(table==null) new Table0375();
		return table;
	}

	public static final String FLUR = "FLUR";
	public static final String SFHB = "SFHB";

	private Table0375(){
		setTableName("Artificial blood");
		setOID("2.16.840.1.113883.12.375");

		putMap("FLUR", "Fluorocarbons");
		putMap("SFHB", "Stromal free hemoglobin preparations");

	}

}
