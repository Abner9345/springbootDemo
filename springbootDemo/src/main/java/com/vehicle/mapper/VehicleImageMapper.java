package com.vehicle.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.vehicle.pojo.VehicleImage;
@Mapper
public interface VehicleImageMapper {
//	List<VehicleImage> selectVehicleImage(String uuid);
	VehicleImage selectVehicleImage(String uuid);
}
