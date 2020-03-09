package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0356 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0356();
		return table;
	}

	public static final String BELOW = "<null>";
	public static final String ISO_2022_199 = "ISO 2022-199";

	private Table0356(){
		setTableName("Alternate character set handling scheme");
		setOID("2.16.840.1.113883.12.356");

		putMap("<null>", "This is the default, indicating that there is no character set switching occurring in this message.");
		putMap("ISO 2022-199", "This standard is titled Information Technology - Character Code Structure  and Extension Technique. This standard specifies an escape sequence from basic one byte character set to specified other character set, and  vice versa.  The escape sequence expl");

	}

}
