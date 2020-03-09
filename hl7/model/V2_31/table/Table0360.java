package hl7.model.V2_31.table;

import hl7.bean.table.Table;

public class Table0360 extends Table{
	private static final String VERSION = "2.3.1";
	public static Table getInstance(){
		if(table==null) new Table0360();
		return table;
	}

	public static final String AA = "AA";
	public static final String AAS = "AAS";
	public static final String ABA = "ABA";
	public static final String AE = "AE";
	public static final String AS = "AS";
	public static final String BA = "BA";
	public static final String BBA = "BBA";
	public static final String BE = "BE";
	public static final String BFA = "BFA";
	public static final String BN = "BN";
	public static final String BS = "BS";
	public static final String BSL = "BSL";
	public static final String BT = "BT";
	public static final String CER = "CER";
	public static final String DBA = "DBA";
	public static final String DED = "DED";
	public static final String DIP = "DIP";
	public static final String DO = "DO";
	public static final String HS = "HS";
	public static final String JD = "JD";
	public static final String MA = "MA";
	public static final String MBA = "MBA";
	public static final String MCE = "MCE";
	public static final String MD = "MD";
	public static final String MDI = "MDI";
	public static final String ME = "ME";
	public static final String MED = "MED";
	public static final String MEE = "MEE";
	public static final String MFA = "MFA";
	public static final String MME = "MME";
	public static final String MS = "MS";
	public static final String MSL = "MSL";
	public static final String MT = "MT";
	public static final String NG = "NG";
	public static final String PHD = "PHD";
	public static final String PHE = "PHE";
	public static final String PHS = "PHS";
	public static final String SEC = "SEC";
	public static final String TS = "TS";

	private Table0360(){
		setTableName("Degree");
		setOID("2.16.840.1.113883.12.360");

		putMap("AA", "Associate of Arts");
		putMap("AAS", "Associate of Applied Science");
		putMap("ABA", "Associate of Business Administration");
		putMap("AE", "Associate of Engineering");
		putMap("AS", "Associate of Science");
		putMap("BA", "Bachelor of Arts");
		putMap("BBA", "Bachelor of Business Administration");
		putMap("BE", "Bachelor or Engineering");
		putMap("BFA", "Bachelor of Fine Arts");
		putMap("BN", "Bachelor of Nursing");
		putMap("BS", "Bachelor of Science");
		putMap("BSL", "Bachelor of Science ? Law");
		putMap("BT", "Bachelor of Theology");
		putMap("CER", "Certificate");
		putMap("DBA", "Doctor of Business Administration");
		putMap("DED", "Doctor of Education");
		putMap("DIP", "Diploma");
		putMap("DO", "Doctor of Osteopathy");
		putMap("HS", "High School Graduate");
		putMap("JD", "Juris Doctor");
		putMap("MA", "Master of Arts");
		putMap("MBA", "Master of Business Administration");
		putMap("MCE", "Master of Civil Engineering");
		putMap("MD", "Doctor of Medicine");
		putMap("MDI", "Master of Divinity");
		putMap("ME", "Master of Engineering");
		putMap("MED", "Master of Education");
		putMap("MEE", "Master of Electrical Engineering");
		putMap("MFA", "Master of Fine Arts");
		putMap("MME", "Master of Mechanical Engineering");
		putMap("MS", "Master of Science");
		putMap("MSL", "Master of Science ? Law");
		putMap("MT", "Master of Theology");
		putMap("NG", "Non-Graduate");
		putMap("PHD", "Doctor of Philosophy");
		putMap("PHE", "Doctor of Engineering");
		putMap("PHS", "Doctor of Science");
		putMap("SEC", "Secretarial Certificate");
		putMap("TS", "Trade School Graduate");

	}

}
