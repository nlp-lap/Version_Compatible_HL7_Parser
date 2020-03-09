package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class STZ extends hl7.model.V2_7.segment.STZ{
	public STZ(){
		super();
	}

	public static STZ CLASS;
	static{
		CLASS = new STZ();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

