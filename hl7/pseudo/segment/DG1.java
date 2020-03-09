package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DG1 extends hl7.model.V2_7.segment.DG1{
	public DG1(){
		super();
	}

	public static DG1 CLASS;
	static{
		CLASS = new DG1();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

