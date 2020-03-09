package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table4000 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table4000();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String P = "P";

	private Table4000(){
		setTableName("Name/address representation");
		setOID("2.16.840.1.113883.12.4000");

		putMap("A", "Alphabetic (i.e., Default or some single-byte)");
		putMap("I", "Ideographic (i.e., Kanji)");
		putMap("P", "Phonetic (i.e., ASCII, Katakana, Hiragana, etc.)");

	}

}
