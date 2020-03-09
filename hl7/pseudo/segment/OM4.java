package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM4 extends hl7.model.V2_7.segment.OM4{
	public OM4(){
		super();
	}

	public static OM4 CLASS;
	static{
		CLASS = new OM4();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

