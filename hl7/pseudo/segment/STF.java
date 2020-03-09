package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class STF extends hl7.model.V2_7.segment.STF{
	public STF(){
		super();
	}

	public static STF CLASS;
	static{
		CLASS = new STF();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

