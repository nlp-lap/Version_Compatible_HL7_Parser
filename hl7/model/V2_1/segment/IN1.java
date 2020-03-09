package hl7.model.V2_1.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class IN1 extends hl7.character.segment.IN1{

	public static final String VERSION = "2.1";
	
	public static int SIZE = 44;
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
		standard[0]=hl7.bean.datastructure.primitive.SI.CLASS;
		standard[1]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[4]=hl7.pseudo.datastructure.AD.CLASS;
		standard[5]=hl7.pseudo.datastructure.PN.CLASS;
		standard[6]=hl7.bean.datastructure.primitive.TN.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[15]=hl7.pseudo.datastructure.PN.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[18]=hl7.pseudo.datastructure.AD.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[21]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[22]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[25]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[28]=hl7.bean.datastructure.primitive.DT.CLASS;
		standard[29]=hl7.pseudo.datastructure.CM.CLASS;
		standard[30]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[31]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[32]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[33]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[34]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[35]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[36]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[37]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[38]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[39]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[40]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[41]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[42]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[43]=hl7.pseudo.datastructure.AD.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_1.table.Table0072.getInstance();
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=null;
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		tables[14]=hl7.model.V2_1.table.Table0086.getInstance();
		tables[15]=null;
		tables[16]=hl7.model.V2_1.table.Table0063.getInstance();
		tables[17]=null;
		tables[18]=null;
		tables[19]=null;
		tables[20]=null;
		tables[21]=null;
		tables[22]=hl7.model.V2_1.table.Table0081.getInstance();
		tables[23]=null;
		tables[24]=hl7.model.V2_1.table.Table0094.getInstance();
		tables[25]=null;
		tables[26]=hl7.model.V2_1.table.Table0093.getInstance();
		tables[27]=null;
		tables[28]=null;
		tables[29]=null;
		tables[30]=hl7.model.V2_1.table.Table0098.getInstance();
		tables[31]=hl7.model.V2_1.table.Table0022.getInstance();
		tables[32]=null;
		tables[33]=null;
		tables[34]=hl7.model.V2_1.table.Table0042.getInstance();
		tables[35]=null;
		tables[36]=null;
		tables[37]=null;
		tables[38]=null;
		tables[39]=null;
		tables[40]=null;
		tables[41]=hl7.model.V2_1.table.Table0066.getInstance();
		tables[42]=hl7.model.V2_1.table.Table0001.getInstance();
		tables[43]=null;
		
		descriptions[0]="SET_ID_INSURANCE";
		descriptions[1]="INSURANCE_PLAN_ID";
		descriptions[2]="INSURANCE_COMPANY_ID";
		descriptions[3]="INSURANCE_COMPANY_NAME";
		descriptions[4]="INSURANCE_COMPANY_ADDRESS";
		descriptions[5]="INSURANCE_CO_CONTACT_PERS";
		descriptions[6]="INSURANCE_CO_PHONE_NUMBER";
		descriptions[7]="GROUP_NUMBER";
		descriptions[8]="GROUP_NAME";
		descriptions[9]="INSUREDS_GROUP_EMP_ID";
		descriptions[10]="INSUREDS_GROUP_EMP_NAME";
		descriptions[11]="PLAN_EFFECTIVE_DATE";
		descriptions[12]="PLAN_EXPIRATION_DATE";
		descriptions[13]="AUTHORIZATION_INFORMATION";
		descriptions[14]="PLAN_TYPE";
		descriptions[15]="NAME_OF_INSURED";
		descriptions[16]="INSUREDS_RELATIONSHIP_TO_PATIENT";
		descriptions[17]="INSUREDS_DATE_OF_BIRTH";
		descriptions[18]="INSUREDS_ADDRESS";
		descriptions[19]="ASSIGNMENT_OF_BENEFITS";
		descriptions[20]="COORDINATION_OF_BENEFITS";
		descriptions[21]="COORD_OF_BEN_PRIORITY";
		descriptions[22]="NOTICE_OF_ADMISSION_CODE";
		descriptions[23]="NOTICE_OF_ADMISSION_DATE";
		descriptions[24]="RPT_OF_ELIGIBILITY_CODE";
		descriptions[25]="RPT_OF_ELIGIBILITY_DATE";
		descriptions[26]="RELEASE_INFORMATION_CODE";
		descriptions[27]="PRE_ADMIT_CERT";
		descriptions[28]="VERIFICATION_DATE";
		descriptions[29]="VERIFICATION_BY";
		descriptions[30]="TYPE_OF_AGREEMENT_CODE";
		descriptions[31]="BILLING_STATUS";
		descriptions[32]="LIFETIME_RESERVE_DAYS";
		descriptions[33]="DELAY_BEFORE_L_R_DAY";
		descriptions[34]="COMPANY_PLAN_CODE";
		descriptions[35]="POLICY_NUMBER";
		descriptions[36]="POLICY_DEDUCTIBLE";
		descriptions[37]="POLICY_LIMIT_AMOUNT";
		descriptions[38]="POLICY_LIMIT_DAYS";
		descriptions[39]="ROOM_RATE_SEMI_PRIVATE";
		descriptions[40]="ROOM_RATE_PRIVATE";
		descriptions[41]="INSUREDS_EMPLOYMENT_STATUS";
		descriptions[42]="INSUREDS_SEX";
		descriptions[43]="INSUREDS_EMPLOYER_ADDRESS";

		required[0]=true;
		required[1]=true;
		required[2]=true;
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
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
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
		maxLength[0]=4;
		maxLength[1]=8;
		maxLength[2]=6;
		maxLength[3]=45;
		maxLength[4]=106;
		maxLength[5]=48;
		maxLength[6]=40;
		maxLength[7]=12;
		maxLength[8]=35;
		maxLength[9]=12;
		maxLength[10]=45;
		maxLength[11]=8;
		maxLength[12]=8;
		maxLength[13]=55;
		maxLength[14]=2;
		maxLength[15]=48;
		maxLength[16]=2;
		maxLength[17]=8;
		maxLength[18]=106;
		maxLength[19]=2;
		maxLength[20]=2;
		maxLength[21]=2;
		maxLength[22]=2;
		maxLength[23]=8;
		maxLength[24]=2;
		maxLength[25]=8;
		maxLength[26]=2;
		maxLength[27]=15;
		maxLength[28]=8;
		maxLength[29]=60;
		maxLength[30]=2;
		maxLength[31]=2;
		maxLength[32]=4;
		maxLength[33]=4;
		maxLength[34]=8;
		maxLength[35]=15;
		maxLength[36]=12;
		maxLength[37]=12;
		maxLength[38]=4;
		maxLength[39]=12;
		maxLength[40]=12;
		maxLength[41]=1;
		maxLength[42]=1;
		maxLength[43]=106;
	}
	
	public IN1(){
		type = Segment.IN1;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.IN1 seg = new hl7.pseudo.segment.IN1();
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
	
	private boolean compiled = false;	//���� ������ ���� Ȯ��
	public void decode(String message) throws Exception {
		if(MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){
			super.decode(message);
			
		}else{
			compiled = true;	//���� ������ ���� Ȯ��
			
			char separator = MessageStructure.FIELD_SEPARATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;
		


			for(int i=1; i<components.length&&comps!=null&&i<comps.length; i++){
				//�ݺ� �޽��� ó��
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
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void backward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion, String prevVersion) throws Exception{
		for(int i=0; subComponents!=null&&i<subComponents.length; i++){
			if(i>=SIZE) break;
			if(subComponents[i]==null) continue;
			DataStructure[] subComps = new DataStructure[subComponents[i].length];
			components[i] = subComps;
			for(int c=0; c<subComps.length; c++){
				if(i==13) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==28) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.DT.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==34) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ST.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==41) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.ID.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==29) components[i][c] = (subComponents[i][c]!=null)?hl7.pseudo.datastructure.CM.CLASS.cloneClass(prevVersion, prevVersion):null;
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
				if(i==30) components[i][c] = subComponents[i][c];
				if(i==31) components[i][c] = subComponents[i][c];
				if(i==32) components[i][c] = subComponents[i][c];
				if(i==33) components[i][c] = subComponents[i][c];
				if(i==35) components[i][c] = subComponents[i][c];
				if(i==36) components[i][c] = subComponents[i][c];
				if(i==37) components[i][c] = subComponents[i][c];
				if(i==38) components[i][c] = subComponents[i][c];
				if(i==39) components[i][c] = subComponents[i][c];
				if(i==40) components[i][c] = subComponents[i][c];
				if(i==42) components[i][c] = subComponents[i][c];
				if(i==43) components[i][c] = subComponents[i][c];
				if(components[i][c]==null) continue;
				components[i][c].depth(subComponents[i][c].depth);
				subComponents[i][c].setVersion(prevVersion);
				String data = subComponents[i][c].encode();
				components[i][c].decode(data);
			}
		}
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(DataStructure[][] components, DataStructure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		for(int i=0; components!=null&&i<components.length; i++){
			if(components[i]==null) continue;
			DataStructure[] comps = new DataStructure[components[i].length];
			subComponents[i] = comps;
			for(int c=0; c<comps.length; c++){
				if(components[i][c]==null) continue;
				subComponents[i][c].depth(components[i][c].depth);
				components[i][c].setVersion(originalVersion);
				String data = components[i][c].encode();
				subComponents[i][c].decode(data);
			}
		}
	}
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(DataStructure[][] subComponents) throws Exception{
		if(seekOriginalVersion&&MessageStructure.getVersionCode(originalVersion)<MessageStructure.getVersionCode(VERSION)){ //���� ������ ��ġ ã��
			//���� ������ ���� ��ġ�� �ƴ� ��
			//���� ���� ��ġ ã�ư���
			return super.encode(null);
			
		}else{//���� ������ ��ġ ã��
			seekOriginalVersion = false;
			//���� ������ ���� ��ġ�� ��
			if(setVersion.equals(VERSION)){ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� ��
				String message = this.makeMessage(components, VERSION);
				return message;
				
			}else{ //���� ������ ��ġ ã��
				//���� ������ ���� ��ġ�� �ƴ� ��
				if(MessageStructure.getVersionCode(setVersion)<MessageStructure.getVersionCode(VERSION)){ //�������� �̵� ���� ã��
					//���� ������ ���� �������� ���� �� (backward)
					//if(MessageStructure.getVersionCode(originalVersion)>=MessageStructure.getVersionCode(VERSION)){
					//}
					//���� ������ ��ġ�� ã�ư���
					return super.encode(components);
					
				}else{ //�������� �̵� ���� ã��
					/*-------------------------------------------------------------
					 *���� ������ ���� �������� ���� ��(forward)
					 *���� �������� Casting �� forward ȣ��
					 *������ ������ ���� 
					 *-----------------------------------------------------------------
					 */
					encodeVersion = VERSION;
					return this.encodeForward(encodeVersion, setVersion);
				}

			}
			
		}
	}

	public String encodeForward(String encodeVersion, String setVersion) throws Exception{
		//���� �������� ���ڵ� �� �ش� ��ġ�� ã�� ������ (�޼ҵ� �������̵� ������ ó������ �ٽ� ã�ư��� ��)
		if(encodeVersion.equals(VERSION)){
			hl7.model.V2_2.segment.IN1 type = (hl7.model.V2_2.segment.IN1)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return null;
		}
	}
	
	public String makeMessage(DataStructure[][] components, String version) throws Exception{
		if(VERSION.equals(version)){
			setCharacter(components, VERSION);
			String message = "";
			boolean add = false;	//���ʿ��� ������Ʈ�� ������ �� true
			char separator = MessageStructure.FIELD_SEPARATOR;
			for(int i=components.length-1; i>=0; i--){
				DataStructure[] dataStructures = components[i];
				if(dataStructures!=null || required[i]) add=true;	//�ʼ��׸���� �߰�
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