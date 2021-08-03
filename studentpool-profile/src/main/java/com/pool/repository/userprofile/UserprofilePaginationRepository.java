package com.pool.repository.userprofile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.pool.modal.Userprofile;

@Repository
public interface UserprofilePaginationRepository extends PagingAndSortingRepository<Userprofile, Integer> {

}
