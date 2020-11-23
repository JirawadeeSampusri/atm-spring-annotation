package th.ac.ku.atm;

import java.util.Map;

public interface DataSource {
    Map<Integer,Customer> readCustomers();
}
