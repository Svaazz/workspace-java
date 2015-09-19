/**
 * Centimeter to inch converter * 
 * @author Svaazz 
 * @version 19.09.2015
 */
public class convertidor
{
    private double x;

    public convertidor()
    {
        x = 0;
    }
    
    public void centimetrosPulgadas(double centimetros)
    {
        x = centimetros / 2.54;
        System.out.println(centimetros + " cm, son " + x + " pulgadas");
        
    }
    
    public void pulgadasCentimetros(double pulgadas)
    {
        x = 2.54 * pulgadas;
        System.out.println(pulgadas + " pulgadas, son " + x + " cm");
        
    }
}
