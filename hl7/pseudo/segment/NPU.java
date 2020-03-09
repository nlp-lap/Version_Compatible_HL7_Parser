package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class NPU extends hl7.model.V2_7.segment.NPU{
	public NPU(){
		super();
	}

	public static NPU CLASS;
	static{
		CLASS = new NPU();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

