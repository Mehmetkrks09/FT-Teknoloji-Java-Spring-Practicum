package PracticumJava.Case1Project.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PracticumJava.Case1Project.business.abstracts.KullaniciService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.core.results.SuccessDataResult;
import PracticumJava.Case1Project.core.results.SuccessResult;
import PracticumJava.Case1Project.dataAccess.abstracts.KullaniciDao;
import PracticumJava.Case1Project.entities.concretes.Kullanici;

@Service
public class KullaniciManager implements KullaniciService {

	@Autowired
	private KullaniciDao kullaniciDao;

	public KullaniciManager(KullaniciDao kullaniciDao) {
		super();
		this.kullaniciDao = kullaniciDao;
	}

	@Override
	public Result add(Kullanici kullanici) {

		kullaniciDao.save(kullanici);
		return new SuccessResult("Kullanici Eklendi");
	}

	@Override
	public Result delete(int id) {

		Kullanici kullanici = new Kullanici();
		kullanici.setId(id);
		this.kullaniciDao.delete(kullanici);
		return new SuccessResult("Kullanıcı Silindi");
	}

	@Override
	public DataResult<List<Kullanici>> getAll() {

		return new SuccessDataResult<List<Kullanici>>(kullaniciDao.findAll(), "Başarılı Şekilde Listelendi");
	}

}
