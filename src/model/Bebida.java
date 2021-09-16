package model;

public class Bebida extends Lanche {
	
	private short volumeML;
	private boolean refil;

	
	//construtor da classe
	public Bebida(short volumeML, boolean refil, String nomeLanche, String descricao) {
		super(nomeLanche, descricao);
		this.volumeML = volumeML;
		this.refil = refil;
		
	}

	//getters e setters
	public short getVolumeML() {
		return volumeML;
	}

	public void setVolumeML(short volumeML) {
		this.volumeML = volumeML;
	}

	public boolean isRefil() {
		return refil;
	}

	public void setRefil(boolean refil) {
		this.refil = refil;
	}

}
