package project.uninove.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.Font;

public class iframeCadUnidadeMedida extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtUnidademedidaid;
	private JTextField txtDescricao;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iframeCadUnidadeMedida frame = new iframeCadUnidadeMedida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public iframeCadUnidadeMedida() {
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("SansSerif", Font.PLAIN, 12));
		panel.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblUnidademedidaid = new JLabel("C\u00F3digo: ");
		lblUnidademedidaid.setAlignmentX(0.5f);
		lblUnidademedidaid.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblUnidademedidaid.setBounds(6, 12, 62, 16);
		panel_1.add(lblUnidademedidaid);
		
		txtUnidademedidaid = new JTextField();
		txtUnidademedidaid.setBounds(80, 6, 89, 28);
		panel_1.add(txtUnidademedidaid);
		txtUnidademedidaid.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o: ");
		lblDescricao.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDescricao.setBounds(6, 52, 62, 16);
		panel_1.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(80, 46, 352, 28);
		panel_1.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		table = new JTable();
		table.setBounds(6, 80, 426, 145);
		panel_1.add(table);

	}
}
