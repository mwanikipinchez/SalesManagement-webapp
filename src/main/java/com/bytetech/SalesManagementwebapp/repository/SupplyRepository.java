package com.bytetech.SalesManagementwebapp.repository;

import com.bytetech.SalesManagementwebapp.Model.Supply;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SupplyRepository extends JpaRepository<Supply, Long > {

    Supply findByEmail(String email);
}
