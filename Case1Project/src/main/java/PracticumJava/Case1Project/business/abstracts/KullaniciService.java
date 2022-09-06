package PracticumJava.Case1Project.business.abstracts;

import java.util.List;

import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.Kullanici;

public interface KullaniciService {

	Result add(Kullanici kullanici);

	Result delete(int id);

	DataResult<List<Kullanici>> getAll();
}
