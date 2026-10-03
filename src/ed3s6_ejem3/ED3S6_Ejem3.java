/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ed3s6_ejem3;

/**
 *
 * @author brend
 */
public class ED3S6_Ejem3 {

    public static void main(String[] args) {
    // TODO code application logic here
    TipoDato<Integer> obj1 = new TipoDato<>(10);
    obj1.MostrarDato();

    TipoDato<String> obj2 = new TipoDato<>("Esta es una cadena");
    obj2.MostrarDato();

    TipoDato<Double> obj3 = new TipoDato<>(22.5);
    obj3.MostrarDato();

    TipoDato<Float> obj4 = new TipoDato<>(15.6f);
    obj4.MostrarDato();

    TipoDato2<Integer, Integer> obj5 = new TipoDato2<>(5,8);
    obj5.MostrarDato();

    TipoDato2<String, Double> obj6 = new TipoDato2<>("Cadena",15.2);
    obj6.MostrarDato();
}

    
}
