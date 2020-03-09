package hl7.model.V2_4.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class IN2 extends hl7.model.V2_31.segment.IN2{

	public static final String VERSION = "2.4";
	
	public static int SIZE = 72;
	public DataStructure[][] components = new DataStructure[SIZE][];
	public static DataStructure[] standard = new DataStructure[SIZE];
	public static Table[] tables = new Table[SIZE];
	public static String[] descriptions = new String[SIZE];
	public static boolean[] required = new boolean[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] conditional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	public static int[] minLength = new int[SIZE];
	public static int[] maxLength = new int[SIZE];
	
	static{
		standard[0]=hl7.pseudo.datastructure.CX.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[2]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[4]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[6]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[8]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[10]=hl7.pseudo.datastructure.CE.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[18]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[21]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[22]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[24]=hl7.pseudo.datastructure.CX.CLASS;
		standard[25]=hl7.pseudo.datastructure.CX.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[27]=hl7.pseudo.datastructure.RMC.CLASS;
		standard[28]=hl7.pseudo.datastructure.PTA.CLASS;
		standard[29]=hl7.pseudo.datastructure.DDI.CLASS;
		standard[30]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[31]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[32]=hl7.pseudo.datastructure.CE.CLASS;
		standard[33]=hl7.pseudo.datastructure.CE.CLASS;
		standard[34]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[35]=hl7.pseudo.datastructure.CE.CLASS;
		standard[36]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[37]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[38]=hl7.pseudo.datastructure.CE.CLASS;
		standard[39]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[40]=hl7.pseudo.datastructure.CE.CLASS;
		standard[41]=hl7.pseudo.datastructure.CE.CLASS;
		standard[42]=hl7.pseudo.datastructure.CE.CLASS;
		standard[43]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[44]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[45]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[46]=hl7.pseudo.datastructure.JCC.CLASS;
		standard[47]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[48]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[49]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[50]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[51]=hl7.pseudo.datastructure.XPN.CLASS;
		standard[52]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[53]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[54]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[55]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[56]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[57]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[58]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[59]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[60]=hl7.pseudo.datastructure.CX.CLASS;
		standard[61]=hl7.pseudo.datastructure.CE.CLASS;
		standard[62]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[63]=hl7.pseudo.datastructure.XTN.CLASS;
		standard[64]=hl7.pseudo.datastructure.CE.CLASS;
		standard[65]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[66]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[67]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[68]=hl7.pseudo.datastructure.XON.CLASS;
		standard[69]=hl7.pseudo.datastructure.XON.CLASS;
		standard[70]=hl7.pseudo.datastructure.CE.CLASS;
		standard[71]=hl7.pseudo.datastructure.CE.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=hl7.model.V2_4.table.Table0139.getInstance();
		tables[4]=hl7.model.V2_4.table.Table0137.getInstance();
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=null;
		tables[9]=null;
		tables[10]=hl7.model.V2_4.table.Table0342.getInstance();
		tables[11]=null;
		tables[12]=null;
		tables[13]=hl7.model.V2_4.table.Table0140.getInstance();
		tables[14]=hl7.model.V2_4.table.Table0141.getInstance();
		tables[15]=hl7.model.V2_4.table.Table0142.getInstance();
		tables[16]=null;
		tables[17]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[18]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[19]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=hl7.model.V2_4.table.Table0143.getInstance();
		tables[24]=null;
		tables[25]=null;
		tables[26]=hl7.model.V2_4.table.Table0144.getInstance();
		tables[27]=hl7.model.V2_4.table.Table0145.getInstance();
		tables[28]=hl7.model.V2_4.table.Table0147.getInstance();
		tables[29]=null;
		tables[30]=hl7.model.V2_4.table.Table0223.getInstance();
		tables[31]=hl7.model.V2_4.table.Table0009.getInstance();
		tables[32]=hl7.model.V2_4.table.Table0171.getInstance();
		tables[33]=hl7.model.V2_4.table.Table0296.getInstance();
		tables[34]=hl7.model.V2_4.table.Table0220.getInstance();
		tables[35]=hl7.model.V2_4.table.Table0215.getInstance();
		tables[36]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[37]=hl7.model.V2_4.table.Table0231.getInstance();
		tables[38]=hl7.model.V2_4.table.Table0006.getInstance();
		tables[39]=null;
		tables[40]=hl7.model.V2_4.table.Table0212.getInstance();
		tables[41]=hl7.model.V2_4.table.Table0189.getInstance();
		tables[42]=hl7.model.V2_4.table.Table0002.getInstance();
		tables[43]=null;
		tables[44]=null;
		tables[45]=null;
		tables[46]=hl7.model.V2_4.table.Table0327.getInstance();
		tables[47]=hl7.model.V2_4.table.Table0311.getInstance();
		tables[48]=null;
		tables[49]=null;
		tables[50]=hl7.model.V2_4.table.Table0222.getInstance();
		tables[51]=null;
		tables[52]=null;
		tables[53]=hl7.model.V2_4.table.Table0222.getInstance();
		tables[54]=null;
		tables[55]=null;
		tables[56]=hl7.model.V2_4.table.Table0232.getInstance();
		tables[57]=null;
		tables[58]=hl7.model.V2_4.table.Table0312.getInstance();
		tables[59]=hl7.model.V2_4.table.Table0313.getInstance();
		tables[60]=null;
		tables[61]=hl7.model.V2_4.table.Table0063.getInstance();
		tables[62]=null;
		tables[63]=null;
		tables[64]=hl7.model.V2_4.table.Table0343.getInstance();
		tables[65]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[66]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[67]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[68]=null;
		tables[69]=null;
		tables[70]=hl7.model.V2_4.table.Table0005.getInstance();
		tables[71]=hl7.model.V2_4.table.Table0344.getInstance();
		
		descriptions[0]="INSUREDS_EMPLOYEE_ID";
		descriptions[1]="INSUREDS_SOCIAL_SECURITY_NUMBER";
		descriptions[2]="INSUREDS_EMPLOYERS_NAME_AND_ID";
		descriptions[3]="EMPLOYER_INFORMATION_DATA";
		descriptions[4]="MAIL_CLAIM_PARTY";
		descriptions[5]="MEDICARE_HEALTH_INS_CARD_NUMBER";
		descriptions[6]="MEDICAID_CASE_NAME";
		descriptions[7]="MEDICAID_CASE_NUMBER";
		descriptions[8]="MILITARY_SPONSOR_NAME";
		descriptions[9]="MILITARY_ID_NUMBER";
		descriptions[10]="DEPENDENT_OF_MILITARY_RECIPIENT";
		descriptions[11]="MILITARY_ORGANIZATION";
		descriptions[12]="MILITARY_STATION";
		descriptions[13]="MILITARY_SERVICE";
		descriptions[14]="MILITARY_RANK_GRADE";
		descriptions[15]="MILITARY_STATUS";
		descriptions[16]="MILITARY_RETIRE_DATE";
		descriptions[17]="MILITARY_NON_AVAIL_CERT_ON_FILE";
		descriptions[18]="BABY_COVERAGE";
		descriptions[19]="COMBINE_BABY_BILL";
		descriptions[20]="BLOOD_DEDUCTIBLE";
		descriptions[21]="SPECIAL_COVERAGE_APPROVAL_NAME";
		descriptions[22]="SPECIAL_COVERAGE_APPROVAL_TITLE";
		descriptions[23]="NON_COVERED_INSURANCE_CODE";
		descriptions[24]="PAYOR_ID";
		descriptions[25]="PAYOR_SUBSCRIBER_ID";
		descriptions[26]="ELIGIBILITY_SOURCE";
		descriptions[27]="ROOM_COVERAGE_TYPE_AMOUNT";
		descriptions[28]="POLICY_TYPE_AMOUNT";
		descriptions[29]="DAILY_DEDUCTIBLE";
		descriptions[30]="LIVING_DEPENDENCY";
		descriptions[31]="AMBULATORY_STATUS";
		descriptions[32]="CITIZENSHIP";
		descriptions[33]="PRIMARY_LANGUAGE";
		descriptions[34]="LIVING_ARRANGEMENT";
		descriptions[35]="PUBLICITY_CODE";
		descriptions[36]="PROTECTION_INDICATOR";
		descriptions[37]="STUDENT_INDICATOR";
		descriptions[38]="RELIGION";
		descriptions[39]="MOTHERS_MAIDEN_NAME";
		descriptions[40]="NATIONALITY";
		descriptions[41]="ETHNIC_GROUP";
		descriptions[42]="MARITAL_STATUS";
		descriptions[43]="INSUREDS_EMPLOYMENT_START_DATE";
		descriptions[44]="EMPLOYMENT_STOP_DATE";
		descriptions[45]="JOB_TITLE";
		descriptions[46]="JOB_CODE_CLASS";
		descriptions[47]="JOB_STATUS";
		descriptions[48]="EMPLOYER_CONTACT_PERSON_NAME";
		descriptions[49]="EMPLOYER_CONTACT_PERSON_PHONE_NUMBER";
		descriptions[50]="EMPLOYER_CONTACT_REASON";
		descriptions[51]="INSUREDS_CONTACT_PERSONS_NAME";
		descriptions[52]="INSUREDS_CONTACT_PERSON_PHONE_NUMBER";
		descriptions[53]="INSUREDS_CONTACT_PERSON_REASON";
		descriptions[54]="RELATIONSHIP_TO_THE_PATIENT_START_DATE";
		descriptions[55]="RELATIONSHIP_TO_THE_PATIENT_STOP_DATE";
		descriptions[56]="INSURANCE_CO_CONTACT_REASON";
		descriptions[57]="INSURANCE_CO_CONTACT_PHONE_NUMBER";
		descriptions[58]="POLICY_SCOPE";
		descriptions[59]="POLICY_SOURCE";
		descriptions[60]="PATIENT_MEMBER_NUMBER";
		descriptions[61]="GUARANTORS_RELATIONSHIP_TO_INSURED";
		descriptions[62]="INSUREDS_PHONE_NUMBER_HOME";
		descriptions[63]="INSUREDS_EMPLOYER_PHONE_NUMBER";
		descriptions[64]="MILITARY_HANDICAPPED_PROGRAM";
		descriptions[65]="SUSPEND_FLAG";
		descriptions[66]="COPAY_LIMIT_FLAG";
		descriptions[67]="STOPLOSS_LIMIT_FLAG";
		descriptions[68]="INSURED_ORGANIZATION_NAME_AND_ID";
		descriptions[69]="INSURED_EMPLOYER_ORGANIZATION_NAME_AND_ID";
		descriptions[70]="RACE";
		descriptions[71]="HCFA_PATIENTS_RELATIONSHIP_TO_INSURED";

		required[0]=false;
		required[1]=false;
		required[2]=false;
		required[3]=false;
		required[4]=false;
		required[5]=false;
		required[6]=false;
		required[7]=false;
		required[8]=false;
		required[9]=false;
		required[10]=false;
		required[11]=false;
		required[12]=false;
		required[13]=false;
		required[14]=false;
		required[15]=false;
		required[16]=false;
		required[17]=false;
		required[18]=false;
		required[19]=false;
		required[20]=false;
		required[21]=false;
		required[22]=false;
		required[23]=false;
		required[24]=false;
		required[25]=false;
		required[26]=false;
		required[27]=false;
		required[28]=false;
		required[29]=false;
		required[30]=false;
		required[31]=false;
		required[32]=false;
		required[33]=false;
		required[34]=false;
		required[35]=false;
		required[36]=false;
		required[37]=false;
		required[38]=false;
		required[39]=false;
		required[40]=false;
		required[41]=false;
		required[42]=false;
		required[43]=false;
		required[44]=false;
		required[45]=false;
		required[46]=false;
		required[47]=false;
		required[48]=false;
		required[49]=false;
		required[50]=false;
		required[51]=false;
		required[52]=false;
		required[53]=false;
		required[54]=false;
		required[55]=false;
		required[56]=false;
		required[57]=false;
		required[58]=false;
		required[59]=false;
		required[60]=false;
		required[61]=false;
		required[62]=false;
		required[63]=false;
		required[64]=false;
		required[65]=false;
		required[66]=false;
		required[67]=false;
		required[68]=false;
		required[69]=false;
		required[70]=false;
		required[71]=false;
		
		optional[0]=true;
		optional[1]=true;
		optional[2]=true;
		optional[3]=true;
		optional[4]=true;
		optional[5]=true;
		optional[6]=true;
		optional[7]=true;
		optional[8]=true;
		optional[9]=true;
		optional[10]=true;
		optional[11]=true;
		optional[12]=true;
		optional[13]=true;
		optional[14]=true;
		optional[15]=true;
		optional[16]=true;
		optional[17]=true;
		optional[18]=true;
		optional[19]=true;
		optional[20]=true;
		optional[21]=true;
		optional[22]=true;
		optional[23]=true;
		optional[24]=true;
		optional[25]=true;
		optional[26]=true;
		optional[27]=true;
		optional[28]=true;
		optional[29]=true;
		optional[30]=true;
		optional[31]=true;
		optional[32]=true;
		optional[33]=true;
		optional[34]=true;
		optional[35]=true;
		optional[36]=true;
		optional[37]=true;
		optional[38]=true;
		optional[39]=true;
		optional[40]=true;
		optional[41]=true;
		optional[42]=true;
		optional[43]=true;
		optional[44]=true;
		optional[45]=true;
		optional[46]=true;
		optional[47]=true;
		optional[48]=true;
		optional[49]=true;
		optional[50]=true;
		optional[51]=true;
		optional[52]=true;
		optional[53]=true;
		optional[54]=true;
		optional[55]=true;
		optional[56]=true;
		optional[57]=true;
		optional[58]=true;
		optional[59]=true;
		optional[60]=true;
		optional[61]=true;
		optional[62]=true;
		optional[63]=true;
		optional[64]=true;
		optional[65]=true;
		optional[66]=true;
		optional[67]=true;
		optional[68]=true;
		optional[69]=true;
		optional[70]=true;
		optional[71]=true;

		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=false;
		conditional[8]=false;
		conditional[9]=false;
		conditional[10]=false;
		conditional[11]=false;
		conditional[12]=false;
		conditional[13]=false;
		conditional[14]=false;
		conditional[15]=false;
		conditional[16]=false;
		conditional[17]=false;
		conditional[18]=false;
		conditional[19]=false;
		conditional[20]=false;
		conditional[21]=false;
		conditional[22]=false;
		conditional[23]=false;
		conditional[24]=false;
		conditional[25]=false;
		conditional[26]=false;
		conditional[27]=false;
		conditional[28]=false;
		conditional[29]=false;
		conditional[30]=false;
		conditional[31]=false;
		conditional[32]=false;
		conditional[33]=false;
		conditional[34]=false;
		conditional[35]=false;
		conditional[36]=false;
		conditional[37]=false;
		conditional[38]=false;
		conditional[39]=false;
		conditional[40]=false;
		conditional[41]=false;
		conditional[42]=false;
		conditional[43]=false;
		conditional[44]=false;
		conditional[45]=false;
		conditional[46]=false;
		conditional[47]=false;
		conditional[48]=false;
		conditional[49]=false;
		conditional[50]=false;
		conditional[51]=false;
		conditional[52]=false;
		conditional[53]=false;
		conditional[54]=false;
		conditional[55]=false;
		conditional[56]=false;
		conditional[57]=false;
		conditional[58]=false;
		conditional[59]=false;
		conditional[60]=false;
		conditional[61]=false;
		conditional[62]=false;
		conditional[63]=false;
		conditional[64]=false;
		conditional[65]=false;
		conditional[66]=false;
		conditional[67]=false;
		conditional[68]=false;
		conditional[69]=false;
		conditional[70]=false;
		conditional[71]=false;
	
		repeatable [0]=true;
		repeatable [1]=true;
		repeatable [2]=true;
		repeatable [3]=true;
		repeatable [4]=true;
		repeatable [5]=true;
		repeatable [6]=true;
		repeatable [7]=true;
		repeatable [8]=true;
		repeatable [9]=true;
		repeatable [10]=true;
		repeatable [11]=true;
		repeatable [12]=true;
		repeatable [13]=true;
		repeatable [14]=true;
		repeatable [15]=true;
		repeatable [16]=true;
		repeatable [17]=true;
		repeatable [18]=true;
		repeatable [19]=true;
		repeatable [20]=true;
		repeatable [21]=true;
		repeatable [22]=true;
		repeatable [23]=true;
		repeatable [24]=true;
		repeatable [25]=true;
		repeatable [26]=true;
		repeatable [27]=true;
		repeatable [28]=true;
		repeatable [29]=true;
		repeatable [30]=true;
		repeatable [31]=true;
		repeatable [32]=true;
		repeatable [33]=true;
		repeatable [34]=true;
		repeatable [35]=true;
		repeatable [36]=true;
		repeatable [37]=true;
		repeatable [38]=true;
		repeatable [39]=true;
		repeatable [40]=true;
		repeatable [41]=true;
		repeatable [42]=true;
		repeatable [43]=true;
		repeatable [44]=true;
		repeatable [45]=true;
		repeatable [46]=true;
		repeatable [47]=true;
		repeatable [48]=true;
		repeatable [49]=true;
		repeatable [50]=true;
		repeatable [51]=true;
		repeatable [52]=true;
		repeatable [53]=true;
		repeatable [54]=true;
		repeatable [55]=true;
		repeatable [56]=true;
		repeatable [57]=true;
		repeatable [58]=true;
		repeatable [59]=true;
		repeatable [60]=true;
		repeatable [61]=true;
		repeatable [62]=true;
		repeatable [63]=true;
		repeatable [64]=true;
		repeatable [65]=true;
		repeatable [66]=true;
		repeatable [67]=true;
		repeatable [68]=true;
		repeatable [69]=true;
		repeatable [70]=true;
		repeatable [71]=true;
	
		minLength[0]=0;
		minLength[1]=0;
		minLength[2]=0;
		minLength[3]=0;
		minLength[4]=0;
		minLength[5]=0;
		minLength[6]=0;
		minLength[7]=0;
		minLength[8]=0;
		minLength[9]=0;
		minLength[10]=0;
		minLength[11]=0;
		minLength[12]=0;
		minLength[13]=0;
		minLength[14]=0;
		minLength[15]=0;
		minLength[16]=0;
		minLength[17]=0;
		minLength[18]=0;
		minLength[19]=0;
		minLength[20]=0;
		minLength[21]=0;
		minLength[22]=0;
		minLength[23]=0;
		minLength[24]=0;
		minLength[25]=0;
		minLength[26]=0;
		minLength[27]=0;
		minLength[28]=0;
		minLength[29]=0;
		minLength[30]=0;
		minLength[31]=0;
		minLength[32]=0;
		minLength[33]=0;
		minLength[34]=0;
		minLength[35]=0;
		minLength[36]=0;
		minLength[37]=0;
		minLength[38]=0;
		minLength[39]=0;
		minLength[40]=0;
		minLength[41]=0;
		minLength[42]=0;
		minLength[43]=0;
		minLength[44]=0;
		minLength[45]=0;
		minLength[46]=0;
		minLength[47]=0;
		minLength[48]=0;
		minLength[49]=0;
		minLength[50]=0;
		minLength[51]=0;
		minLength[52]=0;
		minLength[53]=0;
		minLength[54]=0;
		minLength[55]=0;
		minLength[56]=0;
		minLength[57]=0;
		minLength[58]=0;
		minLength[59]=0;
		minLength[60]=0;
		minLength[61]=0;
		minLength[62]=0;
		minLength[63]=0;
		minLength[64]=0;
		minLength[65]=0;
		minLength[66]=0;
		minLength[67]=0;
		minLength[68]=0;
		minLength[69]=0;
		minLength[70]=0;
		minLength[71]=0;
		maxLength[0]=250;
		maxLength[1]=11;
		maxLength[2]=250;
		maxLength[3]=1;
		maxLength[4]=1;
		maxLength[5]=15;
		maxLength[6]=250;
		maxLength[7]=15;
		maxLength[8]=250;
		maxLength[9]=20;
		maxLength[10]=250;
		maxLength[11]=25;
		maxLength[12]=25;
		maxLength[13]=14;
		maxLength[14]=2;
		maxLength[15]=3;
		maxLength[16]=8;
		maxLength[17]=1;
		maxLength[18]=1;
		maxLength[19]=1;
		maxLength[20]=1;
		maxLength[21]=250;
		maxLength[22]=30;
		maxLength[23]=8;
		maxLength[24]=250;
		maxLength[25]=250;
		maxLength[26]=1;
		maxLength[27]=250;
		maxLength[28]=250;
		maxLength[29]=250;
		maxLength[30]=2;
		maxLength[31]=2;
		maxLength[32]=250;
		maxLength[33]=250;
		maxLength[34]=2;
		maxLength[35]=250;
		maxLength[36]=1;
		maxLength[37]=2;
		maxLength[38]=250;
		maxLength[39]=250;
		maxLength[40]=250;
		maxLength[41]=250;
		maxLength[42]=250;
		maxLength[43]=8;
		maxLength[44]=8;
		maxLength[45]=20;
		maxLength[46]=20;
		maxLength[47]=2;
		maxLength[48]=250;
		maxLength[49]=250;
		maxLength[50]=2;
		maxLength[51]=250;
		maxLength[52]=250;
		maxLength[53]=2;
		maxLength[54]=8;
		maxLength[55]=8;
		maxLength[56]=2;
		maxLength[57]=250;
		maxLength[58]=2;
		maxLength[59]=2;
		maxLength[60]=250;
		maxLength[61]=250;
		maxLength[62]=250;
		maxLength[63]=250;
		maxLength[64]=250;
		maxLength[65]=1;
		maxLength[66]=1;
		maxLength[67]=1;
		maxLength[68]=250;
		maxLength[69]=250;
		maxLength[70]=250;
		maxLength[71]=250;
	}
	
	public IN2(){
		type = Segment.IN2;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.IN2 seg = new hl7.pseudo.segment.IN2();
		seg.originalVersion = originalVersion;
		seg.setVersion = setVersion;
		return seg;
	}
	
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure[] dataStructures = components[i];
			for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
				DataStructure dataStructure = components[i][c];
				if(dataStructure!=null) dataStructure.setVersion(setVersion);
			}
		}
	}

	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			DataStructure[] dataStructures = components[i];
			for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
				DataStructure dataStructure = components[i][c];
				if(dataStructure!=null) dataStructure.originalVersion(originalVersion);
			}
		}
	}

	public DataStructure[][] getComponents(){
		if(setVersion.equals(VERSION)){
			return components;
		}else{
			return super.getComponents();
		}
	}
	
	private boolean compiled = false;	//최초 컴파일 여부 확인
	public void decode(String message) throws Exception {
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//최초 컴파일 여부 확인
			
			char separator = MessageStructure.FIELD_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		


			for(int i=1; i<components.length&&comps!=null&&i<comps.length; i++){
				//반복 메시지 처리
				String[] messages = divide(comps[i], MessageStructure.REPEATITION_SEPARATOR);
				if(messages==null) continue;
				DataStructure[] dataStructures = new DataStructure[messages.length];
				components[i-1] = dataStructures;
				for(int c=0; c<messages.length; c++){
					components[i-1][c] = standard[i-1].cloneClass(originalVersion, setVersion);
					components[i-1][c].originalVersion(originalVersion);
					components[i-1][c].decode(messages[c]);
				}
			}


		}
	}
	
	/* -----------------------------------------------------------------
	 * 이전 버전으로 매핑 components:구버전, subComponents:신버전
	 * 신버전 메시지-->구버전 파서(상위호환)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion, String prevVersion) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			DataStructure[] subComps = new DataStructure[subComponents[i].length];
			components[i] = subComps;
			for(int c=0; c<subComps.length; c++){
				if(i==0) components[i][c] = subComponents[i][c];
				if(i==1) components[i][c] = subComponents[i][c];
				if(i==2) components[i][c] = subComponents[i][c];
				if(i==3) components[i][c] = subComponents[i][c];
				if(i==4) components[i][c] = subComponents[i][c];
				if(i==5) components[i][c] = subComponents[i][c];
				if(i==6) components[i][c] = subComponents[i][c];
				if(i==7) components[i][c] = subComponents[i][c];
				if(i==8) components[i][c] = subComponents[i][c];
				if(i==9) components[i][c] = subComponents[i][c];
				if(i==10) components[i][c] = subComponents[i][c];
				if(i==11) components[i][c] = subComponents[i][c];
				if(i==12) components[i][c] = subComponents[i][c];
				if(i==13) components[i][c] = subComponents[i][c];
				if(i==14) components[i][c] = subComponents[i][c];
				if(i==15) components[i][c] = subComponents[i][c];
				if(i==16) components[i][c] = subComponents[i][c];
				if(i==17) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
				if(i==19) components[i][c] = subComponents[i][c];
				if(i==20) components[i][c] = subComponents[i][c];
				if(i==21) components[i][c] = subComponents[i][c];
				if(i==22) components[i][c] = subComponents[i][c];
				if(i==23) components[i][c] = subComponents[i][c];
				if(i==24) components[i][c] = subComponents[i][c];
				if(i==25) components[i][c] = subComponents[i][c];
				if(i==26) components[i][c] = subComponents[i][c];
				if(i==27) components[i][c] = subComponents[i][c];
				if(i==28) components[i][c] = subComponents[i][c];
				if(i==29) components[i][c] = subComponents[i][c];
				if(i==30) components[i][c] = subComponents[i][c];
				if(i==31) components[i][c] = subComponents[i][c];
				if(i==32) components[i][c] = subComponents[i][c];
				if(i==33) components[i][c] = subComponents[i][c];
				if(i==34) components[i][c] = subComponents[i][c];
				if(i==35) components[i][c] = subComponents[i][c];
				if(i==36) components[i][c] = subComponents[i][c];
				if(i==37) components[i][c] = subComponents[i][c];
				if(i==38) components[i][c] = subComponents[i][c];
				if(i==39) components[i][c] = subComponents[i][c];
				if(i==40) components[i][c] = subComponents[i][c];
				if(i==41) components[i][c] = subComponents[i][c];
				if(i==42) components[i][c] = subComponents[i][c];
				if(i==43) components[i][c] = subComponents[i][c];
				if(i==44) components[i][c] = subComponents[i][c];
				if(i==45) components[i][c] = subComponents[i][c];
				if(i==46) components[i][c] = subComponents[i][c];
				if(i==47) components[i][c] = subComponents[i][c];
				if(i==48) components[i][c] = subComponents[i][c];
				if(i==49) components[i][c] = subComponents[i][c];
				if(i==50) components[i][c] = subComponents[i][c];
				if(i==51) components[i][c] = subComponents[i][c];
				if(i==52) components[i][c] = subComponents[i][c];
				if(i==53) components[i][c] = subComponents[i][c];
				if(i==54) components[i][c] = subComponents[i][c];
				if(i==55) components[i][c] = subComponents[i][c];
				if(i==56) components[i][c] = subComponents[i][c];
				if(i==57) components[i][c] = subComponents[i][c];
				if(i==58) components[i][c] = subComponents[i][c];
				if(i==59) components[i][c] = subComponents[i][c];
				if(i==60) components[i][c] = subComponents[i][c];
				if(i==61) components[i][c] = subComponents[i][c];
				if(i==62) components[i][c] = subComponents[i][c];
				if(i==63) components[i][c] = subComponents[i][c];
				if(i==64) components[i][c] = subComponents[i][c];
				if(i==65) components[i][c] = subComponents[i][c];
				if(i==66) components[i][c] = subComponents[i][c];
				if(i==67) components[i][c] = subComponents[i][c];
				if(i==68) components[i][c] = subComponents[i][c];
				if(i==69) components[i][c] = subComponents[i][c];
				if(i==70) components[i][c] = subComponents[i][c];
				if(i==71) components[i][c] = subComponents[i][c];
				if(components[i][c]==null) continue;
				components[i][c].depth(subComponents[i][c].depth);
				subComponents[i][c].setVersion(prevVersion);
				String data = subComponents[i][c].encode();
				components[i][c].decode(data);
			}
		}
	}
	
	/* -----------------------------------------------------------------
	 * 이후 버전으로 매핑 components:구버전, subComponents:신버전
	 * 구버전 메시지-->신버전 파서(하위호환)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			DataStructure[] comps = new DataStructure[components[i].length];
			subComponents[i] = comps;
			for(int c=0; c<comps.length; c++){
				if(i==10) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==32) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==33) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==35) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==38) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==40) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==41) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==42) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==61) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==64) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==70) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==71) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==0) subComponents[i][c] = components[i][c];
				if(i==1) subComponents[i][c] = components[i][c];
				if(i==2) subComponents[i][c] = components[i][c];
				if(i==3) subComponents[i][c] = components[i][c];
				if(i==4) subComponents[i][c] = components[i][c];
				if(i==5) subComponents[i][c] = components[i][c];
				if(i==6) subComponents[i][c] = components[i][c];
				if(i==7) subComponents[i][c] = components[i][c];
				if(i==8) subComponents[i][c] = components[i][c];
				if(i==9) subComponents[i][c] = components[i][c];
				if(i==11) subComponents[i][c] = components[i][c];
				if(i==12) subComponents[i][c] = components[i][c];
				if(i==13) subComponents[i][c] = components[i][c];
				if(i==14) subComponents[i][c] = components[i][c];
				if(i==15) subComponents[i][c] = components[i][c];
				if(i==16) subComponents[i][c] = components[i][c];
				if(i==17) subComponents[i][c] = components[i][c];
				if(i==18) subComponents[i][c] = components[i][c];
				if(i==19) subComponents[i][c] = components[i][c];
				if(i==20) subComponents[i][c] = components[i][c];
				if(i==21) subComponents[i][c] = components[i][c];
				if(i==22) subComponents[i][c] = components[i][c];
				if(i==23) subComponents[i][c] = components[i][c];
				if(i==24) subComponents[i][c] = components[i][c];
				if(i==25) subComponents[i][c] = components[i][c];
				if(i==26) subComponents[i][c] = components[i][c];
				if(i==27) subComponents[i][c] = components[i][c];
				if(i==28) subComponents[i][c] = components[i][c];
				if(i==29) subComponents[i][c] = components[i][c];
				if(i==30) subComponents[i][c] = components[i][c];
				if(i==31) subComponents[i][c] = components[i][c];
				if(i==34) subComponents[i][c] = components[i][c];
				if(i==36) subComponents[i][c] = components[i][c];
				if(i==37) subComponents[i][c] = components[i][c];
				if(i==39) subComponents[i][c] = components[i][c];
				if(i==43) subComponents[i][c] = components[i][c];
				if(i==44) subComponents[i][c] = components[i][c];
				if(i==45) subComponents[i][c] = components[i][c];
				if(i==46) subComponents[i][c] = components[i][c];
				if(i==47) subComponents[i][c] = components[i][c];
				if(i==48) subComponents[i][c] = components[i][c];
				if(i==49) subComponents[i][c] = components[i][c];
				if(i==50) subComponents[i][c] = components[i][c];
				if(i==51) subComponents[i][c] = components[i][c];
				if(i==52) subComponents[i][c] = components[i][c];
				if(i==53) subComponents[i][c] = components[i][c];
				if(i==54) subComponents[i][c] = components[i][c];
				if(i==55) subComponents[i][c] = components[i][c];
				if(i==56) subComponents[i][c] = components[i][c];
				if(i==57) subComponents[i][c] = components[i][c];
				if(i==58) subComponents[i][c] = components[i][c];
				if(i==59) subComponents[i][c] = components[i][c];
				if(i==60) subComponents[i][c] = components[i][c];
				if(i==62) subComponents[i][c] = components[i][c];
				if(i==63) subComponents[i][c] = components[i][c];
				if(i==65) subComponents[i][c] = components[i][c];
				if(i==66) subComponents[i][c] = components[i][c];
				if(i==67) subComponents[i][c] = components[i][c];
				if(i==68) subComponents[i][c] = components[i][c];
				if(i==69) subComponents[i][c] = components[i][c];
				if(components[i][c]==null) continue;
				subComponents[i][c].depth(components[i][c].depth);
				components[i][c].setVersion(originalVersion);
				String data = components[i][c].encode();
				subComponents[i][c].decode(data);
			}
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//가장 마지막 메소드에서 위치찾기 옵션 설정
		return encode(null);
	}
	
	public String encode(DataStructure[][] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //실제 버전의 위치 찾기
			//실제 버전이 현재 위치가 아닐 때
			//실제 버전 위치 찾아가기
			return super.encode(null);
			
		}else{//실제 버전의 위치 찾기
			seekOriginalVersion = false;
			//실제 버전이 현재 위치일 때
			if(setVersion.equals(VERSION)){ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치일 때
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //설정 버전의 위치 찾기
				//설정 버전이 현재 위치가 아닐 때
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //버전으로 이동 방향 찾기
					//설정 버전이 현재 버전보다 낮을 때 (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
						hl7.model.V2_31.segment.IN2 type = (hl7.model.V2_31.segment.IN2)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION);
					//}
					//설정 버전의 위치로 찾아가기
					return super.encode(components);
					
				}else{ //버전으로 이동 방향 찾기
					/*-------------------------------------------------------------
					 *설정 버전이 현재 버전보다 높을 때(forward)
					 *이후 버전으로 Casting 후 forward 호출
					 *마지막 버전은 생략 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//하위 버전으로 인코딩 시 해당 위치를 찾아 가도록 (메소드 오버라이딩 때문에 처음부터 다시 찾아가야 함)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_5.segment.IN2 type = (hl7.model.V2_5.segment.IN2)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}
	
	public String makeMessage(DataStructure[][] components, String version) throws Exception{
		if(VERSION.equals(version)){
			setCharacter(components, VERSION);
			String message = "";
			boolean add = false;	//뒤쪽에서 컴포넌트가 존재할 때 true
			char separator = MessageStructure.FIELD_SEPARATOR;
			for(int i=components.length-1; i>=0; i--){
				DataStructure[] dataStructures = components[i];
				if(dataStructures!=null || required[i]) add=true;	//필수항목부터 추가
				String component = "";
				for(int c=0; dataStructures!=null&&c<dataStructures.length; c++){
					if(!repeatable[i]&&c>0) continue;
					DataStructure comp = dataStructures[c];
					if(comp==null) continue;
					String data = comp.encode();
					if(data==null) data="";
					if(maxLength[i]>0&&data.length()>maxLength[i]) data=data.substring(0, maxLength[i]);
					if(c>0) component += MessageStructure.REPEATITION_SEPARATOR;
					component += data;
				}
				if(add) message = component + ((message.length()>0)?separator:"") + message; 
			}
			return (message.length()==0)?null:type+separator+message;
			
		}else{
			return super.makeMessage(components, version);
		}
	}
}
