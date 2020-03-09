package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0348 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0348();
		return table;
	}

	public static final String _01 = "01";
	public static final String _02 = "02";
	public static final String _03 = "03";
	public static final String _04 = "04";
	public static final String _05 = "05";
	public static final String _06 = "06";
	public static final String _07 = "07";
	public static final String _08 = "08";

	private Table0348(){
		setTableName("Special program indicator");
		setOID("2.16.840.1.113883.12.348");

		putMap("01", "EPSDT-CHAP");
		putMap("02", "Physically handicapped children¡¯s program");
		putMap("03", "Special federal funding");
		putMap("04", "Family planning");
		putMap("05", "Disability");
		putMap("06", "PPV/Medicare 100% payment");
		putMap("07", "Induced abortion-danger to life");
		putMap("08", "Induced abortion victim rape/incest");

	}

}
