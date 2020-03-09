package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CM2 extends hl7.model.V2_7.segment.CM2{
	public CM2(){
		super();
	}

	public static CM2 CLASS;
	static{
		CLASS = new CM2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

