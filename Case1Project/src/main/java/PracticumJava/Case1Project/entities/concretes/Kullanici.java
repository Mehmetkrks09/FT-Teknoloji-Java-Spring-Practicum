package PracticumJava.Case1Project.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "kullanici")

public class Kullanici {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;

	@NotNull
	@Max(50)
	@Column(name = "adi")
	private String Adi;

	@Max(50)
	@NotNull
	@Column(name = "soyadi")
	private String Soyadi;

	@Max(50)
	@NotNull
	@Column(name = "email")
	private String Email;

	@Max(15)
	@NotNull
	@Column(name = "telefon")
	private String telefon;

}
