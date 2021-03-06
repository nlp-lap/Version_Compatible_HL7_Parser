package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0356 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0356();
		return table;
	}

	public static final String BELOW = "<null>";
	public static final String _2_3 = "2.3";
	public static final String ISO_2022_1994 = "ISO 2022-1994";

	private Table0356(){
		setTableName("Alternate Character Set Handling Scheme");
		setOID("");

		putMap("<null>", "This is the default, indicating that there is no character set switching occurring in this message.");
		putMap("2.3", "The character set switching mode specified in HL7 2.5, section 2.7.2 and section 2.A.46, XPN - extended person name.");
		putMap("ISO 2022-1994", "This standard is titled Information Technology - Character Code Structure and Extension Technique. .");

	}

}
