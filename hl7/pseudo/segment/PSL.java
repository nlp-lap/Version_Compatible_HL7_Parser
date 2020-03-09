package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PSL extends hl7.model.V2_7.segment.PSL{
	public PSL(){
		super();
	}

	public static PSL CLASS;
	static{
		CLASS = new PSL();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

