package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class RDF extends hl7.model.V2_7.segment.RDF{
	public RDF(){
		super();
	}

	public static RDF CLASS;
	static{
		CLASS = new RDF();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

