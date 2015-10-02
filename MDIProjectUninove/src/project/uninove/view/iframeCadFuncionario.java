package project.uninove.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JCheckBox;
import java.awt.FlowLayout;

public class iframeCadFuncionario extends JInternalFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtPessoaid;
	private JTextField txtNomecompleto;
	private JTextField txtEmail;
	private JTextField txtDsaddress;
	private JTextField txtDsaddress_1;
	private JTextField txtDsaddress_2;
	private JTextField txtDsaddress_3;
	private JTextField txtNrnumero;
	private JTextField txtDsbairro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					iframeCadFuncionario frame = new iframeCadFuncionario();
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
	public iframeCadFuncionario() {
		setBounds(100, 100, 610, 580);
		
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
		
		JLabel lblPessoaid = new JLabel("C\u00F3digo: ");
		lblPessoaid.setBounds(355, 14, 97, 16);
		panel_1.add(lblPessoaid);
		
		txtPessoaid = new JTextField();
		txtPessoaid.setText("PessoaId");
		txtPessoaid.setBounds(464, 8, 122, 28);
		panel_1.add(txtPessoaid);
		txtPessoaid.setColumns(10);
		
		JLabel lblTipopessoaid = new JLabel("Tipo: ");
		lblTipopessoaid.setBounds(10, 14, 97, 16);
		panel_1.add(lblTipopessoaid);
		
		JComboBox<String> cmbTipoPessoaId = new JComboBox<String>();
		cmbTipoPessoaId.setBounds(119, 9, 178, 26);
		panel_1.add(cmbTipoPessoaId);
		
		JLabel lblNomecompleto = new JLabel("Nome Completo: ");
		lblNomecompleto.setBounds(10, 88, 97, 16);
		panel_1.add(lblNomecompleto);
		
		txtNomecompleto = new JTextField();
		txtNomecompleto.setText("NomeCompleto");
		txtNomecompleto.setBounds(119, 82, 467, 28);
		panel_1.add(txtNomecompleto);
		txtNomecompleto.setColumns(10);
		
		JLabel lblNrcpf = new JLabel("CPF: ");
		lblNrcpf.setBounds(10, 49, 97, 16);
		panel_1.add(lblNrcpf);
		
		JFormattedTextField frmtdtxtfldNrcpf = new JFormattedTextField();
		frmtdtxtfldNrcpf.setText("NrCPF");
		frmtdtxtfldNrcpf.setBounds(119, 43, 178, 28);
		panel_1.add(frmtdtxtfldNrcpf);
		
		JLabel lblNrrg = new JLabel("RG: ");
		lblNrrg.setBounds(299, 47, 97, 16);
		panel_1.add(lblNrrg);
		
		JFormattedTextField frmtdtxtfldNrrg = new JFormattedTextField();
		frmtdtxtfldNrrg.setText("NrRG");
		frmtdtxtfldNrrg.setBounds(408, 42, 178, 28);
		panel_1.add(frmtdtxtfldNrrg);
		
		JLabel lblEmail = new JLabel("Email: ");
		lblEmail.setBounds(10, 129, 97, 16);
		panel_1.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setText("Email");
		txtEmail.setBounds(119, 123, 467, 28);
		panel_1.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblTelefone = new JLabel("Telefone: ");
		lblTelefone.setBounds(10, 170, 97, 16);
		panel_1.add(lblTelefone);
		
		JFormattedTextField frmtdtxtfldTelefone = new JFormattedTextField();
		frmtdtxtfldTelefone.setText("Telefone");
		frmtdtxtfldTelefone.setBounds(119, 164, 178, 28);
		panel_1.add(frmtdtxtfldTelefone);
		
		JCheckBox chckbxStativo = new JCheckBox("Ativo (Sim/N\u00E3o)");
		chckbxStativo.setBounds(119, 486, 106, 18);
		panel_1.add(chckbxStativo);
		
		JLabel lblDsaddress = new JLabel("Logradouro: ");
		lblDsaddress.setBounds(10, 252, 97, 16);
		panel_1.add(lblDsaddress);
		
		txtDsaddress = new JTextField();
		txtDsaddress.setText("DsAddress1");
		txtDsaddress.setBounds(119, 246, 231, 28);
		panel_1.add(txtDsaddress);
		txtDsaddress.setColumns(10);
		
		JLabel lblDsaddress_1 = new JLabel("Complemento 1: ");
		lblDsaddress_1.setBounds(10, 293, 97, 16);
		panel_1.add(lblDsaddress_1);
		
		txtDsaddress_1 = new JTextField();
		txtDsaddress_1.setText("DsAddress2");
		txtDsaddress_1.setBounds(119, 287, 467, 28);
		panel_1.add(txtDsaddress_1);
		txtDsaddress_1.setColumns(10);
		
		JLabel lblDsaddress_2 = new JLabel("Complemento 2: ");
		lblDsaddress_2.setBounds(10, 330, 97, 16);
		panel_1.add(lblDsaddress_2);
		
		txtDsaddress_2 = new JTextField();
		txtDsaddress_2.setText("DsAddress3");
		txtDsaddress_2.setBounds(119, 324, 467, 28);
		panel_1.add(txtDsaddress_2);
		txtDsaddress_2.setColumns(10);
		
		JLabel lblDsaddress_3 = new JLabel("Complemento 3: ");
		lblDsaddress_3.setBounds(10, 371, 97, 16);
		panel_1.add(lblDsaddress_3);
		
		txtDsaddress_3 = new JTextField();
		txtDsaddress_3.setText("DsAddress4");
		txtDsaddress_3.setBounds(119, 365, 467, 28);
		panel_1.add(txtDsaddress_3);
		txtDsaddress_3.setColumns(10);
		
		JLabel lblDscep = new JLabel("CEP: ");
		lblDscep.setBounds(10, 211, 97, 16);
		panel_1.add(lblDscep);
		
		JFormattedTextField frmtdtxtfldDscep = new JFormattedTextField();
		frmtdtxtfldDscep.setText("DsCEP");
		frmtdtxtfldDscep.setBounds(119, 205, 122, 28);
		panel_1.add(frmtdtxtfldDscep);
		
		JLabel lblCidadeid = new JLabel("Cidade: ");
		lblCidadeid.setBounds(10, 452, 97, 16);
		panel_1.add(lblCidadeid);
		
		JComboBox<String> cmbCidadeId = new JComboBox<String>();
		cmbCidadeId.setBounds(119, 447, 178, 26);
		panel_1.add(cmbCidadeId);
		
		JLabel lblEstadoid = new JLabel("Estado: ");
		lblEstadoid.setBounds(309, 452, 97, 16);
		panel_1.add(lblEstadoid);
		
		JComboBox<String> cmbEstadoId = new JComboBox<String>();
		cmbEstadoId.setBounds(408, 447, 178, 26);
		panel_1.add(cmbEstadoId);
		
		JLabel lblNrnumero = new JLabel("N\u00FAmero: ");
		lblNrnumero.setBounds(355, 252, 97, 16);
		panel_1.add(lblNrnumero);
		
		txtNrnumero = new JTextField();
		txtNrnumero.setText("NrNumero");
		txtNrnumero.setBounds(464, 246, 122, 28);
		panel_1.add(txtNrnumero);
		txtNrnumero.setColumns(10);
		
		JLabel lblDsbairro = new JLabel("Bairro: ");
		lblDsbairro.setBounds(10, 412, 97, 16);
		panel_1.add(lblDsbairro);
		
		txtDsbairro = new JTextField();
		txtDsbairro.setText("DsBairro");
		txtDsbairro.setBounds(119, 406, 231, 28);
		panel_1.add(txtDsbairro);
		txtDsbairro.setColumns(10);

	}
}
