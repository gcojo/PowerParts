package itschool.PowerParts.service;

import itschool.PowerParts.entity.Customer;
import itschool.PowerParts.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void addCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    public void deleteCustomer(Integer id) {
        customerRepository.deleteById(id);
    }

    public List<Customer>getAllCustomers(){
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById(id).orElse(null);
    }
    public Customer findByName(String customerName) {
        return customerRepository.findByName(customerName);
    }


    // Add more business logic methods if needed
}
