package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BTX extends hl7.model.V2_7.segment.BTX{
	public BTX(){
		super();
	}

	public static BTX CLASS;
	static{
		CLASS = new BTX();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

