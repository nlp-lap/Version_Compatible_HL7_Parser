package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class CM0 extends hl7.model.V2_7.segment.CM0{
	public CM0(){
		super();
	}

	public static CM0 CLASS;
	static{
		CLASS = new CM0();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

