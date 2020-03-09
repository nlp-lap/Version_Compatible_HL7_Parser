package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BPX extends hl7.model.V2_7.segment.BPX{
	public BPX(){
		super();
	}

	public static BPX CLASS;
	static{
		CLASS = new BPX();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

