package hl7.model.V2_4.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class RXE extends hl7.model.V2_31.segment.RXE{

	public static final String VERSION = "2.4";
	
	public static int SIZE = 31;
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
		standard[0]=hl7.pseudo.datastructure.TQ.CLASS;
		standard[1]=hl7.pseudo.datastructure.CE.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[4]=hl7.pseudo.datastructure.CE.CLASS;
		standard[5]=hl7.pseudo.datastructure.CE.CLASS;
		standard[6]=hl7.pseudo.datastructure.CE.CLASS;
		standard[7]=hl7.pseudo.datastructure.LA1.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[9]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[10]=hl7.pseudo.datastructure.CE.CLASS;
		standard[11]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[12]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[13]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[15]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[16]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[17]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[18]=hl7.pseudo.datastructure.CQ.CLASS;
		standard[19]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[20]=hl7.pseudo.datastructure.CE.CLASS;
		standard[21]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[22]=hl7.bean.datastructure.primitive.ST.CLASS;
		standard[23]=hl7.pseudo.datastructure.CE.CLASS;
		standard[24]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[25]=hl7.pseudo.datastructure.CE.CLASS;
		standard[26]=hl7.pseudo.datastructure.CE.CLASS;
		standard[27]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[28]=hl7.pseudo.datastructure.CE.CLASS;
		standard[29]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[30]=hl7.pseudo.datastructure.CE.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_4.table.Table0292.getInstance();
		tables[2]=null;
		tables[3]=null;
		tables[4]=null;
		tables[5]=null;
		tables[6]=null;
		tables[7]=null;
		tables[8]=hl7.model.V2_4.table.Table0167.getInstance();
		tables[9]=null;
		tables[10]=null;
		tables[11]=null;
		tables[12]=null;
		tables[13]=null;
		tables[14]=null;
		tables[15]=null;
		tables[16]=null;
		tables[17]=null;
		tables[18]=null;
		tables[19]=hl7.model.V2_4.table.Table0136.getInstance();
		tables[20]=null;
		tables[21]=null;
		tables[22]=null;
		tables[23]=null;
		tables[24]=null;
		tables[25]=null;
		tables[26]=null;
		tables[27]=null;
		tables[28]=null;
		tables[29]=hl7.model.V2_4.table.Table0321.getInstance();
		tables[30]=null;
		
		descriptions[0]="QUANTITY_TIMING";
		descriptions[1]="GIVE_CODE";
		descriptions[2]="GIVE_AMOUNT_MINIMUM";
		descriptions[3]="GIVE_AMOUNT_MAXIMUM";
		descriptions[4]="GIVE_UNITS";
		descriptions[5]="GIVE_DOSAGE_FORM";
		descriptions[6]="PROVIDERS_ADMINISTRATION_INSTRUCTIONS";
		descriptions[7]="DELIVER_TO_LOCATION";
		descriptions[8]="SUBSTITUTION_STATUS";
		descriptions[9]="DISPENSE_AMOUNT";
		descriptions[10]="DISPENSE_UNITS";
		descriptions[11]="NUMBER_OF_REFILLS";
		descriptions[12]="ORDERING_PROVIDERS_DEA_NUMBER";
		descriptions[13]="PHARMACIST_TREATMENT_SUPPLIERS_VERIFIER_ID";
		descriptions[14]="PRESCRIPTION_NUMBER";
		descriptions[15]="NUMBER_OF_REFILLS_REMAINING";
		descriptions[16]="NUMBER_OF_REFILLS_DOSES_DISPENSED";
		descriptions[17]="D_T_OF_MOST_RECENT_REFILL_OR_DOSE_DISPENSED";
		descriptions[18]="TOTAL_DAILY_DOSE";
		descriptions[19]="NEEDS_HUMAN_REVIEW";
		descriptions[20]="PHARMACY_TREATMENT_SUPPLIERS_SPECIAL_DISPENSING_INSTRUCTIONS";
		descriptions[21]="GIVE_PER";
		descriptions[22]="GIVE_RATE_AMOUNT";
		descriptions[23]="GIVE_RATE_UNITS";
		descriptions[24]="GIVE_STRENGTH";
		descriptions[25]="GIVE_STRENGTH_UNITS";
		descriptions[26]="GIVE_INDICATION";
		descriptions[27]="DISPENSE_PACKAGE_SIZE";
		descriptions[28]="DISPENSE_PACKAGE_SIZE_UNIT";
		descriptions[29]="DISPENSE_PACKAGE_METHOD";
		descriptions[30]="SUPPLEMENTARY_CODE";

		required[0]=true;
		required[1]=true;
		required[2]=true;
		required[3]=false;
		required[4]=true;
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
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=true;
		optional[4]=false;
		optional[5]=true;
		optional[6]=true;
		optional[7]=false;
		optional[8]=true;
		optional[9]=false;
		optional[10]=false;
		optional[11]=true;
		optional[12]=false;
		optional[13]=true;
		optional[14]=false;
		optional[15]=false;
		optional[16]=false;
		optional[17]=false;
		optional[18]=false;
		optional[19]=true;
		optional[20]=true;
		optional[21]=false;
		optional[22]=true;
		optional[23]=true;
		optional[24]=true;
		optional[25]=true;
		optional[26]=true;
		optional[27]=true;
		optional[28]=true;
		optional[29]=true;
		optional[30]=true;

		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=true;
		conditional[8]=false;
		conditional[9]=true;
		conditional[10]=true;
		conditional[11]=false;
		conditional[12]=true;
		conditional[13]=false;
		conditional[14]=true;
		conditional[15]=true;
		conditional[16]=true;
		conditional[17]=true;
		conditional[18]=true;
		conditional[19]=false;
		conditional[20]=false;
		conditional[21]=true;
		conditional[22]=false;
		conditional[23]=false;
		conditional[24]=false;
		conditional[25]=false;
		conditional[26]=false;
		conditional[27]=false;
		conditional[28]=false;
		conditional[29]=false;
		conditional[30]=false;
	
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
		maxLength[0]=200;
		maxLength[1]=250;
		maxLength[2]=20;
		maxLength[3]=20;
		maxLength[4]=250;
		maxLength[5]=250;
		maxLength[6]=250;
		maxLength[7]=200;
		maxLength[8]=1;
		maxLength[9]=20;
		maxLength[10]=250;
		maxLength[11]=3;
		maxLength[12]=250;
		maxLength[13]=250;
		maxLength[14]=20;
		maxLength[15]=20;
		maxLength[16]=20;
		maxLength[17]=26;
		maxLength[18]=10;
		maxLength[19]=1;
		maxLength[20]=250;
		maxLength[21]=20;
		maxLength[22]=6;
		maxLength[23]=250;
		maxLength[24]=20;
		maxLength[25]=250;
		maxLength[26]=250;
		maxLength[27]=20;
		maxLength[28]=250;
		maxLength[29]=2;
		maxLength[30]=250;
	}
	
	public RXE(){
		type = Segment.RXE;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.RXE seg = new hl7.pseudo.segment.RXE();
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
				if(i==1) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==30) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
				if(i==0) subComponents[i][c] = components[i][c];
				if(i==2) subComponents[i][c] = components[i][c];
				if(i==3) subComponents[i][c] = components[i][c];
				if(i==4) subComponents[i][c] = components[i][c];
				if(i==5) subComponents[i][c] = components[i][c];
				if(i==6) subComponents[i][c] = components[i][c];
				if(i==7) subComponents[i][c] = components[i][c];
				if(i==8) subComponents[i][c] = components[i][c];
				if(i==9) subComponents[i][c] = components[i][c];
				if(i==10) subComponents[i][c] = components[i][c];
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
						hl7.model.V2_31.segment.RXE type = (hl7.model.V2_31.segment.RXE)this;
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
			hl7.model.V2_5.segment.RXE type = (hl7.model.V2_5.segment.RXE)this;
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
