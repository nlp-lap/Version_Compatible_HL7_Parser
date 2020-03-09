package hl7.model.V2_3.table;

import hl7.bean.table.Table;

public class Table0211 extends Table{
	private static final String VERSION = "2.3";
	public static Table getInstance(){
		if(table==null) new Table0211();
		return table;
	}

	public static final String _8859_1 = "8859/1";
	public static final String _8859_2 = "8859/2";
	public static final String _8859_3 = "8859/3";
	public static final String _8859_4 = "8859/4";
	public static final String _8859_5 = "8859/5";
	public static final String _8859_6 = "8859/6";
	public static final String _8859_7 = "8859/7";
	public static final String _8859_8 = "8859/8";
	public static final String _8859_9 = "8859/9";
	public static final String ASCII = "ASCII";
	public static final String JAS2020 = "JAS2020";
	public static final String JIS_X_0202 = "JIS X 0202";
	public static final String UNICODE = "UNICODE";

	private Table0211(){
		setTableName("Alternate Character Sets");
		setOID("2.16.840.1.113883.12.211");

		putMap("8859/1", "The printable characters from the ISO 8859/1 Character set");
		putMap("8859/2", "The printable characters from the ISO 8859/2 Character set");
		putMap("8859/3", "The printable characters from the ISO 8859/3 Character set");
		putMap("8859/4", "The printable characters from the ISO 8859/4 Character set");
		putMap("8859/5", "The printable characters from the ISO 8859/5 Character set");
		putMap("8859/6", "The printable characters from the ISO 8859/6 Character set");
		putMap("8859/7", "The printable characters from the ISO 8859/7 Character set");
		putMap("8859/8", "The printable characters from the ISO 8859/8 Character set");
		putMap("8859/9", "The printable characters from the ISO 8859/9 Character set");
		putMap("ASCII", "The printable 7-bit ASCII character set . (This is the default if this field is omitted)");
		putMap("JAS2020", "A subset of ISO2020 used for most Kanjii transmissions");
		putMap("JIS X 0202", "ISO 2022 with escape sequences for Kanjii");
		putMap("UNICODE", "<needs document reference>");

	}

}
