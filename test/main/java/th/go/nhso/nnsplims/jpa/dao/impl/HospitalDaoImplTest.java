package th.go.nhso.nnsplims.jpa.dao.impl;

import java.util.Arrays;

import junit.framework.TestCase;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import th.go.nhso.nnsplims.config.ApplicationContextConfig;
import th.go.nhso.nnsplims.jpa.dao.HospitalDao;
import th.go.nhso.nnsplims.jpa.model.Hospital;

public class HospitalDaoImplTest extends TestCase {

	public static void main(String args[]) {
		ApplicationContext ctx = SpringApplication
				.run(ApplicationContextConfig.class);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);

		HospitalDao hospitalDao = ctx.getBean(HospitalDao.class);
		Hospital h = hospitalDao.getHospitalById("401H102");
		System.out.println(h.toString());
	}

}
