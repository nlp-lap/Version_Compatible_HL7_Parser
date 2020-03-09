package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM5 extends hl7.model.V2_7.segment.OM5{
	public OM5(){
		super();
	}

	public static OM5 CLASS;
	static{
		CLASS = new OM5();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

