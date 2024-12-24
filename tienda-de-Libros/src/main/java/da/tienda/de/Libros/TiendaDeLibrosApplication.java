package da.tienda.de.Libros;

import da.tienda.de.Libros.vista.LibroForm;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.awt.*;

@SpringBootApplication
public class TiendaDeLibrosApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext contextoSpring =
				new SpringApplicationBuilder(TiendaDeLibrosApplication.class)
						.headless(false)
						.web(WebApplicationType.NONE)
						.run(args);
		// Ejecutamos el codigo
		EventQueue.invokeLater(()->{
			//Obtenemos el objeto form a travez de spring
			LibroForm libroForm = contextoSpring.getBean(LibroForm.class);
			libroForm.setVisible(true);
		});
	}

}
