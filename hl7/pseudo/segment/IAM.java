package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class IAM extends hl7.model.V2_7.segment.IAM{
	public IAM(){
		super();
	}

	public static IAM CLASS;
	static{
		CLASS = new IAM();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

