package com.kubeforce.payrollazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PayrollAzureApplication {

    public static void main(String[] args) {
        SpringApplication.run(PayrollAzureApplication.class, args);
    }


    public EmployeeFunction employeeFunction() {
        return new EmployeeFunction();
    }

    @Bean
    public EmployeeConsumer employeeConsumer() {
        return new EmployeeConsumer();
    }

    @Bean
    public EmployeeSupplier empSupplier() {
        return new EmployeeSupplier();
    }



}
