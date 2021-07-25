package com.pool.controller.userprofile;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.pool.form.response.CommonResponse;
import com.pool.modal.Userprofile;
import com.pool.service.userprofile.UserProfileService;

@RestController
@RequestMapping(value = "/userprofile")
public class UserProfileController {

	@Autowired
	private UserProfileService userProfileService;

	@PostMapping("/save")
	public Userprofile saveUserProfile(@RequestBody Userprofile userprofile) {
		return userProfileService.saveUserProfile(userprofile);
	}

	@GetMapping("/userprofiles")
	public List<Userprofile> getUserProfiles() {
		return userProfileService.getUserProfiles();
	}

	@GetMapping("/getuserprofile/{userId}")
	public Userprofile getUserProfileByUserId(@PathVariable("userId") Integer userId) {
		return userProfileService.getUserProfileByUserId(userId);
	}

	@DeleteMapping("/deleteuserprofile/{userId}")
	public CommonResponse deleteUserProfileByUserId(@PathVariable("userId") Integer userId) {
		return userProfileService.deleteUserProfileByUserId(userId);
	}

	@PutMapping("/update")
	public Userprofile updateUserprofile(@RequestBody Userprofile userprofile) {
		return userProfileService.updateUserprofile(userprofile);
	}
}
