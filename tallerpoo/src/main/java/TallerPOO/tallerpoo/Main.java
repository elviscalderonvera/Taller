package TallerPOO.tallerpoo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.entidades.Cliente;
import com.entidades.Pais;

public class Main {

	static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
			.configure() // configures settings from hibernate.cfg.xml
			.build();
	
	static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
	
	public static void main(String[] args) {
		Cliente cliente= new Cliente("Elvis","Calderon","Vera");
		ingresarCliente(cliente);
		Cliente clientes= new Cliente("Jair","Calderon","Lopez");
		ingresarCliente(clientes);
		Cliente cliente2= new Cliente("Lorena","Vera","Lopez");
		ingresarCliente(cliente2);
		
		Pais pais= new Pais("Ecuador");
		ingresarPais(pais);
		Pais pais1= new Pais("Colombia");
		ingresarPais(pais1);
		Pais pais2= new Pais("Brazil");
		ingresarPais(pais2);
	}
	static void ingresarCliente(Cliente cliente) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(cliente);
		session.getTransaction().commit();
		session.close();
	}
	
	static void ingresarPais(Pais pais) {
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(pais);
		session.getTransaction().commit();
		session.close();

	}

}
