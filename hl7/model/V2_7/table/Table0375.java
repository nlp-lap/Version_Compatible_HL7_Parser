package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0375 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0375();
		return table;
	}

	public static final String FLUR = "FLUR";
	public static final String SFHB = "SFHB";

	private Table0375(){
		setTableName("Artificial Blood");
		setOID("");

		putMap("FLUR", "Fluorocarbons");
		putMap("SFHB", "Stromal free hemoglobin preparations");

	}

}
