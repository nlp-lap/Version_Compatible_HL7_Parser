package hl7.model.V2_51.table;

import hl7.bean.table.Table;

public class Table0211 extends Table{
	private static final String VERSION = "2.5.1";
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
	public static final String BIG_5 = "BIG-5";
	public static final String CNS_11643_1992 = "CNS 11643-1992";
	public static final String GB_18030_2000 = "GB 18030-2000";
	public static final String ISO_IR14 = "ISO IR14";
	public static final String ISO_IR159 = "ISO IR159";
	public static final String ISO_IR87 = "ISO IR87";
	public static final String KS_X_1001 = "KS X 1001";
	public static final String UNICODE = "UNICODE";
	public static final String UNICODE_UTF_16 = "UNICODE UTF-16";
	public static final String UNICODE_UTF_32 = "UNICODE UTF-32";
	public static final String UNICODE_UTF_8 = "UNICODE UTF-8";

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
		putMap("ASCII", "The printable 7-bit ASCII character set.");
		putMap("BIG-5", "Code for Taiwanese Character Set (BIG-5)");
		putMap("CNS 11643-1992", "Code for Taiwanese Character Set (CNS 11643-1992)");
		putMap("GB 18030-2000", "Code for Chinese Character Set (GB 18030-2000)");
		putMap("ISO IR14", "Code for Information Exchange (one byte)(JIS X 0201-1976).");
		putMap("ISO IR159", "Code of the supplementary Japanese Graphic Character set for information interchange (JIS X 0212-1990).");
		putMap("ISO IR87", "Code for the Japanese Graphic Character set for information interchange (JIS X 0208-1990),");
		putMap("KS X 1001", "Code for Korean Character Set (KS X 1001)");
		putMap("UNICODE", "The world wide character standard from ISO/IEC 10646-1-1993");
		putMap("UNICODE UTF-16", "UCS Transformation Format, 16-bit form");
		putMap("UNICODE UTF-32", "UCS Transformation Format, 32-bit form");
		putMap("UNICODE UTF-8", "UCS Transformation Format, 8-bit form");

	}

}
