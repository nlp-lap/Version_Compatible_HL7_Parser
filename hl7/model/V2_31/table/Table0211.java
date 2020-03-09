package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0211 extends Table{
	private static final String VERSION = "2.3.1";
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
	public static final String ISO_IR14 = "ISO IR14";
	public static final String ISO_IR159 = "ISO IR159";
	public static final String ISO_IR87 = "ISO IR87";
	public static final String UNICODE = "UNICODE";

	private Table0211(){
		setTableName("Alternate character sets");
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
		putMap("ISO IR14", "Code for Information Exchange (one byte)(JIS X 0201-1976),  Note that the code contains a  space, i.e. ISO IR14.");
		putMap("ISO IR159", "Code of the supplementary Japanese Graphic Character set for information interchange (JIS X  0212-1990), Note that the code contains a space, i.e. ISO IR159.");
		putMap("ISO IR87", "Code for the Japanese Graphic Character set for information interchange (JIS X 0208-1990), Note that the code contains a space, i.e. ISO IR87.");
		putMap("UNICODE", "The world wide character standard from ISO/IEC 10646-1-1993");

	}

}
