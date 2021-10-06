package com.dailylesson.spring.data.jpa.repository;

import com.dailylesson.spring.data.jpa.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

    List<Customer> findByFirstNameContaining(String name);

    List<Customer>  findByLastNameNotNull();

    //JPQL
//    @Query("select c Customer c where c.email = ?1")
//    Customer getCustomerByEmailAddress(String email);

    @Modifying
    @Transactional
    @Query(
            value = "update tbl_customer set customer_first_name = ?1 where customer_email = ?2 ",
            nativeQuery = true
    )
    int updateCustomerNameByEmail(String firstName, String lastName);
}
