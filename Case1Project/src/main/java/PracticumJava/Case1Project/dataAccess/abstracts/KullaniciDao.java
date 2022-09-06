package PracticumJava.Case1Project.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository; 

import PracticumJava.Case1Project.entities.concretes.Kullanici;


public interface KullaniciDao extends JpaRepository<Kullanici,Integer> {

	
	
}
