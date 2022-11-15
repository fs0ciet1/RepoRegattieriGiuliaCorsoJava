import java.util.Scanner;

class creazioneOggetto
{
    public static void main(String []args) 
    {
        Scanner Myobj= new Scanner (System.in); //creazione di un oggetto di tipo scanner
        //Scanner objInteri = new Scanner(System.in); //per usare gli interi
        System.out. println ("Metti il tuo Nick: ");

        String nome=Myobj.nextLine(); //read user input di tipo stringa
        System.out.println("Il tuo Nick è " + nome); //output per user input

        

    }
}