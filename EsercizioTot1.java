 
/*Creiamo un sistema che ti permetta di inserire username e password
Solo dopo questo inserimento il sistema deve proseguire 
e chiederti di confermare entrambi gli elementi
 
Dopo averli confermati potremmo accedere a Quattro opzioni
 Aggiungi ad ArrayConstringhe (  Nome casuale )
 Aggiungi ad ArrayConNumeri  (  Nome casuale )
 Stampa (tutti insieme)
 Esci  
 All'uscita dovrà stampare uno alla volta ogni elemento dell'array e chiederti la password per confermare le modifiche. Se non metto psw non esce dal sw


 Difficile:  Far anche rimuovere e modificare gli elementi. 
 Aggiungendo al menu due sottofunzioni per ogni scelta di aggiunta possibile */

import java.util.Scanner;

import javax.sound.midi.Soundbank;

import java.util.ArrayList;

public class EsercizioTot1 
{
    public static void main (String [] args)
    {
        String name="";
        String password="";
        String inserimento="";
       
        ArrayList<String> arrayStringhe = new ArrayList<String>();
        ArrayList<Integer> arrayInteri = new ArrayList<Integer>();
        
      
        int inserimentoInt=0;
        boolean controlloDati = false;
        boolean controlloMenu = true;
        boolean controlloSalva = false;
       


        //dichiaro oggetto utilizzato per scanner 
        Scanner myObj = new Scanner(System.in);
     
         
        //====================REGITRSAZIONE===========================//
        while(controlloDati == false) //cicla finchè è sbagliato
        {
            System.out.println("Inserisci username:");
            name=myObj.nextLine();
            
            System.out.println("Inserisci password:");
            password=myObj.nextLine();

            //====================CONTROLLO INSERIMENTO DATI VALIDI===========================//
            /*in questo passaggio controllo con if i campi vuoti e returno all'inserimento e con else interrompo il loop mettendo dati validi */
            if(name.equals("") || password.equals(""))
            {
                System.out.println("Dati non idonei, reinserisci");
            }
            else 
            {
                controlloDati=true;
                System.out.println("Registrazione effettata con successo");
            }
        }

        //====================ENTRA NEL MENU===========================//
        while(controlloMenu == true)
        {

            
            System.out.println("Cosa vuoi fare?");
            System.out.println("A:Aggiungi ad ArrayConstringhe o ArrayConNumeri ");
            System.out.println("M:Modifica");
            System.out.println("R:Rimuovi");
            System.out.println("S:Stampa");
            System.out.println("E:Esci "); 
            System.out.println ("--------------------------------------");

            //scelta dell'azione da fare da parte dell'utente 
            inserimento=myObj.nextLine();

            if(inserimento.equals("A"))
            {
                System.out.println("Vuoi inserire:");
                System.out.println("A:ArrayConstringhe");
                System.out.println("B:ArrayConNumeri");

                inserimento=myObj.nextLine();

                if(inserimento.equals("A"))
                {
                    System.out.println("Inserisci i valori da aggiungere nell'Array:");
                    arrayStringhe.add(myObj.nextLine()); //serve per dare ad arraystirng direttamente il dato da input
                    System.out.println(arrayStringhe);     
                }
                else if (inserimento.equals("B"))
                {
                    System.out.println("Inserisci i valori da aggiungere nell'Array:");
                    arrayInteri.add(myObj.nextInt()); //serve per dare ad arrayInt direttamente il dato da input
                    System.out.println(arrayInteri);
                }
                else
                {
                    System.out.println("Devi inserire per forza A o B");
                }

                
            }

            else if(inserimento.equals("M"))
            {
                System.out.println("Vuoi modificare:");
                System.out.println("A:ArrayConstringhe");
                System.out.println("B:ArrayConNumeri");

                inserimento=myObj.nextLine();

                if(inserimento.equals("A"))
                {
                    System.out.println(arrayStringhe); 

                    Scanner pos = new Scanner(System.in);
                    Scanner val = new Scanner(System.in);
                    System.out.println("In quale posizione vuoi modificare?: ");
                    int Riferimento = pos.nextInt();  //scelgo la posizione di modifica ed inserisco
                    System.out.println("Che valore vuoi inserire?: ");
                    String Modifica = val.nextLine(); //scelgo il nuovo valore da inserire e lo inserisco
                    arrayStringhe.set(Riferimento, Modifica); //qui effettuo la modifica nell'array

                }
                else if(inserimento.equals("B"))
                {
                    System.out.println(arrayInteri);

                    Scanner pos = new Scanner(System.in);
                    Scanner val = new Scanner(System.in);
                    System.out.println("In quale posizione vuoi modificare?: ");
                    int Riferimento = pos.nextInt();  //scelgo la posizione di modifica ed inserisco
                    System.out.println("Che valore vuoi inserire?: ");
                    int Modifica = val.nextInt(); //scelgo il nuovo valore da inserire e lo inserisco
                    arrayInteri.set(Riferimento, Modifica); //qui effettuo la modifica nell'array

                }
                else
                {
                    System.out.println("Devi inserire per forza A o B");
                }

            }

            else if(inserimento.equals("R"))
            {
                System.out.println("Vuoi rimuovere:");
                System.out.println("A:ArrayConstringhe");
                System.out.println("B:ArrayConNumeri");

                inserimento=myObj.nextLine();

                if(inserimento.equals("A"))
                {
                    System.out.println(arrayStringhe); 

                    Scanner pos = new Scanner(System.in);
                    System.out.println("In quale posizione vuoi eliminare?");
                    int posizione = pos.nextInt(); //scelgo la posizione da da dove rimuovere il valore nell array
                    arrayStringhe.remove(posizione);   //qui rimuovo
                }
                else if(inserimento.equals("B"))
                {
                    System.out.println(arrayInteri);

                    Scanner pos = new Scanner(System.in);
                    System.out.println("In quale posizione vuoi eliminare?");
                    int posizione = pos.nextInt(); //scelgo la posizione da da dove rimuovere il valore nell array
                    arrayInteri.remove(posizione);   //qui rimuovo
                }
                else
                {
                    System.out.println("Devi inserire per forza A o B");
                }
            }

            else if(inserimento.equals("S"))
            {
                System.out.println(arrayStringhe);
                System.out.println(arrayInteri);
            }
            else if (inserimento.equals("E"))
            {
                
                controlloMenu=false;

                while(controlloSalva == false) //qui ciclerà finché non si inserisce S o N
                {
                    System.out.println("Sei uscito dal menu, vuoi salvare le modifiche? ");
                    System.out.println("S");
                    System.out.println("N");

                    inserimento=myObj.nextLine();

                    if(inserimento.equals("S"))
                    {
                        controlloSalva = true;
                        System.out.println("Inserisci password per salvare le modifiche");
                        inserimento=myObj.nextLine();

                        if(inserimento.equals(password))
                        {
                            System.out.println("Modifiche salvate con successo");
                        }
                        else
                        {
                            System.out.println("Password errata, dati non salvati");
                            arrayStringhe.clear();
                            arrayInteri.clear();

                        }
                    }
                    else if(inserimento.equals("N"))
                    {
                        controlloSalva = true;
                        System.out.println("Dati non salvati");
                        arrayStringhe.clear();
                        arrayInteri.clear();
                    }
                    else
                    {
                        System.out.println("Devi inserire per forza S o N");
                    }
                }
                
                
            }
            else
            {
                System.out.println("Interazion non valida!");
            }
        }
           
    }
}
