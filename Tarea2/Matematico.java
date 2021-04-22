
public class Matematico{
    
    
    public String numOrden(int a, int b, int c){
        String mayor = "";
        String medio = "";
        String menor = "";
        
        if(a>b && a>c){
            mayor = "numero mayor = " + a;
        }else if(a<b && a<c){
            menor= "numero menor = " + a;
        }else{
            medio = "numero medio = " + a;
        }
        if(b>a && b>c){
            mayor = "numero mayor = " + b;
        }else if(b<a && b<c){
            menor = "numero menor = " + b;
        }else{
            medio = "numero medio = " + b;
        }
        if(c>a && c>b){
            mayor = "numero mayor = " + c;
        }else if(c<a && c<b){
            menor = "numero menor = " + c;
        }else{
            medio = "numero medio = " + c;
        }
        String reporte = mayor + "\n" + medio + "\n" + menor;
        return reporte;
    }
    
    public double areaCuadrado(double base, double altura){
        double area;
        if(base == altura){
            area = base * altura;
        }else{
            area = 0;
        }
        return area;
    }
    
    public double distanciaEntrePuntos(Punto a, Punto b){
        double distancia = Math.sqrt(Math.pow(a.getX() - b.getX(),2) 
        + Math.pow(a.getY() - b.getY(),2));
        return distancia;
    }
    
    public String ubicacionCuadrante(Punto otro){
        String reporte = "";
        if(otro.getX() > 0 && otro.getY() > 0){
            reporte = "Primer cuadrante";  
        }
        if(otro.getX() < 0 && otro.getY() > 0){
            reporte = "Segundo cuadrante";
        }
        if(otro.getX() < 0 && otro.getY() < 0){
            reporte = "Tercer cuadrante";
        }
        if(otro.getX() > 0 && otro.getY() < 0){
            reporte = "Cuarto cuadrante";
        }
        return "se encuentra en: " + reporte;
    }
}
