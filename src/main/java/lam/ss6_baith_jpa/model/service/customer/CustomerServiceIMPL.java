package lam.ss6_baith_jpa.model.service.customer;

import lam.ss6_baith_jpa.model.dao.customer.ICustomerDao;
import lam.ss6_baith_jpa.model.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class CustomerServiceIMPL implements ICustomerService{
    @Autowired
    private ICustomerDao customerDao;

    @Override
    public List<Customer> findAll() {
        return customerDao.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerDao.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerDao.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerDao.remove(id);
    }

    @Override
    public boolean insertWithStoredProcedure(Customer customer) {
        return customerDao.insertWithStoredProcedure(customer);
    }
}
