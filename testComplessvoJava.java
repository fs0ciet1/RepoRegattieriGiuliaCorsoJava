
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

import java.util.ArrayList;


class testComplessvoJava
{
    public static void main (String [] args)
    {
        //dichiarazione variabili primarie 
        String nomeUtente="Giula";
        String passwordUtente="BuonCib0!";
        String nomeAdmin="Mr.Robot";
        String passwordAdmin="HelloFriend!";

        boolean controlloDati = true;
        
        String scelta ="";

        
        
        //dichiaro oggetto utilizzato per scanner 
        Scanner myObj = new Scanner(System.in);

       /* */ //====================SCELTA ADMIN O UTENTE===========================//
        System.out.println("Vuoi entrare come:");
        System.out.println("A:Admin");
        System.out.println("U:Utente");
        System.out.println ("--------------------------------------");

        scelta=myObj.nextLine();
        //while(controlloDati==true)

        //scelta interazione utente
        if(scelta.equals("A"))
        {
            //====================LOGIN ADMIN===========================//
            while(controlloDati==false)
            {
                System.out.println("Inserisci nome admin:");
                nomeAdmin=myObj.nextLine();

                System.out.println("Inserisci password admin:");
                passwordAdmin=myObj.nextLine();

                //====================CONTROLLO INSERIMENTO DATI VALIDI===========================//
                /*in questo passaggio controllo con if i campi vuoti e returno all'inserimento e con else interrompo il loop mettendo dati validi */
                if(nomeAdmin.equals("") || passwordUtente.equals(""))
                {
                    
                    System.out.println("Dati non idonei, reinserisci");
                }
                else
                {
                    controlloDati=true;
                    System.out.println("Benvenuto, inserisci il tuo budget");
                    
                    
                }

            }
            
        }
        else if (scelta.equals("U"))
        {
            System.out.println("Inserisci nome utente:");
                nomeUtente=myObj.nextLine();

            System.out.println("Inserisci password utente:");
            passwordAdmin=myObj.nextLine();
        }
        else
        {
            System.out.println("Devi inserire per forza A o B");
        }

        
        
           
                    
    }

    
}