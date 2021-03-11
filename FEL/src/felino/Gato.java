package felino;
/**
 * 
 * @author marcos.francisco
 *
 */
public class Gato {
//atributos
	private String pêlos;
	private char tamanho;
	private String raça;
	private char sexo;
	private float peso;
	private String cor;
	private int idade;
	private boolean vacina;
	private boolean pedigree;
	//métodos de acesso
	
	public String getPêlos() {
		return pêlos;
	}

	public void setPêlos(String pêlos) {
		this.pêlos = pêlos;
	}

	public char getTamanho() {
		return tamanho;
	}

	public void setTamanho(char tamanho) {
		this.tamanho = tamanho;
	}

	public void setPeso(float p) {
		peso = p;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isVacina() {
		return vacina;
	}

	public void setVacina(boolean vacina) {
		this.vacina = vacina;
	}

	public boolean isPedigree() {
		return pedigree;
	}

	public void setPedigree(boolean pedigree) {
		this.pedigree = pedigree;
	}

    //método construtor
	public Gato(String raça, String cor1, char sexo) {
		this.raça=raça;
		cor=cor1;
		this.sexo=sexo;
		
	}
	//métodos de classes
	public void miar(){
		System.out.println("miau, miau, miau");
	}
	
	public void roçardono(){
		System.out.println("roçar, roçar, roçar...");
	}
	
	public boolean sentar(boolean obd){
		if (obd) {
			System.out.println("sentado");
		}
		else
		{
			System.out.println("tudo menos sentado");
		}
		
		return obd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato o1=new Gato("persa","amarelo",'F');
		o1.setIdade(20);
		Gato o2=new Gato("siames","branco",'M');
		o2.miar();
		Gato o3=new Gato("angora","preto",'F');
		o3.sentar(false);
		Gato o4=new Gato("thai","marron",'F');
		o4.sentar(true);

	}
	
}	