package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class WVS extends hl7.model.V2_7.datastructure.WVS{
	public WVS(){
		super();
	}
	
	public static WVS CLASS;
	static{
		CLASS = new WVS();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
