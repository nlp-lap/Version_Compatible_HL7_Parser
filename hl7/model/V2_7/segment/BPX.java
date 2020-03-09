package hl7.model.V2_7.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class BPX extends hl7.model.V2_6.segment.BPX{

	public static final String VERSION = "2.7";
	
	public static int SIZE = 21;
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
		standard[1]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[2]=hl7.bean.datastructure.primitive.ID.CLASS;
		standard[3]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[4]=hl7.pseudo.datastructure.EI.CLASS;
		standard[5]=hl7.pseudo.datastructure.CNE.CLASS;
		standard[6]=hl7.pseudo.datastructure.CNE.CLASS;
		standard[7]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[8]=hl7.pseudo.datastructure.XON.CLASS;
		standard[9]=hl7.pseudo.datastructure.EI.CLASS;
		standard[10]=hl7.pseudo.datastructure.CNE.CLASS;
		standard[11]=hl7.pseudo.datastructure.CNE.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.DTM.CLASS;
		standard[13]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[14]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[15]=hl7.pseudo.datastructure.CWE.CLASS;
		standard[16]=hl7.pseudo.datastructure.EI.CLASS;
		standard[17]=hl7.pseudo.datastructure.PL.CLASS;
		standard[18]=hl7.pseudo.datastructure.XAD.CLASS;
		standard[19]=hl7.pseudo.datastructure.XCN.CLASS;
		standard[20]=hl7.pseudo.datastructure.XCN.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_7.table.Table0510.getInstance();
		tables[2]=hl7.model.V2_7.table.Table0511.getInstance();
		tables[3]=null;
		tables[4]=null;
		tables[5]=hl7.model.V2_7.table.Table9999.getInstance();
		tables[6]=hl7.model.V2_7.table.Table9999.getInstance();
		tables[7]=hl7.model.V2_7.table.Table0512.getInstance();
		tables[8]=null;
		tables[9]=null;
		tables[10]=hl7.model.V2_7.table.Table9999.getInstance();
		tables[11]=hl7.model.V2_7.table.Table9999.getInstance();
		tables[12]=null;
		tables[13]=null;
		tables[14]=null;
		tables[15]=hl7.model.V2_7.table.Table9999.getInstance();
		tables[16]=null;
		tables[17]=null;
		tables[18]=null;
		tables[19]=null;
		tables[20]=null;
		
		descriptions[0]="SET_ID_BPX";
		descriptions[1]="BP_DISPENSE_STATUS";
		descriptions[2]="BP_STATUS";
		descriptions[3]="BP_DATE_TIME_OF_STATUS";
		descriptions[4]="BC_DONATION_ID";
		descriptions[5]="BC_COMPONENT";
		descriptions[6]="BC_DONATION_TYPE_INTENDED_USE";
		descriptions[7]="CP_COMMERCIAL_PRODUCT";
		descriptions[8]="CP_MANUFACTURER";
		descriptions[9]="CP_LOT_NUMBER";
		descriptions[10]="BP_BLOOD_GROUP";
		descriptions[11]="BC_SPECIAL_TESTING";
		descriptions[12]="BP_EXPIRATION_DATE_TIME";
		descriptions[13]="BP_QUANTITY";
		descriptions[14]="BP_AMOUNT";
		descriptions[15]="BP_UNITS";
		descriptions[16]="BP_UNIQUE_ID";
		descriptions[17]="BP_ACTUAL_DISPENSED_TO_LOCATION";
		descriptions[18]="BP_ACTUAL_DISPENSED_TO_ADDRESS";
		descriptions[19]="BP_DISPENSED_TO_RECEIVER";
		descriptions[20]="BP_DISPENSING_INDIVIDUAL";

		required[0]=true;
		required[1]=true;
		required[2]=true;
		required[3]=true;
		required[4]=false;
		required[5]=false;
		required[6]=false;
		required[7]=false;
		required[8]=false;
		required[9]=false;
		required[10]=false;
		required[11]=false;
		required[12]=false;
		required[13]=true;
		required[14]=false;
		required[15]=false;
		required[16]=false;
		required[17]=false;
		required[18]=false;
		required[19]=false;
		required[20]=false;
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=false;
		optional[5]=false;
		optional[6]=true;
		optional[7]=false;
		optional[8]=false;
		optional[9]=false;
		optional[10]=true;
		optional[11]=true;
		optional[12]=true;
		optional[13]=false;
		optional[14]=true;
		optional[15]=true;
		optional[16]=true;
		optional[17]=true;
		optional[18]=true;
		optional[19]=true;
		optional[20]=true;

		conditional[0]=false;
		conditional[1]=false;
		conditional[2]=false;
		conditional[3]=false;
		conditional[4]=true;
		conditional[5]=true;
		conditional[6]=false;
		conditional[7]=true;
		conditional[8]=true;
		conditional[9]=true;
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
	
		minLength[0]=1;
		minLength[1]=0;
		minLength[2]=1;
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
		maxLength[0]=4;
		maxLength[1]=2147483647;
		maxLength[2]=1;
		maxLength[3]=2147483647;
		maxLength[4]=2147483647;
		maxLength[5]=2147483647;
		maxLength[6]=2147483647;
		maxLength[7]=2147483647;
		maxLength[8]=2147483647;
		maxLength[9]=2147483647;
		maxLength[10]=2147483647;
		maxLength[11]=2147483647;
		maxLength[12]=2147483647;
		maxLength[13]=2147483647;
		maxLength[14]=2147483647;
		maxLength[15]=2147483647;
		maxLength[16]=2147483647;
		maxLength[17]=2147483647;
		maxLength[18]=2147483647;
		maxLength[19]=2147483647;
		maxLength[20]=2147483647;
	}
	
	public BPX(){
		type = Segment.BPX;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.BPX seg = new hl7.pseudo.segment.BPX();
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
						hl7.model.V2_6.segment.BPX type = (hl7.model.V2_6.segment.BPX)this;
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
			return null;
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
