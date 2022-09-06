package PracticumJava.Case1Project.business.abstracts;

import java.time.LocalDate;
import java.util.List;

import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.Urun;

public interface UrunService {

	Result add(Urun urun);

	Result delete(int id);

	DataResult<List<Urun>> getAll();

	DataResult<List<Urun>> findBySonKullanmaTarihiLessThanEqual(LocalDate date);

	DataResult<List<Urun>> findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull(LocalDate date);

}
