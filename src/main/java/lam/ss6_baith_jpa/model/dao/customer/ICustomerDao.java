package lam.ss6_baith_jpa.model.dao.customer;

import lam.ss6_baith_jpa.model.dao.IDao;
import lam.ss6_baith_jpa.model.entity.Customer;


public interface ICustomerDao extends IDao<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
