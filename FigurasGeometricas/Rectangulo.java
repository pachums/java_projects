public class Rectangulo extends FiguraGeometrica {
    private double ancho = 1.0;
    private double alto = 1.0;

    //three constructors
    public Rectangulo(){

    }

    public Rectangulo(double ancho, double alto){
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double ancho, double alto, String color, boolean relleno){
        this.ancho = ancho;
        this.alto = alto;
        setColor(color);
        setRelleno(relleno);
    }

    //getter and setter
    public double getAncho(){
        return ancho;
    }

    public void setAncho(double ancho){
        this.ancho = ancho;
    }

    public double getAlto(){
        return alto;
    }

    public void setAlto(double alto){
        this.alto = alto;
    }

    //methods
    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimetro() {
        return ancho * 2 + alto * 2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
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
        if (obj instanceof Rectangulo){
            return this.ancho == (((Rectangulo) obj).getAncho())
                    && this.alto == ((Rectangulo) obj).getAlto()
                    && this.getColor() == ((Rectangulo) obj).getColor()
                    && this.isRelleno() == ((Rectangulo) obj).isRelleno();
        }
        if (obj instanceof Cuadrado){
            return this.ancho == (((Cuadrado) obj).getLado())
                    && this.alto == (((Cuadrado) obj).getLado())
                    && this.getColor() == ((Cuadrado) obj).getColor()
                    && this.isRelleno() == ((Cuadrado) obj).isRelleno();
        }
        //in case the equals is between different clases: false
        return false;
    }
}
