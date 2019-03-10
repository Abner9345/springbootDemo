package com.vehicle.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;
import com.vehicle.pojo.VehicleImage;
import com.vehicle.service.impl.VehicleImageServiceImpl;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

/**
  *车辆信息控制类
 * @author Kingde
 *
 */
@Api(description = "查询图片信息")
@RestController
@RequestMapping("/")
public class VehicleImageController {
	
	private final static Logger logger = Logger.getLogger(VehicleImageController.class);
	@Autowired
	private VehicleImageServiceImpl vehicleImageServiceImpl;
	
	@ApiOperation(value = "图片ID" ,  notes="通过图片ID获取图片信息")
	@RequestMapping(path = "/rest/fuxiaoyi/queryVehicleImage", method = RequestMethod.GET, produces = "application/json")
	public String queryVehicleImageById(@RequestParam(value="uuid", required=false) String uuid) {
		logger.error("uuid::" + uuid);
		JSONObject jsonObject = new JSONObject();
		VehicleImage vehicleImage = vehicleImageServiceImpl.queryVehicleImageByUUID(uuid);
		jsonObject.put("data", JSONObject.parse(JSONObject.toJSONString(vehicleImage)));
		return jsonObject.toString();
	}
}
