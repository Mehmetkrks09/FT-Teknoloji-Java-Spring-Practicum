package PracticumJava.Case1Project.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PracticumJava.Case1Project.business.abstracts.KullaniciService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.Kullanici;


@RestController
@RequestMapping("/api/kullanici")
public class KullaniciController {

	@Autowired
	private KullaniciService kullaniciService;

	public KullaniciController(KullaniciService kullaniciService) {
		super();
		this.kullaniciService = kullaniciService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody Kullanici kullanici) {

		return this.kullaniciService.add(kullanici);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {

		return this.kullaniciService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<Kullanici>> getAll() {
		return this.kullaniciService.getAll();
	}

}
