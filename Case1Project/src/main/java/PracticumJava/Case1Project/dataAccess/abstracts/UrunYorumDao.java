package PracticumJava.Case1Project.dataAccess.abstracts;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import PracticumJava.Case1Project.entities.concretes.UrunYorum;

public interface UrunYorumDao extends JpaRepository<UrunYorum, Integer> {

	List<UrunYorum> findByUrunId(int id);

	List<UrunYorum> findByKullaniciId(int id);

	List<UrunYorum> findByUrunIdAndYorumTarihiBetween(int id, Date date, Date date1);

	List<UrunYorum> findByKullaniciIdAndYorumTarihiBetween(int id, Date date, Date date1);

}
