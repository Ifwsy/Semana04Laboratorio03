package semana04laboratorio03;
import java.util.*;
//import java.util.Scanner;
//import java.util.ArrayList;
public class Semana04Laboratorio03 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Supermercado uno = new Supermercado();
        Supermercado dos = new Supermercado();
        Supermercado tres = new Supermercado();
        List<Integer> Dias1 = new ArrayList<>();
        List<Integer> Dias2 = new ArrayList<>();
        List<Integer> Dias3 = new ArrayList<>();
        Calculos c = new Calculos();
        int suma1 = 0;
        int suma2 = 0;
        int suma3 = 0;
        float Lunes,Martes,Miercoles,Jueves,Viernes,Sabado,Domingo;
        
        System.out.println("****SUPERMERCADO 1****");
        System.out.println("Ingrese el nombre del supermercado 1: ");
        uno.setNombre(leer.next());
        //uno.setNombre(leer.nextLine());
        
        System.out.println("Ingrese el código del supermercado 1: ");
        uno.setCodigo(leer.nextInt());
        
        System.out.println("Ingrese el nombre del gerente: ");
        uno.setNomGerente(leer.next());
        
        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese las ventas por día: ");
            Dias1.add(leer.nextInt());
        }
        System.out.println(Dias1.toString());
        for (int numero : Dias1) {
            suma1 += numero;
            uno.setTotalVentasSem(suma1);
        }
        Lunes = Dias1.get(0);
        Martes = Dias1.get(1);
        Miercoles = Dias1.get(2);
        Jueves = Dias1.get(3);
        Viernes = Dias1.get(4);
        Sabado = Dias1.get(5);
        Domingo = Dias1.get(6);
        System.out.println("El porcentaje de venta del día lunes es "+c.porcenDia(uno, Lunes)+"%");
        System.out.println("El porcentaje de venta del día martes es "+c.porcenDia(uno, Martes)+"%");
        System.out.println("El porcentaje de venta del día miercoles es "+c.porcenDia(uno, Miercoles)+"%");
        System.out.println("El porcentaje de venta del día jueves es "+c.porcenDia(uno, Jueves)+"%");
        System.out.println("El porcentaje de venta del día viernes es "+c.porcenDia(uno, Viernes)+"%");
        System.out.println("El porcentaje de venta del día sabado es "+c.porcenDia(uno, Sabado)+"%");
        System.out.println("El porcentaje de venta del día domingo es "+c.porcenDia(uno, Domingo)+"%");
        System.out.println("La venta semanal del "+uno.getNombre()+" fue de " + suma1);
        
        System.out.println("\n");
        
        System.out.println("****SUPERMERCADO 2****");
        System.out.println("Ingrese el nombre del supermercado 2: ");
        dos.setNombre(leer.next());
        System.out.println("Ingrese el código del supermercado 2: ");
        dos.setCodigo(leer.nextInt());
        System.out.println("Ingrese el nombre del gerente: ");
        dos.setNomGerente(leer.next());
        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese las ventas por día: ");
            Dias2.add(leer.nextInt());
        }
        System.out.println(Dias2.toString());
        for (int numero : Dias2) {
            suma2 += numero;
            dos.setTotalVentasSem(suma2);
        }
        Lunes = Dias2.get(0);
        Martes = Dias2.get(1);
        Miercoles = Dias2.get(2);
        Jueves = Dias2.get(3);
        Viernes = Dias2.get(4);
        Sabado = Dias2.get(5);
        Domingo = Dias2.get(6);
        System.out.println("El porcentaje de venta del día lunes es "+c.porcenDia(dos, Lunes)+"%");
        System.out.println("El porcentaje de venta del día martes es "+c.porcenDia(dos, Martes)+"%");
        System.out.println("El porcentaje de venta del día miercoles es "+c.porcenDia(dos, Miercoles)+"%");
        System.out.println("El porcentaje de venta del día jueves es "+c.porcenDia(dos, Jueves)+"%");
        System.out.println("El porcentaje de venta del día viernes es "+c.porcenDia(dos, Viernes)+"%");
        System.out.println("El porcentaje de venta del día sabado es "+c.porcenDia(dos, Sabado)+"%");
        System.out.println("El porcentaje de venta del día domingo es "+c.porcenDia(dos, Domingo)+"%");
        System.out.println("La venta semanal del "+dos.getNombre()+" fue de " + suma2);
        
        System.out.println("\n");
        
        System.out.println("****SUPERMERCADO 3****");
        System.out.println("Ingrese el nombre del supermercado 3: ");
        tres.setNombre(leer.next());
        System.out.println("Ingrese el código del supermercado 3: ");
        tres.setCodigo(leer.nextInt());
        System.out.println("Ingrese el nombre del gerente: ");
        tres.setNomGerente(leer.next());
        for(int i = 0; i < 7; i++){
            System.out.println("Ingrese las ventas por día: ");
            Dias3.add(leer.nextInt());
        }
        System.out.println(Dias3.toString());
        for (int numero : Dias3) {
            suma3 += numero;
            tres.setTotalVentasSem(suma3);
        }
        Lunes = Dias3.get(0);
        Martes = Dias3.get(1);
        Miercoles = Dias3.get(2);
        Jueves = Dias3.get(3);
        Viernes = Dias3.get(4);
        Sabado = Dias3.get(5);
        Domingo = Dias3.get(6);
        System.out.println("El porcentaje de venta del día lunes es "+c.porcenDia(tres, Lunes)+"%");
        System.out.println("El porcentaje de venta del día martes es "+c.porcenDia(tres, Martes)+"%");
        System.out.println("El porcentaje de venta del día miercoles es "+c.porcenDia(tres, Miercoles)+"%");
        System.out.println("El porcentaje de venta del día jueves es "+c.porcenDia(tres, Jueves)+"%");
        System.out.println("El porcentaje de venta del día viernes es "+c.porcenDia(tres, Viernes)+"%");
        System.out.println("El porcentaje de venta del día sabado es "+c.porcenDia(tres, Sabado)+"%");
        System.out.println("El porcentaje de venta del día domingo es "+c.porcenDia(tres, Domingo)+"%");
        System.out.println("La venta semanal del "+tres.getNombre()+" fue de " + suma3);
        
        System.out.println("\n");
        
        System.out.println("La venta total de los tres supermercados es "+c.ventaTotal(uno,dos,tres));
        System.out.println("El supermercado que vendio menos fue el número "+c.menorVenta(uno, dos, tres));
    }
}
