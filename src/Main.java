import com.jsindicue.sistemaposjava.modelo.Cliente;
import com.jsindicue.sistemaposjava.modelo.Proveedor;
import com.jsindicue.sistemaposjava.modelo.Vendedor;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Cliente objC = new Cliente("jeisson","cc trebol","3104080925");
        Cliente objC2 = new Cliente("jeisson stiven","cc san carlos","3104080925");
        System.out.println(objC.toString()+" /n"+objC2.toString());

        Vendedor objV = new Vendedor("julio",1234567890);
        Vendedor objV2 = new Vendedor("angela",1234567890);
        System.out.println(objV.toString()+" /n"+objV2.toString());

        Proveedor objP = new Proveedor("marcela","Nutresa",1234560934);
        Proveedor objP2 = new Proveedor("vanesa","Nutresa",1234560934);
        System.out.println(objP.toString()+" /n"+objP2.toString());

    }
}