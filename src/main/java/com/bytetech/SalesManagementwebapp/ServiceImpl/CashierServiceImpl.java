package com.bytetech.SalesManagementwebapp.ServiceImpl;

import com.bytetech.SalesManagementwebapp.Model.Cashier;
import com.bytetech.SalesManagementwebapp.repository.CashierRepository;
import com.bytetech.SalesManagementwebapp.service.CashierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CashierServiceImpl implements CashierService {
    private CashierRepository cashierRepository;


    @Autowired
    public CashierServiceImpl(CashierRepository cashierRepository) {
        this.cashierRepository = cashierRepository;
    }

    @Override
    public Cashier saveCashier(Cashier cashier) {
        return cashierRepository.save(cashier);
    }

    @Override
    public List<Cashier> findAllCashier() {
        return cashierRepository.findAll();
    }

    @Override
    public Cashier searchCashier(String email) {
        return cashierRepository.findByEmail(email);
    }

    @Override
    public Cashier updateCashier(String email, Cashier cashier) {
        Cashier existing = cashierRepository.findByEmail(email);
        if (existing != null){
            existing.setName(cashier.getName());
            existing.setEmail(cashier.getEmail());
            existing.setPhone(cashier.getPhone());

            return existing;
        }
        return null;
    }

    @Override
    public String deleteCashier(String email) {
        cashierRepository.deleteById((cashierRepository.findByEmail(email).getId()));
        return "deleted successfully";
    }
}
