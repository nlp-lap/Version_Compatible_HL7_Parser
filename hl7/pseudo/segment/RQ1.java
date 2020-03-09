package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RQ1 extends hl7.model.V2_7.segment.RQ1{
	public RQ1(){
		super();
	}

	public static RQ1 CLASS;
	static{
		CLASS = new RQ1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

