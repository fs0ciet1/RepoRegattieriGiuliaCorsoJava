public class EsercizioFor 
{
    public static void main (String [] args)
    {
        String [] cars = {"Volvo", "BMW", "Ford", "Mazda",};
        Integer [] number = {4,7,10,20};

        for (int i=0; i< cars.length; i++)
        {
            System.out.println(cars[i]);     
        }

        System.out.println ("--------------------------------------");

        for (int i=0; i<number.length; i++)
        {
            System.out.println(number[i]);
            //break; serve per interropere l'esecuzione di un loop
        }
    }
}
