/*
 * Este es el segundo taller de lógica de programación. En este taller deben comenzar a prácticar hacer las validaciones
 * de los datos que va a recibir la función usando los condicionales if. 
 * 
 * Como en el anterior, tenga en cuenta la siguiente rúbrica para cada ejercicio la cual, 
 * se basa en los mandamientos del programador. El taller es una herramienta para comenzar a preparar la evaluación 
 * donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * La siguiente rúbrica se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package taller2;

public class App {

    public static void main(String[] args) {
        try {
            System.out.println(Calcular_saldo(2000000, 500000, 1000000));

            System.out.println(Calcular_tip(100));

            System.out.println(Obtener_puntos(3, 2, 1));

            System.out.println(Calcular_definitiva(4, 4, 4, 4,4, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));

            System.out.println(Calcular_para_ganar(3, 3, 3, 3, 0.2f, 0.2f, 0.2f, 0.2f, 0.2f));

            System.out.println(Calcular_salario(40, 10, 5, 20000));

            System.out.println(Calcular_area_triangulo(10, 5));

            System.out.println(Calcular_perimetro_cuadrado(5));

            System.out.println(Calcular_volumen_cilindro(5, 10));

            System.out.println(Calcular_area_circulo(5));
        } 

        
        catch (Exception e) {
            System.out.println(e);
        }


    }

    /*
     * 1. Diseñe un algoritmo e implemente la función Calcular_saldo que reciba
     * tres enteros: la base de dinero en la taquilla, el total de recaudos y
     * el total de retiros, y retorne un entero que represente el saldo final
     * en la taquilla.
     * 
     * Valide que la base sea igual a 2.000.000. Si no es así, retorne -1.
     * 
     * saldo_taquilla = base + total recaudos - total_retiros
     * Si hay algún error, retorne -1.
     */
public static int Calcular_saldo(int taquilla, int  recaudos, int retiros){

    try {
        int saldo_final = 0;
        final int base = 2000000;

        if(taquilla == base){
            saldo_final = taquilla + recaudos - retiros;
    }
        else{
            return -1;
    }
            return saldo_final;
    } catch (Exception e) {
            return -1;
    }

}

    /*
     * 2. Diseñe un algoritmo e implemente la función Calcular_tip que reciba
     * un float representando el valor del consumo de un cliente, y devuelva
     * un string que contenga el valor de la propina (10%), el impuesto al
     * consumo (8%) y el valor total a pagar.
     * 
     * MUY IMPORTANTE:
     * 
     * El formato del string debe ser: valor comida: $### - valor propina $### -
     * valor impoconsumo $### - total a pagar $###.
     * 
     * Si hay algún error, retorne "Error en la función Calcular_tip".
     * 
     * Ademas de esto, primero valide que el valor del consumo sea mayor a 0. Si no
     * es así, retorne "Error calculando consumo".
     * 
     */
public static String Calcular_tip(float consumo){

    try {
        String mensaje = "";
        float valor_propina = 0;
        float impuesto_consumo = 0;
        float total_pagar = 0;
        final float consumo_a = 0;
        final float porcen_propina = 0.10f, porcen_impuesto_consumo = 0.08f;
        
        if(consumo >= consumo_a){
            valor_propina = consumo * porcen_propina;
            impuesto_consumo = consumo * porcen_impuesto_consumo;
            total_pagar = consumo + valor_propina + impuesto_consumo;
            mensaje = "valor comida: $" + consumo + " - valor propina $" + valor_propina + " - valor impoconsumo $" + impuesto_consumo + " - total a pagar $" + total_pagar;
    }
        else{
            return "Error calculando consumo";
    }
            return mensaje;
        
    } catch (Exception e) {
            return "Error en la funcion Calcula_tip";
    }
         
 }

    /*
     * 3. Diseñe un algoritmo e implemente la función Obtener_puntos que reciba
     * tres enteros representando el número de partidos ganados, perdidos y
     * empatados de un equipo de fútbol, y devuelva un entero que represente
     * los puntos totales del equipo. La puntuación sigue los lineamientos
     * de la FIFA: 3 puntos por partido ganado, 1 punto por partido empatado y
     * 0 puntos por partido perdido. Si hay algún error, retorne -1.
     * 
     * Valide ademas que los partidos ganados, perdidos y empatados sean mayores o
     * iguales a 0. Si no es así, retorne -1.
     * 
     */
public static int Obtener_puntos(int p_ganados, int p_perdidos, int p_empatados){

    try {
        int puntos_totales = 0;
        final int ganado = 3, empatado = 1, perdido = 0;

        if(perdido <= p_ganados  && perdido <= p_perdidos   && perdido <= p_empatados){
            puntos_totales = p_ganados * ganado + p_perdidos * perdido + p_empatados * empatado;
    }
        else {
            return -1;
    }
            return puntos_totales;

    } catch (Exception e) {
            return -1;
    }
        
        
}
        
    /*
     * 4. Diseñe un algoritmo e implemente la función Calcular_definitiva que
     * reciba cinco floats representando las notas (entre 0 y 5) y cinco floats
     * representando los porcentajes (que entre todos deberán sumar 1 y cada uno
     * estar entre 0 y 1),
     * y devuelva un float que represente la nota definitiva. Si algo está mal
     * con los porcentajes o con las notas, retorne -1.
     */
public static float Calcular_definitiva(float n1, float n2, float n3, float n4, float n5, float p1, float p2, float p3, float p4, float p5){
    try {
        float n_definitiva = 0;
        float porcentajes = 0;
        final float min_nota = 0, max_nota = 5, min_por = 0, max_por = 1;
        
        if( min_nota<= n1 && n1 <= max_nota && min_nota<= n2 && n2 <= max_nota && min_nota<= n3 && n3 <= max_nota && min_nota<= n4 && n4 <= max_nota && min_nota<= n5 && n5 <= max_nota && min_por<= p1 && p1 <= max_por && min_por<= p2 && p2 <= max_por && min_por<= p3 && p3 <= max_por && min_por<= p4 && p4 <= max_por && min_por<= p5 && p5 <= max_por){
            porcentajes = p1 + p2 + p3 + p4 + p5;
        if(min_por<= porcentajes && porcentajes <= max_por){
            n_definitiva = n1 * p1  + n2 * p2 + n3 * p3 +n4 * p4 + n5 * p5;
    }
        else {
            return -1;
    }
    }
        else {
            return -1;
        
    }
            return n_definitiva;
        
    } catch (Exception e) {
            return -1;
    }
}

    /*
     * 5. Diseñe un algoritmo e implemente la función Calcular_para_ganar que
     * reciba cinco floats representando los porcentajes de una materia (que
     * deberán sumar 1 y estar entre 0 y 1) y cuatro floats representando las
     * primeras notas (entre 0 y 5), y devuelva un float que represente la
     * nota que deberá sacar para ganar si el puntaje mínimo es 3. Si algo
     * está mal con los porcentajes o con las notas, retorne -1.
     */
public static float Calcular_para_ganar(float n1, float n2, float n3, float n4, float p1, float p2,  float p3, float p4, float p5){

    try {
        float suma = 0, tot_porcentaje = 0, faltante = 0, porcentaje_max = 0;
        final float ganar = 3;
        tot_porcentaje = 1;
        porcentaje_max = p1 + p2 + p3 + p4 + p5;

        if(porcentaje_max == 1 && p1 > 0 && p1 < tot_porcentaje && p2 > 0 && p2 < tot_porcentaje && p3 > 0 && p3 < tot_porcentaje && p4 > 0 && p4 < tot_porcentaje && p5 > 0 && p5 < tot_porcentaje){
            suma = (n1 * p1) + (n2* p2) + (n3*p3) + (n4*p4);
            faltante = (ganar - suma)/p5;     
    }
        else{
            return -1;
    }
            return faltante;
    
    } catch (Exception e) {
            return -1;
    }
}

    /*
     * 6. Diseñe un algoritmo e implemente la función Calcular_salario que
     * reciba cuatro enteros: cantidad de horas normales laboradas, cantidad
     * de horas extras diurnas laboradas, cantidad de horas extras nocturnas
     * laboradas, y el valor de la hora normal como un float. La función debe
     * retornar un float con el salario total. Las horas extras diurnas tienen
     * un recargo adicional del 15% sobre la hora normal, y las horas extras
     * nocturnas tienen un recargo adicional del 35% sobre la hora normal.
     * 
     * Valide que el valor de la hora normal sea mayor a 0. Si no es así, retorne
     * -1.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_salario(float h_normales, float h_diurnas, float h_nocturnas, float h_valor ){
    try {
        float salario_total = 0;
        float preciof_diurnas = 0;
        float preciof_nocturnas = 0;
        final float diurnas = 0.15f, nocturnas = 0.35f, h_min = 0;

        if(h_valor > h_min){
            preciof_diurnas = h_valor * diurnas;
            preciof_nocturnas = h_valor * nocturnas;
            salario_total =  h_normales * h_valor + (preciof_diurnas* h_diurnas) +  (preciof_nocturnas* h_nocturnas);
    }
        else{
            return -1;
    }
            return salario_total;

    } catch (Exception e) {
        return -1;
    }
}

    /*
     * 7. Diseñe un algoritmo e implemente la función Calcular_area_triangulo
     * que reciba dos floats representando la base y la altura de un triángulo
     * rectángulo, y devuelva un float que represente el área del triángulo.
     * 
     * Valide que la base y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = 1/2 * base * altura.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_area_triangulo(float base, float altura){

    try {
        float area = 0;
        final float formula = 0.5f, no_valido = 0;

        if(base>no_valido && altura > no_valido){
            area = base * altura * formula;
    }
        else {
            return -1;
    }
            return area;

    } catch (Exception e) {
            return -1;
    }
}

    /*
     * 8. Diseñe un algoritmo e implemente la función Calcular_perimetro_cuadrado
     * que reciba un float representando el lado de un cuadrado, y devuelva un
     * float que represente el perímetro del cuadrado.
     * 
     * Valide que el lado sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del perímetro es: perímetro = lado * 4.
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_perimetro_cuadrado(float lado){

    try {
        float perimetro = 0;
        final float lados = 4, no_valido = 0;
        if(lado > no_valido){
            perimetro = lado * lados;
    }
        else{
            return -1;
    }
            return perimetro;

    } catch (Exception e) {
            return -1;
    }
}

    /*
     * 9. Diseñe un algoritmo e implemente la función Calcular_volumen_cilindro
     * que reciba dos floats representando el radio de la base y la altura de
     * un cilindro, y devuelva un float que represente el volumen del cilindro.
     * 
     * Valide que el radio y la altura sean mayores a 0. Si no es así, retorne -1.
     * 
     * La fórmula del volumen es: V = pi * radio^2 * altura, usando pi con
     * precisión de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_volumen_cilindro(float radio, float altura){

    try {
        float volumen = 0;
        final float pi = 3.1415927f, no_valido = 0;

        if(radio > no_valido && altura > no_valido){
            volumen = pi * (radio * radio) * altura;
    }
        else{
            return -1;
    }
            return volumen;

    } catch (Exception e) {
            return -1;
    }
}

    /*
     * 10. Diseñe un algoritmo e implemente la función Calcular_area_circulo
     * que reciba un float representando el radio de un círculo, y devuelva un
     * float que represente el área del círculo.
     * 
     * Valide que el radio sea mayor a 0. Si no es así, retorne -1.
     * 
     * La fórmula del área es: área = pi * radio^2, usando pi con precisión
     * de 7 decimales (3.1415927).
     * 
     * Si hay algún error, retorne -1.
     */
public static float Calcular_area_circulo(float radio){
    try {
        float area = 0;
        final float pi = 3.1415927f, no_valido = 0;

        if(radio > no_valido){
            area = pi * (radio * radio);
    }
        else{
            return -1;
    }

            return area;
    } catch (Exception e) {
            return -1;
    }
}
}
