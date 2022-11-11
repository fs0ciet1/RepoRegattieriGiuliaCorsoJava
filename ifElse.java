class ifElse
{
    public static void main (String [] args )
    {
        //dichiaro variabili
        int x;
        int y;
        int z;

        //assegno valori
        x=3;
        y=13;
        z=13;

        if (x == y)
        {
            System.out.println(" NON SONO UGUALI");
        } 

        if (x < y)
        {
            System.out.println(" E' MINORE");
        }

        if (y==z)
        {
            System.out.println(" SONO UGUALI");
        }
        
        if (x != y)
        {
            if (x < y)
            {
                if (y==z)
                {
                    System.out.println("EVVIVA");
                } 
            }  
        }

        
    }
}