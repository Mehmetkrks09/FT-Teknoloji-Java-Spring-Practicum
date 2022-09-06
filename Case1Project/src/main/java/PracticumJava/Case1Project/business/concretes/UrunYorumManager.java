package PracticumJava.Case1Project.business.concretes;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PracticumJava.Case1Project.business.abstracts.UrunYorumService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.core.results.SuccessDataResult;
import PracticumJava.Case1Project.core.results.SuccessResult;
import PracticumJava.Case1Project.dataAccess.abstracts.UrunYorumDao;
import PracticumJava.Case1Project.entities.concretes.UrunYorum;

@Service
public class UrunYorumManager implements UrunYorumService {

	@Autowired
	private UrunYorumDao urunYorumDao;

	public UrunYorumManager(UrunYorumDao urunYorumDao) {
		super();
		this.urunYorumDao = urunYorumDao;
	}

	@Override
	public Result add(UrunYorum urunYorum) {

		urunYorumDao.save(urunYorum);
		return new SuccessResult(urunYorum.getYorum() + " Eklendi");
	}

	@Override
	public Result delete(int id) {

		UrunYorum urunYorum = new UrunYorum();
		urunYorum.setId(id);
		this.urunYorumDao.delete(urunYorum);
		return new SuccessResult("Ürün Silindi");
	}

	@Override
	public DataResult<List<UrunYorum>> getAll() {

		return new SuccessDataResult<List<UrunYorum>>(this.urunYorumDao.findAll(), "Başarılı Şekilde Listelendi");
	}

	@Override
	public DataResult<List<UrunYorum>> findByUrunId(int id) {

		return new SuccessDataResult<List<UrunYorum>>(this.urunYorumDao.findByUrunId(id), "Başarıyla Listelendi");
	}

	@Override
	public DataResult<List<UrunYorum>> findByKullaniciId(int id) {

		return new SuccessDataResult<List<UrunYorum>>(this.urunYorumDao.findByKullaniciId(id),
				"Başarılı Şekilde Listelendi");
	}

	@Override
	public DataResult<List<UrunYorum>> findByUrunIdAndYorumTarihiBetween(int id, Date date, Date date1) {

		return new SuccessDataResult<List<UrunYorum>>(
				this.urunYorumDao.findByUrunIdAndYorumTarihiBetween(id, date, date1));
	}

	@Override
	public DataResult<List<UrunYorum>> findByKullaniciIdAndYorumTarihiBetween(int id, Date date, Date date1) {
		return new SuccessDataResult<List<UrunYorum>>(
				this.urunYorumDao.findByKullaniciIdAndYorumTarihiBetween(id, date, date1));
	}

}
