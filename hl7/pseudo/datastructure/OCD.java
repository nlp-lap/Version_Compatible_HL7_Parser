package hl7.pseudo.datastructure;

import hl7.bean.datastructure.DataStructure;

public class OCD extends hl7.model.V2_7.datastructure.OCD{
	public OCD(){
		super();
	}
	
	public static OCD CLASS;
	static{
		CLASS = new OCD();
	}

	public DataStructure[] getComponents(){
		return super.getComponents();
	}
}
