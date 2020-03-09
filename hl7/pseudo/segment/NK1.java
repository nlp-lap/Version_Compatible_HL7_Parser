package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NK1 extends hl7.model.V2_7.segment.NK1{
	public NK1(){
		super();
	}

	public static NK1 CLASS;
	static{
		CLASS = new NK1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

