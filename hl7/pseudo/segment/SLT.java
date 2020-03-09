package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class SLT extends hl7.model.V2_7.segment.SLT{
	public SLT(){
		super();
	}

	public static SLT CLASS;
	static{
		CLASS = new SLT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

