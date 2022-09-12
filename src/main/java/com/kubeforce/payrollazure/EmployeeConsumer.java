package com.kubeforce.payrollazure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;
import java.util.function.Consumer;

import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

public class EmployeeConsumer implements Consumer<Map<String,String>> {
    public static final Logger LOGGER = LoggerFactory.getLogger(EmployeeConsumer.class);

    @Autowired
    private EmployeeRepository EmployeeRepository;


    @Override
    public void accept (Map<String, String> map)
    {
        LOGGER.info("Creating the employee", map);
        Employee employee = new Employee (map.get("name"), map.get(
                "employeeIdentifier"), map.get("email"), map.get("salary"));
        EmployeeRepository.save(employee);
    }

}
