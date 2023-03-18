package com.bytetech.SalesManagementwebapp.repository;

import com.bytetech.SalesManagementwebapp.Model.Cashier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CashierRepository extends JpaRepository<Cashier, Long> {
    Cashier findByEmail(String email);
}
