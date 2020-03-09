package hl7.model.V2_3.group;

import hl7.bean.Structure;
import hl7.bean.group.Group;
import hl7.bean.message.MessageStructure;
import hl7.bean.segment.Segment;

public class QUERY_RESPONSE_ADR_A19 extends hl7.model.V2_2.group.QUERY_RESPONSE_ADR_A19{
	public static final String VERSION = "2.3";

	public static int SIZE = 17;
	public Structure[][] components = new Structure[SIZE][];
	public static Structure[] standard = new Structure[SIZE];
	public static boolean[] optional = new boolean[SIZE];
	public static boolean[] repeatable = new boolean[SIZE];
	
	static{
		standard[0]=hl7.pseudo.segment.EVN.CLASS;
		standard[1]=hl7.pseudo.segment.PID.CLASS;
		standard[2]=hl7.pseudo.segment.PD1.CLASS;
		standard[3]=hl7.pseudo.segment.NK1.CLASS;
		standard[4]=hl7.pseudo.segment.PV1.CLASS;
		standard[5]=hl7.pseudo.segment.PV2.CLASS;
		standard[6]=hl7.pseudo.segment.DB1.CLASS;
		standard[7]=hl7.pseudo.segment.OBX.CLASS;
		standard[8]=hl7.pseudo.segment.AL1.CLASS;
		standard[9]=hl7.pseudo.segment.DG1.CLASS;
		standard[10]=hl7.pseudo.segment.DRG.CLASS;
		standard[12]=hl7.pseudo.segment.GT1.CLASS;
		standard[14]=hl7.pseudo.segment.ACC.CLASS;
		standard[15]=hl7.pseudo.segment.UB1.CLASS;
		standard[16]=hl7.pseudo.segment.UB2.CLASS;
		standard[11]=hl7.pseudo.group.PROCEDURE_ADR_A19.CLASS;
		standard[13]=hl7.pseudo.group.INSURANCE_ADR_A19.CLASS;
		
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
		optional[10]=false;
		optional[12]=false;
		optional[14]=false;
		optional[15]=false;
		optional[16]=false;
		optional[11]=true;
		optional[13]=true;
		
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
		repeatable [10]=false;
		repeatable [12]=false;
		repeatable [14]=false;
		repeatable [15]=false;
		repeatable [16]=false;
		repeatable [11]=true;
		repeatable [13]=true;
	}
	
	@Override
	public Group cloneClass(String originalVersion, String setVersion) {
		hl7.pseudo.group.QUERY_RESPONSE_ADR_A19 group = new hl7.pseudo.group.QUERY_RESPONSE_ADR_A19();
		group.originalVersion = originalVersion;
		group.setVersion = setVersion;
		return group;
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

	
	public boolean needsNewGroup(String segmentType, Structure[] comps){
		if(comps==null) return true;
		//�۷� Segment�� ��ġ �˾Ƴ���
		int stdIndex = indexStandard(segmentType);
		
		//���� components�� ������ ��ü ���� ��ġ �˾Ƴ���
		int compIndex = -1;
		for(int i=0; i<comps.length; i++){
			if(comps[i]!=null) compIndex = i;
		}
		
		//�Է� Segment�� ��ġ�� components ������ ��ü ��ġ���� ���ų�(�ߺ�����) ��(�߰�) �ΰ�?
		return stdIndex>=compIndex;
	}
	
	public int indexStandard(String segmentType){
		int stdIndex = -1;
		for(int i=0; i<standard.length; i++){
			Structure structure = standard[i];
			if(structure instanceof Segment){
				if(segmentType.equals(structure.getType())){
					stdIndex = i;
					break;
				}
			}else if(structure instanceof Group){
				Group group = (Group)structure;
				stdIndex = group.indexStandard(segmentType);
				if(stdIndex>=0) break;
			}
		}
		return stdIndex;
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
				decode(originalVersion, setVersion, VERSION, index, index[1], comps);
			}
		}
	}
	
	public void decode(String originalVersion, String setVersion, String VERSION, int[] index, int prevLength, String[] comps) throws Exception{
		int[] newIndex = new int[]{index[0], 0};
		while(newIndex[1]<standard.length){
			Structure structure = standard[newIndex[1]];
			if(comps.length<=newIndex[0]){
				index[0]=newIndex[0];
				return;
			}
			String comp = comps[newIndex[0]];
			String segmentType = comp.substring(0, 3);
			if(structure instanceof Segment){	//Segment�� ��
				String standardType = structure.getType();
				if(segmentType.equals(standardType)){		//ǥ�ذ� Type�� �����Ѱ�?
					Segment segment = ((Segment)structure).cloneClass(originalVersion, setVersion);
					segment.originalVersion(originalVersion);
					segment.decode(comp);
					addStructure(components, segment, newIndex[1]);
					newIndex[0]++;	//���� comp ó��
				}else{
					newIndex[1]++;	//���� Segment�� ��
				}
			}else if(structure instanceof Group){
				Group group = (Group)structure;
				int stdIndex = group.indexStandard(segmentType);
				
				if(stdIndex<0){
					newIndex[1]++;
				}else{
					boolean needsNewGroup = group.needsNewGroup(segmentType, components[newIndex[1]]); 
					if(needsNewGroup){
						Group newGroup = group.cloneClass(originalVersion, setVersion);
						newGroup.originalVersion(originalVersion);
						newGroup.decode(originalVersion, setVersion, VERSION, newIndex, prevLength, comps);
						addStructure(components, newGroup, newIndex[1]);
						newIndex[0]++;
					}else{
						group.decode(originalVersion, setVersion, VERSION, newIndex, prevLength, comps);
					}
				}
				
			}
		}
		index[0]=newIndex[0];
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
		components[10] = subComponents[10];
		components[11] = subComponents[11];
		components[12] = subComponents[12];
		components[13] = subComponents[13];
		components[14] = subComponents[14];
		components[15] = subComponents[15];
		components[16] = subComponents[16];
	}
	
	/* -----------------------------------------------------------------
	 * ���� �������� ���� components:������, subComponents:�Ź���
	 * ������ �޽���-->�Ź��� �ļ�(����ȣȯ)
	 * -----------------------------------------------------------------
	 */
	public static void forward(Structure[][] components, Structure[][] subComponents, String originalVersion, String setVersion) throws Exception{
		subComponents[0] = components[0];
		subComponents[1] = components[1];
		subComponents[3] = components[2];
		subComponents[4] = components[3];
		subComponents[5] = components[4];
		subComponents[7] = components[5];
		subComponents[8] = components[6];
		subComponents[9] = components[7];
		subComponents[12] = components[9];
		subComponents[13] = components[10];
		subComponents[2] = null;
		subComponents[6] = null;
		subComponents[10] = null;
		subComponents[11] = null;
		subComponents[14] = null;
		subComponents[15] = null;
		subComponents[16] = null;
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
						hl7.model.V2_2.group.QUERY_RESPONSE_ADR_A19 type = (hl7.model.V2_2.group.QUERY_RESPONSE_ADR_A19)this;
						type.backward(type.components, components, originalVersion, setVersion);
					//}
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
			hl7.model.V2_31.group.QUERY_RESPONSE_ADR_A19 type = (hl7.model.V2_31.group.QUERY_RESPONSE_ADR_A19)this;
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