public abstract class FiguraGeometrica implements Comparable<FiguraGeometrica>{
    private String color = "red";
    private boolean relleno = true;

    //constructor
    public FiguraGeometrica(){

    }

    //constructor
    public FiguraGeometrica(String color, boolean relleno){
        this.color = color;
        this.relleno = relleno;
    }

    //getter color
    String getColor() {
        return color;
    }

    //setter color
    void setColor(String color) {
        this.color = color;
    }

    //getter relleno
    boolean isRelleno() {
        return relleno;
    }

    //setter relleno
    void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    //method
    public abstract double getArea();

    //method
    public abstract double getPerimetro();

    public int compareTo(FiguraGeometrica other){
        int resultado = 0;
        if (this.getArea()<other.getArea()){
            resultado = -1;
        }
        else if(this.getArea()>other.getArea()){
            resultado = 1;
        }
        else{
            resultado = 0;
        }
        return resultado;
    }
}
