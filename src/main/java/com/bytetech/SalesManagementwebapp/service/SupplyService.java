package com.bytetech.SalesManagementwebapp.service;

import com.bytetech.SalesManagementwebapp.Model.Supply;

import java.util.List;

public interface SupplyService {
    List<Supply> allSuppliers();
    Supply searchSupply(String email);
    void save(Supply supply);
    void update(String email, Supply supply);
    void deleteSupply(String email);
}
