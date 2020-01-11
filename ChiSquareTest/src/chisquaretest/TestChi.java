package chisquaretest;

import org.apache.commons.math3.stat.inference.ChiSquareTest;

public class TestChi {
	private Data data;
	
	public TestChi(Data d) {
		data = d;
	}

	public void testChiQuadro(double alfa) {
		ChiSquareTest test = new ChiSquareTest();
		double p = test.chiSquareTest(data.getObs());
		data.setPval(p);
                data.setRes(test.chiSquareTest(data.getObs(), alfa));
	}
}
