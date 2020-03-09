package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OBR extends hl7.model.V2_7.segment.OBR{
	public OBR(){
		super();
	}

	public static OBR CLASS;
	static{
		CLASS = new OBR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

