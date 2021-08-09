package com.pool.actuator;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.actuate.info.Info.Builder;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import com.pool.service.userprofile.UserProfileService;

@Component
public class UserStatusContributor implements InfoContributor {

	@Autowired
	private UserProfileService userProfileService;

	@Override
	public void contribute(Builder builder) {
		Map<String, Long> map = new HashMap<>();
		map.put("ACTIVE_ACCOUNTS_COUNT", userProfileService.findSuerProfileStatusCount(true));
		map.put("IN_ACTIVE_ACCOUNTS_COUNT", userProfileService.findSuerProfileStatusCount(true));
		builder.withDetail("USER_ATATUS", map);
	}

}
