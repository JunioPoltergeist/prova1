public class Microondas {
	private boolean estado;
	private boolean porta;

	public Microondas() {
		// TODO Auto-generated constructor stub
		this.estado = false;

	}


	public boolean isPorta(){
		return porta;
	}

	public void abrirPorta(){
		this.porta = true;
	}

	public void fecharPorta(){
		this.porta = false;

	}


	/**
	 * @return the estado
	 */
	public boolean isEstado() {
		return estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void liga() {
		if (porta == false)
		{
			this.estado = true;
		}
		else
		{
			System.out.println("Feche a porta antes de ligar o microondas");
		}

		
	}
	
	public void desliga() {
		this.estado = false;
	}
	boolean statusLigado = this.isEstado();
	boolean statusPorta = isPorta();
	public void imprime(){
		if (statusLigado == true)
		{
			System.out.println("O microondas está ligado.");
		}
		if(statusLigado != true) {
			System.out.println("O microondas está desligado.");
		}
		if(statusPorta == true){
			System.out.println("O microondas está aberto.");
		}
		if(statusPorta != true){
			System.out.println("O microondas está fechado.");
		}
	}

}