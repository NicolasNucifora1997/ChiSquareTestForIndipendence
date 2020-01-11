package chisquaretest;

public class Data {
	private int n = 0, m = 0;
	private long[][] obs;
        private double p_value;
	private Boolean res;
	
	public Data(){}
	
	public void setDim(int n, int m) {
		this.n = n;
		this.m = m;
                matrixInit();
	}
        
        public void matrixInit(){
            obs = new long[n][m];
        }
	
        public long[][] getObs(){
            return obs;
        }
        
	public void setPval(double p) {
		p_value = p;
	}
	
	public double getPval() {
		return p_value;
	}
	
	public void setRes(Boolean r) {
		res = r;
	}
	
	public Boolean getRes() {
		return res;
	}
	
        public void clear(){
            n = m = 0;
            obs = null;
            p_value = 0.0;
            res = null;
        }
}
