import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBotonBaja implements ActionListener{
	Logica logica;
	LogicaGrafica logicaGrafica;

	public ListenerBotonBaja(Logica logica, LogicaGrafica logicaGrafica) {
		super();
		this.logica = logica;
		this.logicaGrafica = logicaGrafica;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		logica.borrarLibro(logicaGrafica.getLibroSeleccionado());
		logicaGrafica.pintarLista(logica.getLibros());
		logicaGrafica.activarBoton("Baja", false);
		logicaGrafica.resetearInformacion();
	}

}
