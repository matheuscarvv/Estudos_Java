

// N�o pode instanciar dessa classe , pq � abstrata.
public abstract  class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	
	public abstract double getBonificacao(); //m�todo abstrato, m�todo sem corpo, h� implementa��o.
		
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}