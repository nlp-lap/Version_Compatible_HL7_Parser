package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM6 extends hl7.model.V2_7.segment.OM6{
	public OM6(){
		super();
	}

	public static OM6 CLASS;
	static{
		CLASS = new OM6();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

