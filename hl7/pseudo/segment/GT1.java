package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class GT1 extends hl7.model.V2_7.segment.GT1{
	public GT1(){
		super();
	}

	public static GT1 CLASS;
	static{
		CLASS = new GT1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

