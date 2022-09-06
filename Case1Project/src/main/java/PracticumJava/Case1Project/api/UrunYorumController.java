package PracticumJava.Case1Project.api;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import PracticumJava.Case1Project.business.abstracts.UrunYorumService;
import PracticumJava.Case1Project.core.results.DataResult;
import PracticumJava.Case1Project.core.results.Result;
import PracticumJava.Case1Project.entities.concretes.UrunYorum;


@RestController
@RequestMapping("/api/urunYorum")
public class UrunYorumController {

	private UrunYorumService urunYorumService;

	@Autowired
	public UrunYorumController(UrunYorumService urunYorumService) {
		super();
		this.urunYorumService = urunYorumService;
	}

	@PostMapping("/add")
	public Result add(@RequestBody UrunYorum urunYorum) {

		return this.urunYorumService.add(urunYorum);
	}

	@DeleteMapping("delete")
	public Result delete(@RequestParam int id) {

		return this.urunYorumService.delete(id);
	}

	@GetMapping("/getall")
	public DataResult<List<UrunYorum>> getAll() {
		return this.urunYorumService.getAll();
	}
    
	//Ürüne Yapılan Yorumlar
	@GetMapping("/findByUrunId")
	public DataResult<List<UrunYorum>> findByUrunId(@RequestParam int id) {
		return this.urunYorumService.getAll();
	}

	//kullanıcının yaptığı Yorumlar
	@GetMapping("/findByKullaniciId")
	public DataResult<List<UrunYorum>> findByKullaniciId(@RequestParam int id) {
		return this.urunYorumService.getAll();
	}

	//Belirli Tarih Aralığında Ürüne yapılan Yorumlar 
	@GetMapping("/findByUrunIdAndYorumTarihiBetween")
	public DataResult<List<UrunYorum>> findByUrunIdAndYorumTarihiBetween(@RequestParam int urunId,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date firstDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date SecondDate) {
		return this.urunYorumService.findByUrunIdAndYorumTarihiBetween(urunId, firstDate, SecondDate);
	}

	//kullanıcının belirli Tarih Aralığında Yaptığı Yorumlar
	@GetMapping("/findByKullaniciIdAndYorumTarihiBetween")
	public DataResult<List<UrunYorum>> findByKullaniciIdAndYorumTarihiBetween(@RequestParam int KullaniciId,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date firstDate,
			@RequestParam @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) Date SecondDate) {

		return this.urunYorumService.findByKullaniciIdAndYorumTarihiBetween(KullaniciId, firstDate, SecondDate);

	}

}
