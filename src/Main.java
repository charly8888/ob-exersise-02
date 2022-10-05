public class Main {
    public static void main(String[] args) {
       int numeroIf = 11;

       if(numeroIf < 0){
           System.out.println("Number is less than 0");
       } else if (numeroIf>0) {
           System.out.println("Number is more than 0");
       }else{
           System.out.println("Number is 0");
       }
       int numeroWhile = 0;

               while(numeroWhile < 3){
                   System.out.println( numeroWhile);
                   numeroWhile++;

               }

               do {
                   System.out.println( numeroWhile);
                   numeroWhile++;
               }while (numeroWhile < 3);


        for (var numeroFor = 0 ; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);

        }

        var estacion = "primavera";

        switch (estacion){
            case "verano":
                System.out.println(estacion);
                break;
            case "otoño":
                System.out.println(estacion);
                break;
            case "invierno":
                System.out.println(estacion);
                break;
            case "primavera":
                System.out.println(estacion);
                break;
            default:
                System.out.println("la variable no es una estación");
        }


    }
}