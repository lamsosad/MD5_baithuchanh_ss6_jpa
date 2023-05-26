package lam.ss6_baith_jpa.model.service.customer;

import lam.ss6_baith_jpa.model.entity.Customer;
import lam.ss6_baith_jpa.model.service.IService;

public interface ICustomerService extends IService<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
