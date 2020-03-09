package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BPO extends hl7.model.V2_7.segment.BPO{
	public BPO(){
		super();
	}

	public static BPO CLASS;
	static{
		CLASS = new BPO();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

