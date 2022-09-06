package PracticumJava.Case1Project.api;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PracticumJava.Case1Project.business.abstracts.UrunService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.Urun;


@RestController
@RequestMapping("/api/urun")
public class UrunController {

	private UrunService urunService;

	@Autowired
	public UrunController(UrunService urunService) {
		super();
		this.urunService = urunService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Urun urun) {

		return this.urunService.add(urun);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {

		return this.urunService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Urun>> getAll() {
		return this.urunService.getAll();
	}

	//Son Kullanma Tarihi geçmemiş Olan Ürünler 
	@GetMapping("/findBySonKullanmaTarihiLessThanEqual")
	public DataResult<List<Urun>> findBySonKullanmaTarihiLessThanEqual() {
		return this.urunService.findBySonKullanmaTarihiLessThanEqual(LocalDate.now());
	}

	//Son Kullanma Tarihi Geçmiş Olan Ürünler
	@GetMapping("/findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull")
	public DataResult<List<Urun>> findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull() {
		return this.urunService.findBySonKullanmaTarihiGreaterThanOrSonKullanmaTarihiIsNull(LocalDate.now());
	}
}
