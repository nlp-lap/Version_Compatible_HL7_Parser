package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class EI extends hl7.model.V2_7.datastructure.EI{
	public EI(){
		super();
	}
	
	public static EI CLASS;
	static{
		CLASS = new EI();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
