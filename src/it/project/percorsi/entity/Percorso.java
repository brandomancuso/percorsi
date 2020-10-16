package it.project.percorsi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mezzi")
public class Percorso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private Integer id;
	
	@Column(name="idutente")
	private String idutente;
	
	@Column(name="idmezzo")
	private String idmezzo;
	
	@Column(name="puntoPartenza")
	private String puntoPartenza;

	@Column(name="puntoArrivo")
	private String puntoArrivo;

	@Column(name="dtimePartenza")
	private String dtimePartenza;
	
	@Column(name="dtimeArrivo")
	private String dtimeArrivo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIdutente() {
		return idutente;
	}

	public void setIdutente(String idutente) {
		this.idutente = idutente;
	}

	public String getIdmezzo() {
		return idmezzo;
	}

	public void setIdmezzo(String idmezzo) {
		this.idmezzo = idmezzo;
	}

	public String getPuntoPartenza() {
		return puntoPartenza;
	}

	public void setPuntoPartenza(String puntoPartenza) {
		this.puntoPartenza = puntoPartenza;
	}

	public String getPuntoArrivo() {
		return puntoArrivo;
	}

	public void setPuntoArrivo(String puntoArrivo) {
		this.puntoArrivo = puntoArrivo;
	}

	public String getDtimePartenza() {
		return dtimePartenza;
	}

	public void setDtimePartenza(String dtimePartenza) {
		this.dtimePartenza = dtimePartenza;
	}

	public String getDtimeArrivo() {
		return dtimeArrivo;
	}

	public void setDtimeArrivo(String dtimeArrivo) {
		this.dtimeArrivo = dtimeArrivo;
	}
	
	public String toString() {

		StringBuilder builder = new StringBuilder("[");
		builder.append("Utente : ").append(this.idutente)
			.append(" - Mezzo : ").append(this.idmezzo)
			.append(" - Punto Partenza : ").append(this.puntoPartenza)
			.append(" - Punto Arrivo : ").append(this.puntoArrivo)
			.append(" - DT Partenza : ").append(this.dtimePartenza)
			.append(" - DT Arrivo : ").append(this.dtimeArrivo)
			.append("]");
		return builder.toString();
	}

}
