package differential;

public class Differential_lib {
private double a, h;
    
    public Differential_lib(double a, double h) {
        this.a = a;
        this.h = h;
    }


	public double getRx() {
		return 2 * this.a;
	}

	public double getDx() {
		// TODO Auto-generated method stub
		return   ( (a+h) * (a+h) - (a) * (a) ) / h;
	}
	
	
		
	}
