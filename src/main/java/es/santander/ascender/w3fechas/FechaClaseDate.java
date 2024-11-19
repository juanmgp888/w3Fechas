package es.santander.ascender.w3fechas;
/* proyecto 08 */

import java.util.Date;

public class FechaClaseDate {
    
   public String pasarFechaAString(Date fechaHoyDate){
    String diaSemanaFinal="";
    String diaFinal="";
    String mesFinal="";
    String annoFinal=Integer.toString(fechaHoyDate.getYear()+1900); // getYear devuelve un entero. Integer tiene método a String

    String zonaHoraria = Integer.toString(fechaHoyDate.getTimezoneOffset());

    // Pasar los int a String
    switch (fechaHoyDate.getDay()){
        case 0 : diaSemanaFinal = "Domingo";break;
        case 1 : diaSemanaFinal = "Lunes";break;
        case 2 : diaSemanaFinal = "Martes";break;
        case 3 : diaSemanaFinal = "Miércoles";break;
        case 4 : diaSemanaFinal = "Jueves";break;
        case 5 : diaSemanaFinal = "Viernes";break;
        case 6 : diaSemanaFinal = "Sábado";break;
        default:
    }
    System.out.println("Día: "+diaSemanaFinal);
      
    switch (fechaHoyDate.getDate()){
        
        case 1 : diaFinal = "01";break;
        case 2 : diaFinal = "02";break;
        case 3 : diaFinal = "03";break;
        case 4 : diaFinal = "04";break;
        case 5 : diaFinal = "05";break;
        case 6 : diaFinal = "06";break;
        case 7 : diaFinal = "07";break;
        case 8 : diaFinal = "08";break;
        case 9 : diaFinal = "09";break;
        case 10 : diaFinal = "10";break;
        case 11 : diaFinal = "11";break;
        case 12 : diaFinal = "12";break;
        case 13 : diaFinal = "13";break;
        case 14 : diaFinal = "14";break;
        case 15 : diaFinal = "15";break;
        case 16 : diaFinal = "16";break;
        case 17 : diaFinal = "17";break;
        case 18 : diaFinal = "18";break;
        case 19 : diaFinal = "19";break;
        case 20 : diaFinal = "20";break;
        case 21 : diaFinal = "21";break;
        case 22 : diaFinal = "22";break;
        case 23 : diaFinal = "23";break;
        case 24 : diaFinal = "24";break;
        case 25 : diaFinal = "25";break;
        case 26 : diaFinal = "26";break;
        case 27 : diaFinal = "27";break;
        case 28 : diaFinal = "28";break;
        case 29 : diaFinal = "29";break;
        case 30 : diaFinal = "30";break;
        case 31 : diaFinal = "31";break;

        default:
    }
    System.out.println("Día: "+diaFinal);

    switch (fechaHoyDate.getMonth()){
        case 0 : mesFinal = "Enero";break;
        case 1 : mesFinal = "Febrero";break;
        case 2 : mesFinal = "Marzo";break;
        case 3 : mesFinal = "Abril";break;
        case 4 : mesFinal = "Mayo";break;
        case 5 : mesFinal = "Junio";break;
        case 6 : mesFinal = "Julio";break;
        case 7 : mesFinal = "Agosto";break;
        case 8 : mesFinal = "Septiembre";break;
        case 9 : mesFinal = "Octubre";break;
        case 10 : mesFinal = "Noviembre";break;
        case 11 : mesFinal = "Diciembre";break;
        default:
    }     
    System.out.println("Mes: "+mesFinal);  
    
    System.out.println("Año: "+annoFinal);  
    System.out.println("Zona Horaria: "+zonaHoraria);
    
    String fechaDefinitiva = diaFinal+"/"+mesFinal+"/"+annoFinal;
    return fechaDefinitiva;
   }

    public static void main(String[] args) {

        Date fechaHoy = new Date();
        //System.out.println(" \n \n ");
        System.out.println("\nFecha de hoy y hora actual CET  "+fechaHoy);
        System.out.println("\nFecha de hoy y hora actual CET  "+fechaHoy.toString());
        System.out.println("\nFecha de hoy y hora GMT (Greenwich) = UT (Universal Time)  "+fechaHoy.toGMTString());
        System.out.println("\nFecha de hoy y hora locales PM "+fechaHoy.toLocaleString());
        System.out.println("\nDía de la semana hoy: [0 domingo al 6 sábado] "+fechaHoy.getDay());
        System.out.println("\nDía del mes hoy: [0 al 30] "+fechaHoy.getDate());
        System.out.println("\nMes de hoy: [0 enero al 11 diciembre] "+fechaHoy.getMonth());
        System.out.println("\nAño de hoy: [1900 al 1999] "+fechaHoy.getYear());
        System.out.println("\nZona horaria: "+fechaHoy.getTimezoneOffset());

        FechaClaseDate fechaResultado = new FechaClaseDate();
        String fechaDefinitiva = fechaResultado.pasarFechaAString(fechaHoy);
        System.out.println("La fecha actual es: "+fechaDefinitiva);
    }
}
