package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0790 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0790();
		return table;
	}

	public static final String AMA = "AMA";
	public static final String FDA = "FDA";

	private Table0790(){
		setTableName("Approving Regulatory Agency");
		setOID("2.16.840.1.113883.12.790");

		putMap("AMA", "American Medical Association");
		putMap("FDA", "Food and Drug Administration");

	}

}
