package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class PMT extends hl7.model.V2_7.segment.PMT{
	public PMT(){
		super();
	}

	public static PMT CLASS;
	static{
		CLASS = new PMT();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

