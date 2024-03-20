import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class Atleta {
    //Atributos
	private int codigo;
    private String nome;
    private String esporte;
    private double valorPatrocinio;
    
    //Metodos acessores
    
    public int getCodigo() {
		return codigo;
	}
    public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
    public void setNome(String nome) {
		this.nome = nome;
	}
    public String getNome() {
		return nome;
	}
 
    public double getValorPatrocinio() {
		return valorPatrocinio;
	}
    public void setValorPatrocinio(double valorPatrocinio) {
		this.valorPatrocinio = valorPatrocinio;
	}
    public String getEsporte() {
		return esporte;
	}
    public void setEsporte(String esporte) {
		this.esporte = esporte;
	}
    
    //METODOS > COMPORTAMENTO DO OBJETO
    
    public void inserirDados() {
    	this.codigo= Integer.parseInt(JOptionPane.showInputDialog("Código"));
    	this.nome= JOptionPane.showInputDialog("Nome");
    	this.esporte= JOptionPane.showInputDialog("Esporte");
    	this.valorPatrocinio= Double.parseDouble(JOptionPane.showInputDialog("Valor"));
    			 }
    public double atualizarValor(double taxa) {
    	this.valorPatrocinio += this.valorPatrocinio*taxa/100;
    	return this.valorPatrocinio;
    	}
    public void mostrar () {
    	String mensagem = "Objeto criado";
    	mensagem += "\nCódigo: " + this.codigo;
    	mensagem += "\nNome: " + this.nome;
    	mensagem += "\nEsporte: " + this.esporte;
    	NumberFormat formatar = DecimalFormat.getCurrencyInstance();
    	mensagem += "\nValor Patrocinio: " + formatar.format(this.valorPatrocinio);
    	JOptionPane.showMessageDialog(null, mensagem);
    	}
    
    
    
	}

