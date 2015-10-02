package project.uninove.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.FlowLayout;

public class iframeCadTipoPessoa extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtTipopessoaid;
	private JTextField txtDescricao;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iframeCadTipoPessoa frame = new iframeCadTipoPessoa();
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
	public iframeCadTipoPessoa() {
		setClosable(true);
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		getContentPane().add(panel, BorderLayout.SOUTH);
		
		JButton btnSalvar = new JButton("Salvar");
		panel.add(btnSalvar);
		
		JButton btnExcluir = new JButton("Excluir");
		panel.add(btnExcluir);
		
		JButton btnCancelar = new JButton("Cancelar");
		panel.add(btnCancelar);
		
		JPanel panel_1 = new JPanel();
		getContentPane().add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lblTipopessoaid = new JLabel("C\u00F3digo: ");
		lblTipopessoaid.setBounds(10, 17, 62, 16);
		panel_1.add(lblTipopessoaid);
		
		txtTipopessoaid = new JTextField();
		txtTipopessoaid.setBounds(82, 11, 86, 28);
		panel_1.add(txtTipopessoaid);
		txtTipopessoaid.setColumns(10);
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o: ");
		lblDescricao.setBounds(10, 56, 62, 16);
		panel_1.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(82, 50, 346, 28);
		panel_1.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 89, 418, 131);
		panel_1.add(table);

	}

}
