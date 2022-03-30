package com.kubeforce.payrollazure;
import com.microsoft.azure.functions.ExecutionContext;
import com.microsoft.azure.functions.HttpMethod;
import com.microsoft.azure.functions.HttpRequestMessage;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;

import java.util.Map;
import java.util.Optional;

import org.springframework.cloud.function.adapter.azure.FunctionInvoker;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;

public class EmployeeConsumerInvoker extends FunctionInvoker<EmployeeConsumer,String >{

    @FunctionName("employee")
    public void employeeConsumer(){
           EmployeeConsumer ec = new EmployeeConsumer();
    }
}

