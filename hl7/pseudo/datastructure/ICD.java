package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class ICD extends hl7.model.V2_7.datastructure.ICD{
	public ICD(){
		super();
	}
	
	public static ICD CLASS;
	static{
		CLASS = new ICD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
