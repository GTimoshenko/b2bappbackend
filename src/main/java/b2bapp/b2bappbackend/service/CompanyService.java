package b2bapp.b2bappbackend.service;

import b2bapp.b2bappbackend.entity.CompanyEntity;
import b2bapp.b2bappbackend.entity.UserEntity;

import java.util.List;
import java.util.Set;

public interface CompanyService {
    CompanyEntity createCompany(CompanyEntity company, Long userId);
    List<CompanyEntity> getAllCompanies();
    Set<UserEntity> getCompanyUsers(Long companyId);
    Set<UserEntity> addCompanyUser(Long userId, Long companyId);
    CompanyEntity updateCompany(CompanyEntity company, Long companyId);
    void deleteCompany(Long companyId);
}