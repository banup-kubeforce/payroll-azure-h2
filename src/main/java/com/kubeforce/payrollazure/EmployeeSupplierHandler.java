package com.kubeforce.payrollazure;

import com.microsoft.azure.functions.*;
import com.microsoft.azure.functions.annotation.AuthorizationLevel;
import com.microsoft.azure.functions.annotation.FunctionName;
import com.microsoft.azure.functions.annotation.HttpTrigger;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import java.util.List;
import java.util.Optional;

public class EmployeeSupplierHandler extends FunctionInvoker<Void, List> {
    @FunctionName("employeeSupplier")
    public HttpResponseMessage execute(
            @HttpTrigger(name = "request", methods = {HttpMethod.GET, HttpMethod.POST},authLevel = AuthorizationLevel.ANONYMOUS) HttpRequestMessage<Void> request, ExecutionContext context) {

        return request
                .createResponseBuilder(HttpStatus.OK)
              //  .body(EmployeeInfo.)
                .body(handleRequest(null, context))
                .header("Content-Type", "application/json")
                .build();

    }

}
