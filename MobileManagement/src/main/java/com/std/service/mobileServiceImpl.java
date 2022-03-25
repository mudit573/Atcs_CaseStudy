package com.std.service;

import java.util.Optional;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.entity.Mobile;
import com.mobile.dao.*;


@Service
@Transactional
public class mobileServiceImpl implements MobileService {

	@Autowired
	mobileDao dao;
	
	@Override
	public Mobile addmobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}

	@Override
	public Mobile updatemobile(Mobile mobile) {
		// TODO Auto-generated method stub
		return dao.save(mobile);
	}

	@Override
	public void deletemobile(int mobileId) {
		// TODO Auto-generated method stub
		dao.deleteById(mobileId);
	}

	@Override
	public Optional<Mobile> getmobile(int mobileId) {
		// TODO Auto-generated method stub
		return dao.findById(mobileId);
	}

	@Override
	public Iterable<Mobile> getAllmobiles() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

}
