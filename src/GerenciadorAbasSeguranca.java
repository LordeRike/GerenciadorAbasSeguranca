import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Color;

public class GerenciadorAbasSeguranca extends JFrame {
    public GerenciadorAbasSeguranca() {
        setTitle("Modulo de Segurança");
        setSize(350,200);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JPanel painelSuperior = new JPanel();
        painelSuperior.setLayout(new FlowLayout());

        painelSuperior.setBackground(Color.lightGray);

        JLabel lblAlarme = new JLabel("Alarme Residencial");
        JButton btnAtivar = new JButton ("ATIVAR");
        painelSuperior.add(lblAlarme);
        painelSuperior.add(btnAtivar);

        JPanel painelInferior = new JPanel();
        painelInferior.setLayout(new FlowLayout());

        painelInferior.setBackground(Color.lightGray);

        JLabel lblConf = new JLabel("Câmeras Internas");
        JButton btnConfig = new JButton ("Visualizar");
        painelInferior.add(lblConf);
        painelInferior.add(btnConfig);

        add(painelSuperior);
        add(painelInferior);

        btnAtivar.addActionListener(e -> lblAlarme.setText("Alarme Residencial: LIGADO"));
        btnConfig.addActionListener(e -> JOptionPane.showMessageDialog(this, "Acessando câmeras internas..."));
        
    }

    public static void main (String[] args) {
        //Instacia o objeto da nossa janela
        GerenciadorAbasSeguranca tela = new GerenciadorAbasSeguranca();
        // Torna a janela visível para o usário
        tela.setVisible(true);
    }
}
