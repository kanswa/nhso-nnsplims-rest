package th.go.nhso.nnsplims.jpa.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import th.go.nhso.nnsplims.jpa.dao.HospitalDao;
import th.go.nhso.nnsplims.jpa.model.Hospital;

@Repository
public class HospitalDaoImpl implements HospitalDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Transactional
	public Hospital getHospitalById(String hospId) {
		// return (Hospital) sessionFactory.getCurrentSession().get(
		// Hospital.class, hospId);

		return (Hospital) sessionFactory.getCurrentSession()
				.createQuery("from Hospital where hospitalId = ? ")
				.setParameter(0, hospId).uniqueResult();
	}

}
