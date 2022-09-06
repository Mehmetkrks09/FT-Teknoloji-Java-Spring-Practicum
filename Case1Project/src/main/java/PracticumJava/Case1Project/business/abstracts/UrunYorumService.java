package PracticumJava.Case1Project.business.abstracts;

import java.util.Date;
import java.util.List;

import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.UrunYorum;

public interface UrunYorumService {

	Result add(UrunYorum urunYorum);

	Result delete(int id);

	DataResult<List<UrunYorum>> getAll();

	DataResult<List<UrunYorum>> findByUrunId(int id);

	DataResult<List<UrunYorum>> findByKullaniciId(int id);

	DataResult<List<UrunYorum>> findByUrunIdAndYorumTarihiBetween(int id, Date date, Date date1);

	DataResult<List<UrunYorum>> findByKullaniciIdAndYorumTarihiBetween(int id, Date date, Date date1);

}
