package hl7.model.V2_6.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class PSL extends hl7.character.segment.PSL{

	public static final String VERSION = "2.6";
	
	public static int SIZE = 48;
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
		standard[0]=hl7.pseudo.datastructure.EI.CLASS;
		standard[1]=hl7.pseudo.datastructure.EI.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.SI.CLASS;
		standard[3]=hl7.pseudo.datastructure.EI.CLASS;
		standard[4]=hl7.pseudo.datastructure.EI.CLASS;
		standard[5]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[6]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[7]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[11]=hl7.pseudo.datastructure.CQ.CLASS;
		standard[12]=hl7.pseudo.datastructure.CP.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[14]=hl7.pseudo.datastructure.CP.CLASS;
		standard[15]=hl7.pseudo.datastructure.CP.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[18]=hl7.pseudo.datastructure.EI.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[20]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[21]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[22]=hl7.pseudo.datastructure.CP.CLASS;
		standard[23]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[24]=hl7.pseudo.datastructure.CX.CLASS;
		standard[25]=hl7.pseudo.datastructure.DR.CLASS;
		standard[26]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[28]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[29]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[30]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[31]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[32]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[33]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[34]=hl7.pseudo.datastructure.CP.CLASS;
		standard[35]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[36]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[37]=hl7.pseudo.datastructure.CP.CLASS;
		standard[38]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[39]=hl7.pseudo.datastructure.CP.CLASS;
		standard[40]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[41]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[42]=hl7.pseudo.datastructure.CP.CLASS;
		standard[43]=hl7.pseudo.datastructure.CP.CLASS;
		standard[44]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[45]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[46]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[47]=hl7.bean.datastructure.primitive.ST.CLASS;
		
		tables[0]=null;
		tables[1]=null;
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=hl7.model.V2_6.table.Table0559.getInstance();
		tables[6]=hl7.model.V2_6.table.Table0879.getInstance();
		tables[7]=hl7.model.V2_6.table.Table0880.getInstance();
		tables[8]=null;
		tables[9]=null;
		tables[10]=null;
		tables[11]=hl7.model.V2_6.table.Table0560.getInstance();
		tables[12]=null;
		tables[13]=null;
		tables[14]=null;
		tables[15]=null;
		tables[16]=hl7.model.V2_6.table.Table0561.getInstance();
		tables[17]=null;
		tables[18]=null;
		tables[19]=hl7.model.V2_6.table.Table0562.getInstance();
		tables[20]=hl7.model.V2_6.table.Table0532.getInstance();
		tables[21]=hl7.model.V2_6.table.Table0879.getInstance();
		tables[22]=null;
		tables[23]=null;
		tables[24]=null;
		tables[25]=null;
		tables[26]=null;
		tables[27]=null;
		tables[28]=null;
		tables[29]=null;
		tables[30]=hl7.model.V2_6.table.Table0881.getInstance();
		tables[31]=hl7.model.V2_6.table.Table0882.getInstance();
		tables[32]=hl7.model.V2_6.table.Table0894.getInstance();
		tables[33]=null;
		tables[34]=null;
		tables[35]=null;
		tables[36]=null;
		tables[37]=null;
		tables[38]=null;
		tables[39]=null;
		tables[40]=null;
		tables[41]=null;
		tables[42]=null;
		tables[43]=null;
		tables[44]=null;
		tables[45]=null;
		tables[46]=hl7.model.V2_6.table.Table0136.getInstance();
		tables[47]=null;
		
		descriptions[0]="PROVIDER_PRODUCT_SERVICE_LINE_ITEM_NUMBER";
		descriptions[1]="PAYER_PRODUCT_SERVICE_LINE_ITEM_NUMBER";
		descriptions[2]="PRODUCT_SERVICE_LINE_ITEM_SEQUENCE_NUMBER";
		descriptions[3]="PROVIDER_TRACKING_ID";
		descriptions[4]="PAYER_TRACKING_ID";
		descriptions[5]="PRODUCT_SERVICE_LINE_ITEM_STATUS";
		descriptions[6]="PRODUCT_SERVICE_CODE";
		descriptions[7]="PRODUCT_SERVICE_CODE_MODIFIER";
		descriptions[8]="PRODUCT_SERVICE_CODE_DESCRIPTION";
		descriptions[9]="PRODUCT_SERVICE_EFFECTIVE_DATE";
		descriptions[10]="PRODUCT_SERVICE_EXPIRATION_DATE";
		descriptions[11]="PRODUCT_SERVICE_QUANTITY";
		descriptions[12]="PRODUCT_SERVICE_UNIT_COST";
		descriptions[13]="NUMBER_OF_ITEMS_PER_UNIT";
		descriptions[14]="PRODUCT_SERVICE_GROSS_AMOUNT";
		descriptions[15]="PRODUCT_SERVICE_BILLED_AMOUNT";
		descriptions[16]="PRODUCT_SERVICE_CLARIFICATION_CODE_TYPE";
		descriptions[17]="PRODUCT_SERVICE_CLARIFICATION_CODE_VALUE";
		descriptions[18]="HEALTH_DOCUMENT_REFERENCE_IDENTIFIER";
		descriptions[19]="PROCESSING_CONSIDERATION_CODE";
		descriptions[20]="RESTRICTED_DISCLOSURE_INDICATOR";
		descriptions[21]="RELATED_PRODUCT_SERVICE_CODE_INDICATOR";
		descriptions[22]="PRODUCT_SERVICE_AMOUNT_FOR_PHYSICIAN";
		descriptions[23]="PRODUCT_SERVICE_COST_FACTOR";
		descriptions[24]="COST_CENTER";
		descriptions[25]="BILLING_PERIOD";
		descriptions[26]="DAYS_WITHOUT_BILLING";
		descriptions[27]="SESSION_NO";
		descriptions[28]="EXECUTING_PHYSICIAN_ID";
		descriptions[29]="RESPONSIBLE_PHYSICIAN_ID";
		descriptions[30]="ROLE_EXECUTING_PHYSICIAN";
		descriptions[31]="MEDICAL_ROLE_EXECUTING_PHYSICIAN";
		descriptions[32]="SIDE_OF_BODY";
		descriptions[33]="NUMBER_OF_TPS_PP";
		descriptions[34]="TP_VALUE_PP";
		descriptions[35]="INTERNAL_SCALING_FACTOR_PP";
		descriptions[36]="EXTERNAL_SCALING_FACTOR_PP";
		descriptions[37]="AMOUNT_PP";
		descriptions[38]="NUMBER_OF_TPS_TECHNICAL_PART";
		descriptions[39]="TP_VALUE_TECHNICAL_PART";
		descriptions[40]="INTERNAL_SCALING_FACTOR_TECHNICAL_PART";
		descriptions[41]="EXTERNAL_SCALING_FACTOR_TECHNICAL_PART";
		descriptions[42]="AMOUNT_TECHNICAL_PART";
		descriptions[43]="TOTAL_AMOUNT_PROFESSIONAL_PART_TECHNICAL_PART";
		descriptions[44]="VAT_RATE";
		descriptions[45]="MAIN_SERVICE";
		descriptions[46]="VALIDATION";
		descriptions[47]="COMMENT";

		required[0]=true;
		required[1]=false;
		required[2]=true;
		required[3]=false;
		required[4]=false;
		required[5]=true;
		required[6]=true;
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
		required[20]=true;
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
		
		optional[0]=false;
		optional[1]=true;
		optional[2]=false;
		optional[3]=true;
		optional[4]=true;
		optional[5]=false;
		optional[6]=false;
		optional[7]=true;
		optional[8]=true;
		optional[9]=false;
		optional[10]=true;
		optional[11]=false;
		optional[12]=false;
		optional[13]=false;
		optional[14]=false;
		optional[15]=false;
		optional[16]=true;
		optional[17]=true;
		optional[18]=true;
		optional[19]=true;
		optional[20]=false;
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

		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=false;
		conditional[8]=false;
		conditional[9]=true;
		conditional[10]=false;
		conditional[11]=true;
		conditional[12]=true;
		conditional[13]=true;
		conditional[14]=true;
		conditional[15]=true;
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
	
		repeatable [0]=true;
		repeatable [1]=true;
		repeatable [2]=true;
		repeatable [3]=true;
		repeatable [4]=true;
		repeatable [5]=true;
		repeatable [6]=true;
		repeatable [7]=false;
		repeatable [8]=true;
		repeatable [9]=true;
		repeatable [10]=true;
		repeatable [11]=true;
		repeatable [12]=true;
		repeatable [13]=true;
		repeatable [14]=true;
		repeatable [15]=true;
		repeatable [16]=false;
		repeatable [17]=false;
		repeatable [18]=false;
		repeatable [19]=false;
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
		maxLength[0]=73;
		maxLength[1]=73;
		maxLength[2]=4;
		maxLength[3]=20;
		maxLength[4]=20;
		maxLength[5]=2;
		maxLength[6]=177;
		maxLength[7]=177;
		maxLength[8]=80;
		maxLength[9]=24;
		maxLength[10]=24;
		maxLength[11]=222;
		maxLength[12]=254;
		maxLength[13]=10;
		maxLength[14]=254;
		maxLength[15]=254;
		maxLength[16]=10;
		maxLength[17]=40;
		maxLength[18]=73;
		maxLength[19]=10;
		maxLength[20]=2;
		maxLength[21]=177;
		maxLength[22]=254;
		maxLength[23]=5;
		maxLength[24]=250;
		maxLength[25]=49;
		maxLength[26]=5;
		maxLength[27]=4;
		maxLength[28]=20;
		maxLength[29]=20;
		maxLength[30]=10;
		maxLength[31]=10;
		maxLength[32]=3;
		maxLength[33]=6;
		maxLength[34]=6;
		maxLength[35]=4;
		maxLength[36]=4;
		maxLength[37]=7;
		maxLength[38]=6;
		maxLength[39]=6;
		maxLength[40]=4;
		maxLength[41]=4;
		maxLength[42]=7;
		maxLength[43]=8;
		maxLength[44]=3;
		maxLength[45]=20;
		maxLength[46]=1;
		maxLength[47]=255;
	}
	
	public PSL(){
		type = Segment.PSL;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.PSL seg = new hl7.pseudo.segment.PSL();
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
				if(i==16) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
				if(i==19) components[i][c] = (subComponents[i][c]!=null)?hl7.bean.datastructure.primitive.IS.CLASS.cloneClass(prevVersion, prevVersion):null;
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
				if(i==17) components[i][c] = subComponents[i][c];
				if(i==18) components[i][c] = subComponents[i][c];
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
			hl7.model.V2_7.segment.PSL type = (hl7.model.V2_7.segment.PSL)this;
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
