package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class BHS extends hl7.model.V2_7.segment.BHS{
	public BHS(){
		super();
	}

	public static BHS CLASS;
	static{
		CLASS = new BHS();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

