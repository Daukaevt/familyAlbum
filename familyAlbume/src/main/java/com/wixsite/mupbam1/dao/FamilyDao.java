package com.wixsite.mupbam1.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.stereotype.Component;

import com.wixsite.mupbam1.models.FamilyMember;

import hibernateUtil.HibernateUtil;

@Component
public class FamilyDao {

	public List<FamilyMember> getIndex() {
		List<FamilyMember> membersList;
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		membersList = session.createQuery("from FamilyMember", FamilyMember.class).getResultList();
		session.getTransaction().commit();
		return membersList;
	}
	
	

}
