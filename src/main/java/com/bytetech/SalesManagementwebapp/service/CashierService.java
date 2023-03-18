package com.bytetech.SalesManagementwebapp.service;

import com.bytetech.SalesManagementwebapp.Model.Cashier;

import java.util.List;

public interface CashierService {
    Cashier saveCashier(Cashier cashier);
   List < Cashier> findAllCashier();
    Cashier searchCashier(String email);
    Cashier updateCashier(String email, Cashier cashier);
    String deleteCashier(String email);
}
