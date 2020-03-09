package hl7.pseudo.segment;

import hl7.bean.datastructure.DataStructure;

public class QAK extends hl7.model.V2_7.segment.QAK{
	public QAK(){
		super();
	}

	public static QAK CLASS;
	static{
		CLASS = new QAK();
	}

	public DataStructure[][] getComponents(){
		return super.getComponents();
	}
}

