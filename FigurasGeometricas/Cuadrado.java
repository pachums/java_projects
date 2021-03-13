public class Cuadrado extends Rectangulo{

    //constructors
    public Cuadrado(){

    }

    public Cuadrado(double lado){
        super(lado,lado);
    }

    public Cuadrado(double lado, String color, boolean relleno){
        super(lado,lado);
        setColor(color);
        setRelleno(relleno);
    }

    //getter and setter
    public double getLado(){
        return super.getAlto();
    }

    public void setLado(double alto){
        super.setAlto(alto);
    }

    //methods
    public void setAncho(double ancho){
        setAncho(ancho);
    }

    public void setAlto(double alto){
        setAlto(alto);
    }

    @Override
    public String toString() {
        return "Cuadrado{" +
                "lado=" + getLado() +
                ", color=" + getColor() +
                ", relleno=" + isRelleno() +
                '}';
    }
}
