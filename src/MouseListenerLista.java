import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerLista implements MouseListener{

	private Logica logica;
	private LogicaGrafica logicaGrafica;
	
	public MouseListenerLista(Logica logica, LogicaGrafica logicaGrafica) {
		super();
		this.logica = logica;
		this.logicaGrafica = logicaGrafica;
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		logicaGrafica.pintarLibro(logica.getLibros()[logicaGrafica.getLibroSeleccionado()]);
		logicaGrafica.activarBoton("Baja", true);
		logicaGrafica.activarPanelesInformacion(false);
	}

	

	@Override
	public void mouseEntered(MouseEvent arg0) {
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
	}

}
