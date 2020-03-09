package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0373 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0373();
		return table;
	}

	public static final String ACID = "ACID";
	public static final String ALK = "ALK";
	public static final String DEFB = "DEFB";
	public static final String FILT = "FILT";
	public static final String LDLP = "LDLP";
	public static final String NEUT = "NEUT";
	public static final String RECA = "RECA";
	public static final String UFIL = "UFIL";

	private Table0373(){
		setTableName("Treatment");
		setOID("2.16.840.1.113883.12.373");

		putMap("ACID", "Acidification");
		putMap("ALK", "Alkalization");
		putMap("DEFB", "Defibrination");
		putMap("FILT", "Filtration");
		putMap("LDLP", "LDL Precipitation");
		putMap("NEUT", "Neutralization");
		putMap("RECA", "Recalification");
		putMap("UFIL", "Ultrafiltration");

	}

}
