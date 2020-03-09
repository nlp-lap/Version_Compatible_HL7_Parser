package hl7.model.V2_3.message;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class ADT_A16 extends hl7.model.V2_2.message.ADT_A16{
	public static final String VERSION = "2.3";

	public static int SIZE = 10;
	public Structure[][] components = new Structure[SIZE][];
	public static Structure[] standard = new Structure[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	
	static{
		standard[0]=hl7.pseudo.segment.MSH.CLASS;
		standard[1]=hl7.pseudo.segment.EVN.CLASS;
		standard[2]=hl7.pseudo.segment.PID.CLASS;
		standard[3]=hl7.pseudo.segment.PD1.CLASS;
		standard[4]=hl7.pseudo.segment.PV1.CLASS;
		standard[5]=hl7.pseudo.segment.PV2.CLASS;
		standard[6]=hl7.pseudo.segment.DB1.CLASS;
		standard[7]=hl7.pseudo.segment.OBX.CLASS;
		standard[8]=hl7.pseudo.segment.DG1.CLASS;
		standard[9]=hl7.pseudo.segment.DRG.CLASS;
	
		optional[0]=false;
		optional[1]=false;
		optional[2]=false;
		optional[3]=false;
		optional[4]=false;
		optional[5]=false;
		optional[6]=false;
		optional[7]=false;
		optional[8]=false;
		optional[9]=false;
		
		repeatable [0]=false;
		repeatable [1]=false;
		repeatable [2]=false;
		repeatable [3]=false;
		repeatable [4]=false;
		repeatable [5]=false;
		repeatable [6]=false;
		repeatable [7]=false;
		repeatable [8]=false;
		repeatable [9]=false;
	}
	
	public void setVersion(String setVersion) {
		super.setVersion(setVersion);
		this.setVersion = setVersion; 
		for(int i=0; i<components.length; i++){
			Structure[] structures = components[i];
			for(int c=0; structures!=null&&c<structures.length; c++){
				Structure structure = components[i][c];
				structure.setVersion(setVersion);
			}
		}
	}

	public void originalVersion(String originalVersion) {
		super.originalVersion(originalVersion);
		this.originalVersion = originalVersion; 
		for(int i=0; i<components.length; i++){
			Structure[] structures = components[i];
			for(int c=0; structures!=null&&c<structures.length; c++){
				Structure structure = components[i][c];
				structure.originalVersion(originalVersion);
			}
		}
	}
	public Structure[][] getComponents(){
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
			
			char separator = MessageStructure.SEGMENT_TERMINATOR;
			String[] comps = divide(message, separator);
			if(comps==null) return;

			int[] index = new int[2];
			while(index[0]<comps.length && index[1]<SIZE){
				decode(components, originalVersion, setVersion, VERSION, index, comps);
			}
		}
	}
	
	private void decode(Structure[][] components, String originalVersion, String setVersion, String VERSION, int[] index, String[] comps) throws Exception{
		Structure structure = standard[index[1]];
		String comp = comps[index[0]];
		String segmentType = comp.substring(0, 3);
		if(structure instanceof Segment){	//Segment�� ��
			String standardType = structure.getType();
			if(segmentType.equals(standardType)){		//ǥ�ذ� Type�� �����Ѱ�?
				Segment segment = ((Segment)structure).cloneClass(originalVersion, setVersion);
				segment.originalVersion(originalVersion);
				segment.decode(comp);
				addStructure(components, segment, index[1]);
				index[0]++;	//���� comp ó��
			}else{
				index[1]++;	//���� Segment�� ��
			}
		}else if(structure instanceof Group){
			Group group = (Group)structure;
			int stdIndex = group.indexStandard(segmentType);
			if(stdIndex<0){
				index[1]++;
			}else{
				int groupIndex = index[1];
				
				boolean needsNewGroup = group.needsNewGroup(segmentType, components[index[1]]); 
				if(needsNewGroup){
					Group newGroup = group.cloneClass(originalVersion, setVersion);
					newGroup.originalVersion(originalVersion);
					newGroup.decode(originalVersion, setVersion, VERSION, index, index[1], comps);
					addStructure(components, newGroup, index[1]);
				}else{
					group.decode(originalVersion, setVersion, VERSION, index, index[1], comps);
				}
				
				index[1] = groupIndex;
			}
		}
	}
	
	public static void addStructure(Structure[][] components, Structure structure, int index){
		if(components.length<=index) return;
		Structure[] comps = components[index];
		Structure[] newComps;
		newComps = (comps==null)?new Structure[1]:new Structure[comps.length+1];
		for(int i=0; i<newComps.length-1; i++) newComps[i]=comps[i];
		newComps[newComps.length-1] = structure;
		components[index] = newComps;
	}
	
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * �Ź��� �޽���-->������ �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void backward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
		components[0] = subComponents[0];
		components[1] = subComponents[1];
		components[2] = subComponents[2];
		components[3] = subComponents[3];
		components[4] = subComponents[4];
		components[5] = subComponents[5];
		components[6] = subComponents[6];
		components[7] = subComponents[7];
		components[8] = subComponents[8];
		components[9] = subComponents[9];
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{ 
		subComponents[0] = components[0];
		subComponents[1] = components[1];
		subComponents[2] = components[2];
		subComponents[4] = components[3];
		subComponents[5] = components[4];
		subComponents[7] = components[5];
		subComponents[8] = components[6];
		subComponents[3] = null;
		subComponents[6] = null;
		subComponents[9] = null;
	}
	
	
	public String encode() throws Exception{
		seekOriginalVersion = true;	//���� ������ �޼ҵ忡�� ��ġã�� �ɼ� ����
		return encode(null);
	}
	
	public String encode(Structure[][] subComponents) throws Exception{
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
						hl7.model.V2_2.message.ADT_A16 type = (hl7.model.V2_2.message.ADT_A16)this;
						type.backward(type.components, components, originalVersion, setVersion);
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
			hl7.model.V2_31.message.ADT_A16 type = (hl7.model.V2_31.message.ADT_A16)this;
			type.forward(this.components, type.components, originalVersion, setVersion);
			encodeVersion = type.VERSION;
			if(encodeVersion.equals(setVersion)) return type.makeMessage(type.components, encodeVersion);
			else return encodeForward(encodeVersion, setVersion);
		}else{
			return super.encodeForward(encodeVersion, setVersion);
		}
	}
	
	public String makeMessage(Structure[][] components, String version) throws Exception{
		if(VERSION.equals(version)){
			setCharacter(components, version);
			String message = "";
			char separator = MessageStructure.SEGMENT_TERMINATOR;
			for(int i=0; i<SIZE; i++){
				if(components[i]==null) continue;
				for(int j=0; j<components[i].length; j++){
					if(!repeatable[i]&&j>0) continue;
					String segment = components[i][j].encode();
					if(segment!=null){
						if(message.length()>0) message += separator;
						message += segment;
					}
				}

			}
			return (message.length()==0)?null:message;
		}else{
			return super.makeMessage(components, version);
		}
	}
}
