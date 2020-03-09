package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BLC extends hl7.model.V2_7.segment.BLC{
	public BLC(){
		super();
	}

	public static BLC CLASS;
	static{
		CLASS = new BLC();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

