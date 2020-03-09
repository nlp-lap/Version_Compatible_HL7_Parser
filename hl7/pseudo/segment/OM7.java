package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM7 extends hl7.model.V2_7.segment.OM7{
	public OM7(){
		super();
	}

	public static OM7 CLASS;
	static{
		CLASS = new OM7();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

