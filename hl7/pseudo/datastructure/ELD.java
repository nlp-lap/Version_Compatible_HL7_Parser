package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class ELD extends hl7.model.V2_6.datastructure.ELD{
	public ELD(){
		super();
	}
	
	public static ELD CLASS;
	static{
		CLASS = new ELD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
