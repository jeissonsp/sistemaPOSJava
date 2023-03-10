import com.jsindicue.sistemaposjava.modelo.Cliente;
import com.jsindicue.sistemaposjava.modelo.Proveedor;
import com.jsindicue.sistemaposjava.modelo.Vendedor;
import com.jsindicue.sistemaposjava.repositorio.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
        Vendedor objV = new Vendedor("julio",1234567890);
        Vendedor objV2 = new Vendedor("angela",1234567890);
        System.out.println(objV.toString()+" /n"+objV2.toString());

        Proveedor objP = new Proveedor("marcela","Nutresa",1234560934);
        Proveedor objP2 = new Proveedor("vanesa","Nutresa",1234560934);
        System.out.println(objP.toString()+" /n"+objP2.toString());
*/
        CrudRepositorio repo = new ClienteListRepositorio();

        repo.crear(new Cliente("jeisson","cc trebol","3104080925"));
        repo.crear(new Cliente("ana","cc san carlos","3104080926"));
        repo.crear(new Cliente("oliver","cc fija","3104080927"));
        repo.crear(new Cliente("matias","cc manzana","3104080928"));

        List<Cliente> clientes = repo.mostrar();
        clientes.forEach(System.out::println);
        System.out.println("============== Paginable ===========");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0,2);
        paginable.forEach(System.out::println);
        System.out.println("============== Ordenable ASC ===========");
        List<Cliente> clientesOrdenableAsc = ((OrdenableRepositorio)repo).listar("nombreCompleto", Direccion.ASC);
        clientesOrdenableAsc.forEach(System.out::println);
        System.out.println("============== Ordenable Desc ===========");
        List<Cliente> clientesOrdenableDesc = ((OrdenableRepositorio)repo).listar("direccion", Direccion.DESC);
        clientesOrdenableDesc.forEach(System.out::println);
        System.out.println("========== editar ==========");
        Cliente obj1 = new Cliente("jorge","afuera","314");
        obj1.setId(4);
        repo.editar(obj1);
        ((OrdenableRepositorio)repo).listar("nombreCompleto", Direccion.DESC).forEach(System.out::println);
        System.out.println("=========== eliminar =========");
        //repo.eliminar(4);
        repo.mostrar().forEach(System.out::println);


    }
}