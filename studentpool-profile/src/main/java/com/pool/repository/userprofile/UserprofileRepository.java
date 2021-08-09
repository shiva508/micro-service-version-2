package com.pool.repository.userprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pool.modal.Userprofile;

@Repository
public interface UserprofileRepository extends JpaRepository<Userprofile, Integer> {

	@Query("select count(UP) from Userprofile UP where UP.active = ?1")
	public Long findSuerProfileStatusCount(Boolean active);
}
