package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OBX extends hl7.model.V2_7.segment.OBX{
	public OBX(){
		super();
	}

	public static OBX CLASS;
	static{
		CLASS = new OBX();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

