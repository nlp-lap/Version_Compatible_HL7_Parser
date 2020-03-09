package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class CNN extends hl7.model.V2_7.datastructure.CNN{
	public CNN(){
		super();
	}
	
	public static CNN CLASS;
	static{
		CLASS = new CNN();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
