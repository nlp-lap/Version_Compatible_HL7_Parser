package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PSS extends hl7.model.V2_7.segment.PSS{
	public PSS(){
		super();
	}

	public static PSS CLASS;
	static{
		CLASS = new PSS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

