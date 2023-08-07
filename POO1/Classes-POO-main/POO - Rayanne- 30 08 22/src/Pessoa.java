
public class Pessoa<T,U> {
	private String nome;
	private T cpf;
	private U carteiraIdentidade;
	
	public Pessoa(String name, T pf, U rg) {
		nome = name;
		cpf = pf;
		carteiraIdentidade = rg;
	}
	
	public String getNome() { 
		return nome; 
	}
	
	public void setNome(String name) { 
		nome = name; 
	}
	
	public T getCpf() { 
	    return cpf;
	}
	
	public void setCpf(T pf) { 
		cpf = pf; 
	}
	
	public U getCarteiraIdentidade() { 
	    return carteiraIdentidade;
	}
	
	public void setCarteiraIdentidade(U rg) { 
		carteiraIdentidade = rg; 
	}
	
	
	@Override
	public String toString() {
	    return "Pessoa {" + "Nome= " + nome + ", CPF= " + cpf + ", RG= " + carteiraIdentidade + "}";
	} 
}
