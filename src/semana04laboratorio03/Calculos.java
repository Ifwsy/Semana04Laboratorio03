package semana04laboratorio03;
public class Calculos {
    int unx = 1;
    int dox = 2;
    int trex = 3;
    //int dia
    public float porcenDia(Supermercado n, float dia){
        return (dia * 100) / n.getTotalVentasSem();
    }

    public int ventaTotal(Supermercado n,Supermercado d,Supermercado l){
        return n.getTotalVentasSem() + d.getTotalVentasSem() + l.getTotalVentasSem();
    }
    /*public static int ventaTotal(Supermercado n,Supermercado d,Supermercado l){
        return n.getTotalVentasSem() + d.getTotalVentasSem() + l.getTotalVentasSem();
    }*/
    
    public int menorVenta(Supermercado n,Supermercado d,Supermercado l){
        if(n.getTotalVentasSem() < d.getTotalVentasSem() && n.getTotalVentasSem() < l.getTotalVentasSem()){
            return unx;
        }else if(d.getTotalVentasSem() < n.getTotalVentasSem() && d.getTotalVentasSem() < l.getTotalVentasSem()){
            return dox;
        }else if(l.getTotalVentasSem() < n.getTotalVentasSem() && l.getTotalVentasSem() < d.getTotalVentasSem()){
            return trex;
        }else{
          System.out.println("Los tres son iguales");  
        }
        return 0;
    }
}
