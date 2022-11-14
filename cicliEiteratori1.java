import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class cicliEiteratori1 
{
    public static void main (String[]args)
    {
        //dichiaro variabili primarie
        double X = 11;
        double Y = 22;
        double Z = 12.5;

        //dichiaro variabili secondaria
        String sceltaOp=""; //utilizzo variabile per scelta opz menu 
        Double ValT=0.0;    //variabile temporanea per somma e sottrazione 

        //dichiaro oggietto utilizzato per scanner 
        Scanner myObj = new Scanner(System.in); 

        //inizio ciclo menu 
        do
        {
            System.out.println ("--------------------------------------");
            //cosa vuoi fare? 
            System.out.println ("Scegli una lettere in base a ciò che vuoi fare");
            System.out.println ("A:Aggiungi ");
            System.out.println("B:Sottrai ");
            System.out.println("C:Stampa ");
            System.out.println("E: Esc ");
            
            //interazione utente scelta azione
            System.out.println ("--------------------------------------");
            sceltaOp=myObj.nextLine();
            //====================SOMMA ===========================//
            if (sceltaOp.equals("A"))
            { 
               
                    System.out.println ("Scegli una delle seguenti variabili poi aggiungi un numero a scelta ad essa  ");
                    System.out.println ("X="+X );
                    System.out.println ("Y="+Y );
                    System.out.println ("Z="+Z );
             
                    //in input l'utente inserisce variabile + num a scleta
                    System.out.print("Inserisci variabile scelta: ");
                    sceltaOp=myObj.nextLine();
    
                    System.out.print("Inserisci valore da aggiungere: ");
                    //dopo utente inserisce valore
                    ValT=myObj.nextDouble();
        
                    //controlla quale variabile scelta per addizione 
                    if (sceltaOp.equals("X"))
                    {
                        X=X+ValT; //x+=ValT
                        System.out.println("Il valore di X ore è: "+X); //stampo 
                    }
    
                    if (sceltaOp.equals("Y"))
                    {
                        Y=Y+ValT; //x+=ValT
                        System.out.println("Il valore di y ore è: "+Y);
                    }
    
                    if (sceltaOp.equals("Z"))
                    {
                        Z=Z+ValT; //x+=ValT
                        System.out.println("Il valore di z ore è: "+Z);
                    }
    
            }

            //====================SOTTRAZIONE ===========================//
            else if (sceltaOp.equals("B"))
            {
                System.out.println ("Scegli una delle seguenti variabili poi sottrarre un numero a scelta senza poter scendere sotto 1 di valore minimo");
                System.out.println ("X="+X );
                System.out.println ("Y="+Y );
                System.out.println ("Z="+Z );
                
                //in input l'utente inserisce variabile + num a scleta
                System.out.print("Inserisci variabile scelta: ");
                sceltaOp=myObj.nextLine();

                System.out.print("Inserisci valore da sottrarre: ");
                //dopo utente inserisce valore
                ValT=myObj.nextDouble();
            
                //controlla quale variabile scelta per sottrazione 
                if (sceltaOp.equals("X"))
                {
                    
                    if(X-ValT>=1)
                    {
                        X=X-ValT; //x-=ValT
                        System.out.println("Il valore di X ore è: "+X);
                    }
                    else
                    {
                        System.out.println("Il valore della sottrazione < di 1");
                    }
                    
                }

                if (sceltaOp.equals("Y"))
                {
                    
                    if(Y-ValT>=1)
                    {
                        Y=Y-ValT; //x-=ValT
                        System.out.println("Il valore di X ore è: "+Y);
                    }
                    else
                    {
                        System.out.println("Il valore della sottrazione < di 1");
                    }
                    
                }

                if (sceltaOp.equals("Z"))
                {
                    
                    if(Z-ValT>=1)
                    {
                        Z=Z-ValT; //x-=ValT
                        System.out.println("Il valore di X ore è: "+Z);
                    }
                    else
                    {
                        System.out.println("Il valore della sottrazione < di 1");
                    }
                    
                }

        
            }
            
            //====================STAMPA ===========================//
            else if (sceltaOp.equals("C"))
            {
                System.out.println ("Scegli una lettere in base a ciò che vuoi fare");
                System.out.println ("T:Stampa tutte le variabili ");
                System.out.println("U:stampa solo una vatiabile ");

                //dopo utente inserisce valore per stampare
                sceltaOp=myObj.nextLine();

                if(sceltaOp .equals("T"))
                {
                    //così le stampa tutte
                    System.out.println ("Stampa tutte le variabili o una a tua scelta");
                    System.out.println ("X="+X );
                    System.out.println ("Y="+Y );
                    System.out.println ("Z="+Z ); 
                }

                if(sceltaOp .equals("U"))
                {
                    //così ne stampa 
                    System.out.println ("Quale variabile vuoi stampare?");
                    sceltaOp=myObj.nextLine();
                    if (sceltaOp.equals("X"))
                    {
                        System.out.println(X); //stampo 
                    }

                    else if (sceltaOp.equals("Y"))
                    {
                        System.out.println(Y); //stampo 
                    }

                    else if (sceltaOp.equals("Z"))
                    {
                        System.out.println(Z); //stampo 
                    }
                    
                    else
                    {
                        System.out.println("VARIABILE NON ESISTENTE");
                    }  
                }

                

            }
        }
        while (!(sceltaOp.equals("E")));
        //qui finisce il ciclo menu
        System.out.println("ARRIVEDERCI E GRAZEI");

        

    }     
}

