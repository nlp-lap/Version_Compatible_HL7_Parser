package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class FHS extends hl7.model.V2_7.segment.FHS{
	public FHS(){
		super();
	}

	public static FHS CLASS;
	static{
		CLASS = new FHS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

