//creare un sistema di inserimento in ciclo, ovvero avere uno scanner e farlo girare più volte
//con loop che riempia due array, uno di numero e uno di stringhe 
//a scelta dell’utente fino a che sceglie ESC


import java.util.Scanner;
class EsercizioArray1
{
    public static void main (String [] args)
    {
        //dichiaro variabili principali 
        String [] nome = {"","","",""};
        Integer [] numero ={0,0,0,0};
        String scelta ="";
        int scelta2=0;
        int x=0;
        int y=0;

        //dichiaro oggetto utilizzato per scanner 
        Scanner myObj = new Scanner(System.in); 
        
        do
        {
            System.out.println ("Cosa vuoi fare?");
            System.out.println ("A:Inserisci nome  ");
            System.out.println("N:Inserisci un numero ");
            System.out.println("E:Esci "); 
            

            System.out.println ("--------------------------------------");
            scelta=myObj.nextLine();

            //====================SCELTA N1 ===========================//
            if(scelta.equals("A"))
            {   
                Scanner parola = new Scanner(System.in);
                System.out.println("Inserisci il tuo nome");
                scelta=parola.nextLine();
                nome[x]=scelta;
                x++;
            }

            //====================SCELTA N2 ===========================//
            if(scelta.equals("N"))
            {   
                Scanner valori = new Scanner(System.in);
                System.out.println("Inserisci un numero");
                scelta2=valori.nextInt();
                numero[y]=scelta2;
                y++;
            }
        }
        while (!(scelta.equals("E")));
        //qui finisce il ciclo menu
        for (int i = 0; i < nome.length; i++) 
        {
            System.out.print(nome[i]+ " " );
        }
        System.out.println();
        for (int i = 0; i < numero.length; i++) 
        {
            System.out.print(numero[i]+ " " );
        }
        System.out.println();
        System.out.println("ARRIVEDERCI E GRAZIE");
        System.out.println();

      
        
        
    } 
}