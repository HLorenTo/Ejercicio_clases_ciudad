package ejerciciociudad;
public class Principal 
{
public static void main (String args [])
{
    Ciudad facatativa = new Ciudad();
    facatativa.setNombre("Facatativa");
    facatativa.setPais("Colombia");
    facatativa.setPoblacion(500000);
    facatativa.setPresidente("Duque");
    
    System.out.println("Ciudad: " + facatativa.getNombre());
    System.out.println("Pais: "+ facatativa.getPais());
    System.out.println("Poblacion: " + facatativa.getPoblacion());
    System.out.println("Presidente: "+facatativa.getPresidente());
}    
}
