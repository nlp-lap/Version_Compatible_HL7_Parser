package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PES extends hl7.model.V2_7.segment.PES{
	public PES(){
		super();
	}

	public static PES CLASS;
	static{
		CLASS = new PES();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

