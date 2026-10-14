public class Main{
    static void main(){
     campania campania1 = new campania();
     campania campania2 = new campania();
     campania campania3 = new campania();

     campania1.nombre=("VIDEOINSTA");
     campania1.plataforma=("INSTAGRAM");
     System.out.println("---CAMPANIA 1---");
     campania1.mostrarInformacion();
     campania1.presupuesto=(800);
     campania1.mostrarPresupuesto();
     campania1.activa=true;
     campania1.activar();

     campania2.nombre=("GAMINGTOK");
     campania2.plataforma=("TIK TOK");
     System.out.println("---CAMPANIA 2---");
     campania2.mostrarInformacion();
     campania2.presupuesto=(900);
     campania2.mostrarPresupuesto();
     campania2.activa=false;
     campania2.desactivar();

     campania3.nombre=("ECOFACE");
     campania3.plataforma=("FACEBOOK");
     System.out.println("---CAMPANIA 3---");
     campania3.mostrarInformacion();
     campania3.presupuesto=(100);
     campania3.mostrarPresupuesto();
     campania3.activa=true;
     campania3.activar();

     System.out.println("----Activaremos la campania 2----");
     campania2.activa=true;;
     campania2.activar();
    }
}
