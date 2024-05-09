package spring.training.artifacts.db.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.training.artifacts.db.VendorInterf;
import spring.training.artifacts.entity.Vendor;

@Component
public class VendorImpl {
	@Autowired
	VendorInterf vendorRepo;

	
	public void saveVendor(Vendor v)
	{
		vendorRepo.save(v);
	}
}
