import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Dimension;

public class PanelBotones extends JPanel{
	private static final String DIALOG = "Dialog";
	private static final long serialVersionUID = 1L;
	private JButton btnNuevo;
	private JButton btnBaja;
	private JButton btnAlta;
	public PanelBotones() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{25, 148, 49, 136, 0, 0};
		gridBagLayout.rowHeights = new int[]{26, 0, 45, 29, 19, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		btnNuevo = new JButton("Nuevo");
		btnNuevo.setName("Nuevo");
		btnNuevo.setMaximumSize(new Dimension(122, 33));
		btnNuevo.setBackground(new Color(255, 255, 153));
		btnNuevo.setToolTipText("Nuevo Libro");
		btnNuevo.setFont(new Font(DIALOG, Font.BOLD, 17));
		GridBagConstraints gbc_btnNuevo = new GridBagConstraints();
		gbc_btnNuevo.fill = GridBagConstraints.BOTH;
		gbc_btnNuevo.insets = new Insets(0, 0, 5, 5);
		gbc_btnNuevo.gridx = 1;
		gbc_btnNuevo.gridy = 1;
		add(btnNuevo, gbc_btnNuevo);
		
		btnBaja = new JButton("Baja");
		btnBaja.setName("Baja");
		btnBaja.setEnabled(false);
		btnBaja.setMaximumSize(new Dimension(122, 33));
		btnBaja.setBackground(new Color(255, 204, 102));
		btnBaja.setToolTipText("Dar de Baja");
		btnBaja.setFont(new Font(DIALOG, Font.BOLD, 17));
		GridBagConstraints gbc_btnBaja = new GridBagConstraints();
		gbc_btnBaja.fill = GridBagConstraints.BOTH;
		gbc_btnBaja.insets = new Insets(0, 0, 5, 5);
		gbc_btnBaja.gridx = 3;
		gbc_btnBaja.gridy = 1;
		add(btnBaja, gbc_btnBaja);
		
		btnAlta = new JButton("Alta");
		btnAlta.setName("Alta");
		btnAlta.setEnabled(false);
		btnAlta.setMaximumSize(new Dimension(122, 33));
		btnAlta.setBackground(new Color(153, 255, 153));
		btnAlta.setToolTipText("Alta Libro Nuevo");
		btnAlta.setFont(new Font(DIALOG, Font.BOLD, 17));
		GridBagConstraints gbc_btnAlta = new GridBagConstraints();
		gbc_btnAlta.fill = GridBagConstraints.BOTH;
		gbc_btnAlta.insets = new Insets(0, 0, 5, 5);
		gbc_btnAlta.gridx = 1;
		gbc_btnAlta.gridy = 3;
		add(btnAlta, gbc_btnAlta);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setName("Salir");
		btnSalir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//TODO fin programa
			}
		});
		btnSalir.setMaximumSize(new Dimension(122, 33));
		btnSalir.setBackground(new Color(255, 153, 153));
		btnSalir.setToolTipText("Salir del Programa");
		btnSalir.setFont(new Font(DIALOG, Font.BOLD, 17));
		GridBagConstraints gbc_btnSalir = new GridBagConstraints();
		gbc_btnSalir.fill = GridBagConstraints.BOTH;
		gbc_btnSalir.insets = new Insets(0, 0, 5, 5);
		gbc_btnSalir.gridx = 3;
		gbc_btnSalir.gridy = 3;
		add(btnSalir, gbc_btnSalir);
	}
	public JButton getBtnNuevo() {
		return btnNuevo;
	}
	public JButton getBtnBaja() {
		return btnBaja;
	}
	public JButton getBtnAlta() {
		return btnAlta;
	}
	
}
