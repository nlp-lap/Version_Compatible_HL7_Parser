package hl7.model.V2_7.table;

import hl7.bean.table.Table;

public class Table0907 extends Table{
	private static final String VERSION = "2.7";
	public static Table getInstance(){
		if(table==null) new Table0907();
		return table;
	}

	public static final String B = "B";
	public static final String C = "C";
	public static final String D = "D";
	public static final String ETH = "ETH";
	public static final String HIV = "HIV";
	public static final String I = "I";
	public static final String L = "L";
	public static final String N = "N";
	public static final String PSY = "PSY";
	public static final String R = "R";
	public static final String S = "S";
	public static final String SDV = "SDV";
	public static final String T = "T";
	public static final String V = "V";

	private Table0907(){
		setTableName("Confidentiality");
		setOID("");

		putMap("B", "Business - Since the service class can represent knowledge structures that may be considered a trade or business secret, there is sometimes (though rarely) the need to flag those items as of business level confidentiality.  However, no patient related inf");
		putMap("C", "Celebrity - Celebrities are people of public interest (VIP) including employees, whose information require special protection.");
		putMap("D", "Clinician - Only clinicians may see this item, billing and administration persons can not access this item without special permission.");
		putMap("ETH", "Substance abuse related - Alcohol/drug-abuse related item");
		putMap("HIV", "HIV Related - HIV and AIDS related item");
		putMap("I", "Individual - Access only to individual persons who are mentioned explicitly as actors of this service and whose actor type warrants that access (cf. to actor typed code).");
		putMap("L", "Low - No patient record item can be of low confidentiality.  However, some service objects are not patient related and therefore may have low confidentiality.");
		putMap("N", "Normal - Normal confidentiality rules (according to good health care practice) apply, that is, only authorized individuals with a legitimate medical or business need may access this item.");
		putMap("PSY", "Psychiatry related - Psychiatry related item");
		putMap("R", "Restricted - Restricted access, e.g. only to providers having a current care relationship to the patient.");
		putMap("S", "Sensitive - Information for which the patient seeks heightened confidentiality.  Sensitive information is not to be shared with family members.  Information reported by the patient about family members is sensitive by default.  Flag can be set or cleared");
		putMap("SDV", "Sexual and domestic violence related - Sexual assault / domestic violence related item");
		putMap("T", "Taboo - Information not to be disclosed or discussed with patient except through physician assigned to patient in this case.  This is usually a temporary constraint only; example use is a new fatal diagnosis or finding, such as malignancy or HIV.");
		putMap("V", "Very restricted - Very restricted access as declared by the Privacy Officer of the record holder.");

	}

}
