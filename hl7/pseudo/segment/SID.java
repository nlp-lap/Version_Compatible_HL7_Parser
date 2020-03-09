package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SID extends hl7.model.V2_7.segment.SID{
	public SID(){
		super();
	}

	public static SID CLASS;
	static{
		CLASS = new SID();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

