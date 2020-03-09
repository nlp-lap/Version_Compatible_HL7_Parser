package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0790 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0790();
		return table;
	}

	public static final String AMA = "AMA";
	public static final String FDA = "FDA";

	private Table0790(){
		setTableName("Approving Regulatory Agency");
		setOID("");

		putMap("AMA", "American Medical Association");
		putMap("FDA", "Food and Drug Administration");

	}

}
