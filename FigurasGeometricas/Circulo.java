public class Circulo extends FiguraGeometrica {
    private double radio = 1.0;

    //three constructors
    public Circulo(){

    }
    public Circulo(double radio){
        this.radio = radio;
    }
    public Circulo(double radio, String color, boolean relleno){
        this.radio = radio;
        setColor(color);
        setRelleno(relleno);
    }

    //getter and setter
    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    //methods
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio,2);
    }

    @Override
    public double getPerimetro() {
        return 2*Math.PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                ", color=" + getColor() +
                ", relleno=" + isRelleno() +
                "}";
    }

    @Override
    public boolean equals(Object obj){
        //self check
        if (obj == this) {
            return true;
        }
        //null check
        if (obj == null){
            return false;
        }
        if (obj instanceof Circulo){
            return this.radio == (((Circulo) obj).getRadio())
                    && this.getArea() == ((Circulo) obj).getArea()
                    && this.getColor() == ((Circulo) obj).getColor()
                    && this.isRelleno() == ((Circulo) obj).isRelleno();
        }
        //in case the equals is between different clases: false
        return false;
    }
}