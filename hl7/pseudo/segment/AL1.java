package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class AL1 extends hl7.model.V2_7.segment.AL1{
	public AL1(){
		super();
	}

	public static AL1 CLASS;
	static{
		CLASS = new AL1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

