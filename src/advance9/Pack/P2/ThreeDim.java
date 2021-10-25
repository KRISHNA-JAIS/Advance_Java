package advance9.Pack.P2;


import advance9.Pack.P1.TwoDim;

public class ThreeDim extends TwoDim {
    private double z;

    public ThreeDim(double x, double y, double z){
        super(x,y);
        this.z = z;
    }

    @Override
    public String toString(){
        return "ThreeDim {" + "z = " + z + '}';
    }
}
