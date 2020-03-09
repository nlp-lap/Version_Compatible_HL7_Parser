package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class ED extends hl7.model.V2_7.datastructure.ED{
	public ED(){
		super();
	}
	
	public static ED CLASS;
	static{
		CLASS = new ED();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
