
public class Matematico
{
    
    public double areaRectangulo(double base, double altura){
        double res;
        res = base * altura;
        return res;
    }
    
    public int numMayor(int a, int b, int c){
        int res;
        res = 0;
            if(a > b){
               if(a > c){
                  res = a;
               }else{
                  res = c;
                }
            }else{if(b > c){
                     res = b;
                  }else{
                     res = c;
                    }
                }
        return res;
    }
    
    public double distanciaPunto(Punto a, Punto b){
        double res;
        double v1;
        double v2;
        v1 = (a.getX() - b.getX()) * (a.getX() - b.getX());
        v2 = (a.getY() - b.getY()) * (a.getY() - b.getY());
        res = Math.sqrt(v1 + v2);
        return res;
    }
    
    public String cuadrante(Punto p){
        String res;
        res = "";
        int x;
        int y;
        x = p.getX();
        y = p.getY();
          if(x > 0 && y > 0){
             res = "Primer Cuadrante";
           }else{
             if(x < 0 && y < 0){
                  res = "Tercer Cuadrante";
               }else{
                  if(x > 0 && y < 0){
                       res = "Cuarto Cuadrante";
                    }else{
                        res = "Segundo Cuadrante";
                      }
                 }
            }
        return res;
    }
}
