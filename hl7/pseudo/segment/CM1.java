package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CM1 extends hl7.model.V2_7.segment.CM1{
	public CM1(){
		super();
	}

	public static CM1 CLASS;
	static{
		CLASS = new CM1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

