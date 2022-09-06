package PracticumJava.Case1Project.dataAccess.abstracts;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import PracticumJava.Case1Project.entities.concretes.Urun;

public interface UrunDao extends JpaRepository<Urun, Integer> {

	// List<Urun> findByurunYorum_Id(int id);
	List<Urun> findBySonKullanmaTarihiLessThanEqual(LocalDate date);

	List<Urun> findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull(LocalDate date);

}
