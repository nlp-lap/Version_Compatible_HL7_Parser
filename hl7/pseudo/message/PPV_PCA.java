package hl7.pseudo.message;

import hl7.bean.Structure;

public class PPV_PCA extends hl7.model.V2_7.message.PPV_PCA{
	public PPV_PCA(){
		super();
	}

	public static PPV_PCA CLASS;
	static{
		CLASS = new PPV_PCA();
	}

	public Structure[][] getComponents(){
		return super.getComponents();
	}

}

