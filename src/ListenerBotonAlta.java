import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBotonAlta implements ActionListener{
	
	private Logica logica;
	private LogicaGrafica logicaGrafica;
	
	public ListenerBotonAlta(Logica logica,LogicaGrafica logicaGrafica) {
		super();
		this.logica = logica;
		this.logicaGrafica = logicaGrafica;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Libro libro = logicaGrafica.crearLibro(logica.getLibros());
		if (libro!= null) {
			logica.altaLibro(libro);
			logicaGrafica.pintarLista(logica.getLibros());
			logicaGrafica.activarBoton("Alta", false);
			logicaGrafica.resetearInformacion();
		}
		else logicaGrafica.mostrarMensaje("libro repetido");
	}

}
