package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ADJ extends hl7.model.V2_7.segment.ADJ{
	public ADJ(){
		super();
	}

	public static ADJ CLASS;
	static{
		CLASS = new ADJ();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

