package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BTS extends hl7.model.V2_7.segment.BTS{
	public BTS(){
		super();
	}

	public static BTS CLASS;
	static{
		CLASS = new BTS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

