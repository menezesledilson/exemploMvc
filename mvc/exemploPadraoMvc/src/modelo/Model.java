package modelo;

public class Model {
    private  double x = 0;
    private  double y = 0;
    private  double out = 0;

    public Model(){

    }
    public  void setNumeros(double x, double y){
        this.x = x;
        this.y =y;
    }

    public void  compute(){
        out = x + y;
    }
    public double getOutput() {
        return out;
    }
}
