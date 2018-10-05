import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerBotonNuevo implements ActionListener{

	private LogicaGrafica logicaGrafica;
	
	public ListenerBotonNuevo(LogicaGrafica logicaGrafica) {
		super();
		this.logicaGrafica = logicaGrafica;
	}

	@Override
	public void actionPerformed(ActionEvent botonPulsado) {
		logicaGrafica.resetearInformacion();
	}
}
