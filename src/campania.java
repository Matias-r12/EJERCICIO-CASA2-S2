public class campania {
    public String nombre;
    public double presupuesto;
    String plataforma;
    boolean activa;
    public void mostrarInformacion(){
        System.out.println("El nombre de la campaña es: "+nombre);
        System.out.println("La plataforma es: "+plataforma);
    }
    public void activar(){
        this.activa= true;
        System.out.println("la campania en " +plataforma+ " a sido activada");
    }
    void desactivar(){
        this.activa=false;
        System.out.println("la campania en " +plataforma+ " a sido desactivada");
    }
    void mostrarPresupuesto(){
        System.out.println("El presupuesto es de : "+presupuesto);
    }

}
