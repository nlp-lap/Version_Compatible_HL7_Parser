package hl7.model.V2_5.segment;

import hl7.bean.datastructure.DataStructure;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;
import hl7.bean.table.Table;

public class AIG extends hl7.model.V2_4.segment.AIG{

	public static final String VERSION = "2.5";
	
	public static int SIZE = 14;
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
		standard[2]=hl7.pseudo.datastructure.CE.CLASS;
		standard[3]=hl7.pseudo.datastructure.CE.CLASS;
		standard[4]=hl7.pseudo.datastructure.CE.CLASS;
		standard[5]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[6]=hl7.pseudo.datastructure.CE.CLASS;
		standard[7]=hl7.bean.datastructure.primitive.TS.CLASS;
		standard[8]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[9]=hl7.pseudo.datastructure.CE.CLASS;
		standard[10]=hl7.bean.datastructure.primitive.NM.CLASS;
		standard[11]=hl7.pseudo.datastructure.CE.CLASS;
		standard[12]=hl7.bean.datastructure.primitive.IS.CLASS;
		standard[13]=hl7.pseudo.datastructure.CE.CLASS;
		
		tables[0]=null;
		tables[1]=hl7.model.V2_5.table.Table0206.getInstance();
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
		tables[12]=hl7.model.V2_5.table.Table0279.getInstance();
		tables[13]=hl7.model.V2_5.table.Table0278.getInstance();
		
		descriptions[0]="SET_ID_AIG";
		descriptions[1]="SEGMENT_ACTION_CODE";
		descriptions[2]="RESOURCE_ID";
		descriptions[3]="RESOURCE_TYPE";
		descriptions[4]="RESOURCE_GROUP";
		descriptions[5]="RESOURCE_QUANTITY";
		descriptions[6]="RESOURCE_QUANTITY_UNITS";
		descriptions[7]="START_DATE_TIME";
		descriptions[8]="START_DATE_TIME_OFFSET";
		descriptions[9]="START_DATE_TIME_OFFSET_UNITS";
		descriptions[10]="DURATION";
		descriptions[11]="DURATION_UNITS";
		descriptions[12]="ALLOW_SUBSTITUTION_CODE";
		descriptions[13]="FILLER_STATUS_CODE";

		required[0]=true;
		required[1]=false;
		required[2]=false;
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
		required[13]=false;
		
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=true;
		optional[5]=true;
		optional[6]=true;
		optional[7]=false;
		optional[8]=false;
		optional[9]=false;
		optional[10]=true;
		optional[11]=true;
		optional[12]=false;
		optional[13]=false;

		conditional[0]=false;
		conditional[1]=true;
		conditional[2]=true;
		conditional[3]=false;
		conditional[4]=false;
		conditional[5]=false;
		conditional[6]=false;
		conditional[7]=true;
		conditional[8]=true;
		conditional[9]=true;
		conditional[10]=false;
		conditional[11]=false;
		conditional[12]=true;
		conditional[13]=true;
	
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
		maxLength[0]=4;
		maxLength[1]=3;
		maxLength[2]=250;
		maxLength[3]=250;
		maxLength[4]=250;
		maxLength[5]=5;
		maxLength[6]=250;
		maxLength[7]=26;
		maxLength[8]=20;
		maxLength[9]=250;
		maxLength[10]=20;
		maxLength[11]=250;
		maxLength[12]=10;
		maxLength[13]=250;
	}
	
	public AIG(){
		type = Segment.AIG;
	}

	@Override
	public Segment cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.segment.AIG seg = new hl7.pseudo.segment.AIG();
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
				if(i==13) subComponents[i][c] = (components[i][c]!=null)?hl7.pseudo.datastructure.CE.CLASS.cloneClass(VERSION, VERSION):null;
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
						hl7.model.V2_4.segment.AIG type = (hl7.model.V2_4.segment.AIG)this;
						type.backward(type.components, components, originalVersion, setVersion, VERSION);
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
			hl7.model.V2_51.segment.AIG type = (hl7.model.V2_51.segment.AIG)this;
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