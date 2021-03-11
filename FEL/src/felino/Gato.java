package felino;
/**
 * 
 * @author marcos.francisco
 *
 */
public class Gato {
//atributos
	private String p�los;
	private char tamanho;
	private String ra�a;
	private char sexo;
	private float peso;
	private String cor;
	private int idade;
	private boolean vacina;
	private boolean pedigree;
	//m�todos de acesso
	
	public String getP�los() {
		return p�los;
	}

	public void setP�los(String p�los) {
		this.p�los = p�los;
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

    //m�todo construtor
	public Gato(String ra�a, String cor1, char sexo) {
		this.ra�a=ra�a;
		cor=cor1;
		this.sexo=sexo;
		
	}
	//m�todos de classes
	public void miar(){
		System.out.println("miau, miau, miau");
	}
	
	public void ro�ardono(){
		System.out.println("ro�ar, ro�ar, ro�ar...");
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