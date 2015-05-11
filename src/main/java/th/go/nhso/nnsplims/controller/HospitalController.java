package th.go.nhso.nnsplims.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import th.go.nhso.nnsplims.jpa.dao.HospitalDao;
import th.go.nhso.nnsplims.jpa.model.Hospital;

@RestController
public class HospitalController {

	@Autowired
	private HospitalDao hospitalDao;

	@RequestMapping("/hospital")
	public Hospital hospital(@RequestParam(value = "id") String hospId) {
		return hospitalDao.getHospitalById(hospId);
	}
}
