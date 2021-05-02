package paquete1;

/**
 *
 * @author Jose Cordova
 */
public class Ejecutor {
    public static void main(String[] args) {
        //Cheque 1
        String n = "Jose Cordova";
        String nBan = "Banco de Loja";
        double valChe = 500.50;
        
        Cheques cheque1 = new Cheques(n, nBan, valChe);
        cheque1.establecerNombreCliente(n);
        cheque1.establecerNombreBanco(nBan);
        cheque1.establecerValorCheque(valChe);
        cheque1.establecerComisionCobrar();
        System.out.println(cheque1);
        
        System.out.println(" ");

        String nom2 = "Daniel Añazco";
        String nomBan2 = "Banco de Pichincha";
        double valChe2 = 750.20;

        Cheques cheque2 = new Cheques(nom2, nomBan2, valChe2);
        cheque2.establecerNombreCliente(nom2);
        cheque2.establecerNombreBanco(nomBan2);
        cheque2.establecerValorCheque(valChe2);
        cheque2.establecerComisionCobrar();
        System.out.println(cheque2);

    }
    
}
