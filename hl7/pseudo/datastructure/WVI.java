package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class WVI extends hl7.model.V2_7.datastructure.WVI{
	public WVI(){
		super();
	}
	
	public static WVI CLASS;
	static{
		CLASS = new WVI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
