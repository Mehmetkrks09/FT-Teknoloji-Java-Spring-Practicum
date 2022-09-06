package PracticumJava.Case1Project.entities.concretes;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "urun_yorum")

public class UrunYorum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int Id;

	@Max(500)
	@NotNull
	@Column(name = "yorum")
	private String Yorum;

	@NotNull
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "yorum_tarihi")
	private Date yorumTarihi;

	@Column(name = "urun_id")
	private int urunId;

	@Column(name = "kullanici_id")
	private int kullaniciId;

}
