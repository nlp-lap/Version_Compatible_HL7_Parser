package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0465 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0465();
		return table;
	}

	public static final String A = "A";
	public static final String I = "I";
	public static final String P = "P";

	private Table0465(){
		setTableName("Name/Address Representation");
		setOID("");

		putMap("A", "Alphabetic (i.e., Default or some single-byte)");
		putMap("I", "Ideographic (i.e., Kanji)");
		putMap("P", "Phonetic (i.e., ASCII, Katakana, Hiragana, etc.)");

	}

}
