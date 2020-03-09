package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class MSG extends hl7.model.V2_7.datastructure.MSG{
	public MSG(){
		super();
	}
	
	public static MSG CLASS;
	static{
		CLASS = new MSG();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
