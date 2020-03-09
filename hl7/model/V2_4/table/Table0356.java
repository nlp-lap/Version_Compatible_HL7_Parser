package hl7.model.V2_4.table;

import hl7.bean.table.Table;

public class Table0356 extends Table{
	private static final String VERSION = "2.4";
	public static Table getInstance(){
		if(table==null) new Table0356();
		return table;
	}

	public static final String BELOW = "<null>";
	public static final String _2_3 = "2.3";
	public static final String ISO_2022_1994 = "ISO 2022-1994";

	private Table0356(){
		setTableName("Alternate character set handling scheme");
		setOID("2.16.840.1.113883.12.356");

		putMap("<null>", "This is the default, indicating that there is no character set switching occurring in this message.");
		putMap("2.3", "The character set switching mode specified in HL7 2.3, sections 2.8.28.6.1, and 2.9.2.  Note that the escape sequences used in this mode do not use the ASCII esc character. They are HL7 escape sequences as defined in HL7 2.3, sec.  2.9 as defined in I");
		putMap("ISO 2022-1994", "This standard is titled Information Technology - Character Code Structure and Extension Technique. This standard specifies an escape sequence from basic one byte character set to specified other character set, and vice versa.  The escape sequence explic");

	}

}
