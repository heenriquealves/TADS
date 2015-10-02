package project.uninove.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import java.awt.Font;
import java.awt.FlowLayout;

public class iframeCadCategoria extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtDescricao;
	private JTable table;
	private JTextField txtCategoriaid;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iframeCadCategoria frame = new iframeCadCategoria();
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
	public iframeCadCategoria() {
		setClosable(true);
		setFont(new Font("SansSerif", Font.PLAIN, 12));
		setBounds(100, 100, 450, 300);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		panel.setFont(new Font("SansSerif", Font.PLAIN, 11));
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
		
		JLabel lblDescricao = new JLabel("Descri\u00E7\u00E3o: ");
		lblDescricao.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblDescricao.setBounds(10, 56, 62, 16);
		panel_1.add(lblDescricao);
		
		txtDescricao = new JTextField();
		txtDescricao.setBounds(82, 50, 346, 28);
		panel_1.add(txtDescricao);
		txtDescricao.setColumns(10);
		
		table = new JTable();
		table.setBounds(10, 89, 418, 131);
		panel_1.add(table);
		
		txtCategoriaid = new JTextField();
		txtCategoriaid.setBounds(82, 11, 97, 28);
		panel_1.add(txtCategoriaid);
		txtCategoriaid.setColumns(10);
		
		JLabel lblCategoriaid = new JLabel("Categoria: ");
		lblCategoriaid.setFont(new Font("SansSerif", Font.PLAIN, 12));
		lblCategoriaid.setBounds(10, 17, 60, 16);
		panel_1.add(lblCategoriaid);

	}
}
