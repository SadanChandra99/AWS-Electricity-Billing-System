package com.electricity.bill.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.electricity.bill.entity.bill;

public interface billRepository extends JpaRepository<bill,Long>{

}
