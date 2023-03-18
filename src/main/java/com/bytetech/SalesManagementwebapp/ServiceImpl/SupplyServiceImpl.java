package com.bytetech.SalesManagementwebapp.ServiceImpl;

import com.bytetech.SalesManagementwebapp.Model.Supply;
import com.bytetech.SalesManagementwebapp.repository.SupplyRepository;
import com.bytetech.SalesManagementwebapp.service.SupplyService;

import java.util.List;

public class SupplyServiceImpl implements SupplyService {

    private SupplyRepository supplyRepository;

    public SupplyServiceImpl(SupplyRepository supplyRepository) {
        this.supplyRepository = supplyRepository;
    }

    @Override
    public List<Supply> allSuppliers() {
        return supplyRepository.findAll();
    }

    @Override
    public Supply searchSupply(String email) {
        return supplyRepository.findByEmail(email);
    }

    @Override
    public void save(Supply supply) {
        supplyRepository.save(supply);

    }

    @Override
    public void update(String email, Supply supply) {
        Supply existing = supplyRepository.findByEmail(email);
        if (existing != null){
            existing.setName(supply.getName());
            existing.setEmail(supply.getEmail());
            existing.setPhone(supply.getPhone());
            existing.setProductCategory(supply.getProductCategory());
            supplyRepository.save(existing);
        }

    }

    @Override
    public void deleteSupply(String email) {
        supplyRepository.deleteById((supplyRepository.findByEmail(email).getId()));

    }
}
