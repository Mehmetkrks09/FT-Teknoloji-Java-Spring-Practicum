package PracticumJava.Case1Project.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PracticumJava.Case1Project.business.abstracts.UrunService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.core.results.SuccessDataResult;
import PracticumJava.Case1Project.core.results.SuccessResult;
import PracticumJava.Case1Project.dataAccess.abstracts.UrunDao;
import PracticumJava.Case1Project.entities.concretes.Urun;

@Service
public class UrunManager implements UrunService {

	@Autowired
	private UrunDao urunDao;

	public UrunManager(UrunDao urunDao) {
		super();
		this.urunDao = urunDao;
	}

	@Override
	public Result add(Urun urun) {
		urunDao.save(urun);
		return new SuccessResult(urun.getAdi() + " Başarıyla Eklendi");
	}

	@Override
	public Result delete(int id) {

		Urun urun = new Urun();
		urun.setId(id);
		this.urunDao.delete(urun);
		return new SuccessResult("Ürün Silindi");
	}

	@Override
	public DataResult<List<Urun>> getAll() {

		return new SuccessDataResult<List<Urun>>(this.urunDao.findAll(), "Ürünler Bşarıyla Listelendi");
	}

	@Override
	public DataResult<List<Urun>> findBySonKullanmaTarihiLessThanEqual(LocalDate date) {
		return new SuccessDataResult<List<Urun>>(this.urunDao.findBySonKullanmaTarihiLessThanEqual(date));
	}

	@Override
	public DataResult<List<Urun>> findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull(LocalDate date) {

		return new SuccessDataResult<List<Urun>>(
				this.urunDao.findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull(date));
	}

}
