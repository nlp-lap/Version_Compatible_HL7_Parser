package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPT_PCL extends hl7.model.V2_7.message.PPT_PCL{
	public PPT_PCL(){
		super();
	}

	public static PPT_PCL CLASS;
	static{
		CLASS = new PPT_PCL();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

