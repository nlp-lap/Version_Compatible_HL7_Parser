package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class ECR extends hl7.model.V2_7.segment.ECR{
	public ECR(){
		super();
	}

	public static ECR CLASS;
	static{
		CLASS = new ECR();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

