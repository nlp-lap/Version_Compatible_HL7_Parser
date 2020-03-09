package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class GP2 extends hl7.model.V2_7.segment.GP2{
	public GP2(){
		super();
	}

	public static GP2 CLASS;
	static{
		CLASS = new GP2();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

