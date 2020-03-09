package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class GP1 extends hl7.model.V2_7.segment.GP1{
	public GP1(){
		super();
	}

	public static GP1 CLASS;
	static{
		CLASS = new GP1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

