package hl7.model.V2_6.table;

import hl7.bean.table.Table;

public class Table0496 extends Table{
	private static final String VERSION = "2.6";
	public static Table getInstance(){
		if(table==null) new Table0496();
		return table;
	}

	public static final String _001 = "001";
	public static final String _002 = "002";
	public static final String _003 = "003";
	public static final String _004 = "004";
	public static final String _005 = "005";
	public static final String _006 = "006";
	public static final String _007 = "007";
	public static final String _008 = "008";
	public static final String _009 = "009";
	public static final String _010 = "010";
	public static final String _011 = "011";
	public static final String _012 = "012";
	public static final String _013 = "013";
	public static final String _014 = "014";
	public static final String _015 = "015";
	public static final String _016 = "016";
	public static final String _017 = "017";
	public static final String _018 = "018";
	public static final String _019 = "019";
	public static final String _020 = "020";
	public static final String _021 = "021";
	public static final String _022 = "022";
	public static final String _023 = "023";
	public static final String _024 = "024";
	public static final String _025 = "025";
	public static final String _026 = "026";
	public static final String _027 = "027";
	public static final String _028 = "028";
	public static final String _029 = "029";
	public static final String _030 = "030";
	public static final String _031 = "031";
	public static final String _032 = "032";
	public static final String _033 = "033";
	public static final String _034 = "034";
	public static final String _035 = "035";
	public static final String _036 = "036";
	public static final String _037 = "037";
	public static final String _038 = "038";
	public static final String _039 = "039";
	public static final String _040 = "040";
	public static final String _041 = "041";
	public static final String _042 = "042";
	public static final String _043 = "043";
	public static final String _044 = "044";
	public static final String _045 = "045";
	public static final String _046 = "046";
	public static final String _047 = "047";
	public static final String _048 = "048";
	public static final String _049 = "049";
	public static final String _050 = "050";
	public static final String _051 = "051";
	public static final String _052 = "052";
	public static final String _053 = "053";
	public static final String _054 = "054";
	public static final String _055 = "055";
	public static final String _056 = "056";
	public static final String _057 = "057";
	public static final String _058 = "058";
	public static final String _059 = "059";
	public static final String _060 = "060";
	public static final String _061 = "061";
	public static final String _062 = "062";
	public static final String _063 = "063";
	public static final String _064 = "064";
	public static final String _065 = "065";
	public static final String _066 = "066";
	public static final String _067 = "067";
	public static final String _068 = "068";
	public static final String _069 = "069";
	public static final String _070 = "070";
	public static final String _071 = "071";
	public static final String _072 = "072";
	public static final String _073 = "073";
	public static final String _074 = "074";
	public static final String _075 = "075";
	public static final String _076 = "076";
	public static final String _077 = "077";
	public static final String _078 = "078";
	public static final String _079 = "079";
	public static final String _080 = "080";
	public static final String _081 = "081";
	public static final String _082 = "082";
	public static final String _083 = "083";
	public static final String _084 = "084";
	public static final String _085 = "085";
	public static final String _086 = "086";
	public static final String _087 = "087";
	public static final String _088 = "088";
	public static final String _089 = "089";
	public static final String _090 = "090";
	public static final String _091 = "091";
	public static final String _092 = "092";
	public static final String _093 = "093";
	public static final String _094 = "094";
	public static final String _095 = "095";
	public static final String _096 = "096";
	public static final String _097 = "097";
	public static final String _098 = "098";
	public static final String _099 = "099";
	public static final String _100 = "100";
	public static final String _101 = "101";
	public static final String _102 = "102";
	public static final String _103 = "103";
	public static final String _104 = "104";
	public static final String _105 = "105";
	public static final String _106 = "106";
	public static final String _107 = "107";
	public static final String _108 = "108";
	public static final String _109 = "109";
	public static final String _110 = "110";
	public static final String _111 = "111";
	public static final String _112 = "112";
	public static final String _113 = "113";
	public static final String _1137 = "1137";
	public static final String _114 = "114";
	public static final String _115 = "115";
	public static final String _116 = "116";
	public static final String _117 = "117";
	public static final String _118 = "118";
	public static final String _119 = "119";
	public static final String _120 = "120";
	public static final String _121 = "121";
	public static final String _122 = "122";
	public static final String _123 = "123";
	public static final String _124 = "124";
	public static final String _125 = "125";
	public static final String _126 = "126";
	public static final String _127 = "127";
	public static final String _128 = "128";
	public static final String _129 = "129";
	public static final String _130 = "130";
	public static final String _131 = "131";
	public static final String _132 = "132";
	public static final String _133 = "133";
	public static final String _134 = "134";
	public static final String _135 = "135";
	public static final String _136 = "136";

	private Table0496(){
		setTableName("Consent Type");
		setOID("2.16.840.1.113883.12.496");

		putMap("001", "Release of Information/MR / Authorization to Disclosure Protected Health Information");
		putMap("002", "Medical Procedure (invasive)");
		putMap("003", "Acknowledge Receipt of Privacy Notice");
		putMap("004", "Abortion");
		putMap("005", "Abortion/Laminaria");
		putMap("006", "Accutane - Information");
		putMap("007", "Accutane - Woman");
		putMap("008", "Advanced Beneficiary Notice");
		putMap("009", "AFP (Alpha Fetoprotein) Screening");
		putMap("010", "Amniocentesis (consent & refusal)");
		putMap("011", "Anatomical Gift (organ donation)");
		putMap("012", "Anesthesia - Complications");
		putMap("013", "Anesthesia - Questionnaire");
		putMap("014", "Angiogram");
		putMap("015", "Angioplasty");
		putMap("016", "Anticancer Drugs");
		putMap("017", "Antipsychotic Medications");
		putMap("018", "Arthrogram");
		putMap("019", "Autopsy");
		putMap("020", "AZT Therapy");
		putMap("021", "Biliary Drainage");
		putMap("022", "Biliary Stone Extraction");
		putMap("023", "Biopsy");
		putMap("024", "Bleeding Time Test");
		putMap("025", "Bronchogram");
		putMap("026", "Cardiac Catheterization");
		putMap("027", "Coronary Angiography");
		putMap("028", "w/o Surgery Capability");
		putMap("029", "Cataract Op/Implant of FDA Aprvd Lens");
		putMap("030", "Cataract Op/Implant of Investigational Lens");
		putMap("031", "Cataract Surgery");
		putMap("032", "Cholera Immunization");
		putMap("033", "Cholesterol Screening");
		putMap("034", "Circumcision - Newborn");
		putMap("035", "Colonoscopy");
		putMap("036", "Contact Lenses");
		putMap("037", "CT Scan - Cervical & Lumbar");
		putMap("038", "CT Scan w/ IV Contrast Media into Vein");
		putMap("039", "CVS (Chorionic Villus) Sampling");
		putMap("040", "Cystospy");
		putMap("041", "Disclosure of Protected Health Information to Family/Friends");
		putMap("042", "D & C and Conization");
		putMap("043", "Dacryocystogram");
		putMap("044", "Diagnostic Isotope");
		putMap("045", "Drainage of an Abscess");
		putMap("046", "Drug Screening");
		putMap("047", "Electronic Monitoring of Labor - Refusal");
		putMap("048", "Endometrial Biopsy");
		putMap("049", "Endoscopy/Sclerosis of Esophageal Varices");
		putMap("050", "ERCP");
		putMap("051", "Exposure to reportable Communicable Disease");
		putMap("052", "External Version");
		putMap("053", "Fluorescein Angioscopy");
		putMap("054", "Hepatitis B - Consent/Declination");
		putMap("055", "Herniogram");
		putMap("056", "HIV Test - Consent Refusal");
		putMap("057", "HIV Test - Disclosure");
		putMap("058", "HIV Test - Prenatal");
		putMap("059", "Home IV Treatment Program");
		putMap("060", "Home Parenteral Treatment Program");
		putMap("061", "Hysterectomy");
		putMap("062", "Hysterosalpingogram");
		putMap("063", "Injection Slip/ Consent");
		putMap("064", "Intrauterine Device");
		putMap("065", "Intrauterine Device/Sterilization");
		putMap("066", "Intravascular Infusion of Streptokinase/Urokinase");
		putMap("067", "Intravenous Cholangiogram");
		putMap("068", "Intravenous Digital Angiography");
		putMap("069", "Iodine Administration");
		putMap("070", "ISG");
		putMap("071", "IVP");
		putMap("072", "Laser Photocoagulation");
		putMap("073", "Laser treatment");
		putMap("074", "Lithium Carbonate");
		putMap("075", "Liver Biopsy");
		putMap("076", "Lumbar Puncture");
		putMap("077", "Lymphangiogram");
		putMap("078", "MAO Inhibitors");
		putMap("079", "Med, Psych, and/or Drug/Alcohol");
		putMap("080", "Medical Treatment - Refusal");
		putMap("081", "Morning-after Pill");
		putMap("082", "MRI - Adult");
		putMap("083", "MRI - Pediatric");
		putMap("084", "Myelogram");
		putMap("085", "Needle Biopsy");
		putMap("086", "Needle Biopsy of Lung");
		putMap("087", "Newborn Treatment and Release");
		putMap("088", "Norplant Subdermal Birth Control Implant");
		putMap("089", "Operations, Anesthesia, Transfusions");
		putMap("090", "Oral Contraceptives");
		putMap("091", "Organ Donation");
		putMap("092", "Patient Permits, Consents");
		putMap("093", "Patient Treatment Permit, Release & Admission");
		putMap("094", "Penile Injections");
		putMap("095", "Percutaneous Nephrostomy");
		putMap("096", "Percutaneous Transhepatic Cholangiogram");
		putMap("097", "Photographs");
		putMap("098", "Photographs - Employee");
		putMap("099", "Photographs - Medical Research");
		putMap("100", "Photographs - news Media");
		putMap("101", "Psychiatric Admission - Next of Kin");
		putMap("102", "Psychiatric Information During Hospital Stay");
		putMap("103", "Public Release of Information");
		putMap("104", "Radiologic Procedure");
		putMap("105", "Refusal of Treatment");
		putMap("106", "Release of Body");
		putMap("107", "Release of Limb");
		putMap("108", "Rh Immune Globulin");
		putMap("109", "Rights of Medical Research Participants");
		putMap("110", "Request to Restrict Access/Disclosure to Medical Record/Protected Health Information");
		putMap("111", "Request for Remain Anonymous");
		putMap("112", "Seat Belt Exemption");
		putMap("113", "Sialogram");
		putMap("1137", "Voiding Cystogram");
		putMap("114", "Sigmoidoscopy");
		putMap("115", "Sterilization - Anesthesia & Medical Services");
		putMap("116", "Sterilization -Federally Funded");
		putMap("117", "Sterilization - Female");
		putMap("118", "Sterilization - Laparoscopy/Pomeroy");
		putMap("119", "Sterilization - Non-Federally Funded");
		putMap("120", "Sterilization - Secondary");
		putMap("121", "Tranquilizers");
		putMap("122", "Transfer - Acknowledgement");
		putMap("123", "Transfer - Authorization");
		putMap("124", "Transfer Certification - Physician");
		putMap("125", "Transfer/Discharge Request");
		putMap("126", "Transfer for Non-Medical Reasons");
		putMap("127", "Transfer - Interfaculty Neonatal");
		putMap("128", "Transfer Refusal");
		putMap("129", "Transfer Refusal of Further Treatment");
		putMap("130", "Treadmill & EKG");
		putMap("131", "Treadmill, Thallium-201");
		putMap("132", "Typhoid");
		putMap("133", "Use of Investigational Device");
		putMap("134", "Use of Investigational Drug");
		putMap("135", "Venogram");
		putMap("136", "Videotape");

	}

}
