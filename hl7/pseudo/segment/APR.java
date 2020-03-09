package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class APR extends hl7.model.V2_7.segment.APR{
	public APR(){
		super();
	}

	public static APR CLASS;
	static{
		CLASS = new APR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

