package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class DSP extends hl7.model.V2_7.segment.DSP{
	public DSP(){
		super();
	}

	public static DSP CLASS;
	static{
		CLASS = new DSP();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

