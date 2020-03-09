package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM3 extends hl7.model.V2_7.segment.OM3{
	public OM3(){
		super();
	}

	public static OM3 CLASS;
	static{
		CLASS = new OM3();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

