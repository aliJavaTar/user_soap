package com.management.usermanagement.user.presentation;

import com.management.usermanagement.user.application.DefinedUserAccess;
import com.management.usermanagement.user.infrastructure.dto.request.UserRequest;
import com.management.usermanagement.user.infrastructure.dto.respons.UserResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.ws.BindingType;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@WebService(name = "UserController", targetNamespace = "http://tempuri.org/")
@BindingType(value = javax.xml.ws.soap.SOAPBinding.SOAP11HTTP_BINDING)
@RequiredArgsConstructor
@Component
public class UserController {
    private static final String HTTP_INFO_LIST = "http://tempuri.org/setVakhVisaInfoList";
    private static final String HTTP_ORG = "http://tempuri.org/";
    private final DefinedUserAccess userAccess;

    @WebMethod(operationName = "addUser", action = HTTP_INFO_LIST)
    @WebResult(targetNamespace = HTTP_ORG, name = "UserResponse")
    public UserResponse addUser(@WebParam(name = "UserRequest", targetNamespace = HTTP_ORG) UserRequest user) {
        return userAccess.save(user);
    }

}
