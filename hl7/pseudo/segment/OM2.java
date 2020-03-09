package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM2 extends hl7.model.V2_7.segment.OM2{
	public OM2(){
		super();
	}

	public static OM2 CLASS;
	static{
		CLASS = new OM2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

