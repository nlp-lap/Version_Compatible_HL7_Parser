package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class OM1 extends hl7.model.V2_7.segment.OM1{
	public OM1(){
		super();
	}

	public static OM1 CLASS;
	static{
		CLASS = new OM1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

