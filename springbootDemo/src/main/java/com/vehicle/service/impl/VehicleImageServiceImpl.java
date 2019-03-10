package com.vehicle.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vehicle.mapper.VehicleImageMapper;
import com.vehicle.pojo.VehicleImage;
import com.vehicle.service.VehicleImageService;

@Service
@Transactional
public class VehicleImageServiceImpl implements VehicleImageService {

	@Autowired
	private VehicleImageMapper vehicleImageMapper;
	
	@Override
	public VehicleImage queryVehicleImageByUUID(String uuid) {
		return this.vehicleImageMapper.selectVehicleImage(uuid);
	}
//	@Override
//	public List<VehicleImage> queryVehicleImageByUUID(String uuid) {
//		return this.vehicleImageMapper.selectVehicleImage(uuid);
//	}

}
