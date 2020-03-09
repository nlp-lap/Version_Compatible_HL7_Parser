package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RF1 extends hl7.model.V2_7.segment.RF1{
	public RF1(){
		super();
	}

	public static RF1 CLASS;
	static{
		CLASS = new RF1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

