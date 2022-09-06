package PracticumJava.Case1Project.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "urun")

public class Urun {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;

	@NotNull
	@Column(name = "adi")
	private String Adi;

	@NotNull
	@Column(name = "fiyat")
	private double Fiyat;

	@NotNull
	@Column(name = "son_kullanma_tarihi")
	private LocalDate sonKullanmaTarihi;

}
