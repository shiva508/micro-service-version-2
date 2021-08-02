package com.pool.controller.userprofile;

import java.util.ArrayList;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

	List<String> data = new ArrayList<String>();
	Userprofile  userProfile=null;

	@PostMapping("/save")
	public Userprofile saveUserProfile(@RequestBody Userprofile userprofile) {
		return userProfileService.saveUserProfile(userprofile);
	}

	@GetMapping(value="/userprofiles",produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
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

	@GetMapping("/publish/{data}")
	public String publishMessage(@PathVariable("data") String data) {
		return "PUBLISHED";
	}
	
}
