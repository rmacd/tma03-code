package com.rmacd.ou.endpoints;

import com.rmacd.ou.controllers.RegistrationController;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;

@Service
public class RegistrationEndpoint {

    final RegistrationController registrationController;

    public RegistrationEndpoint(RegistrationController registrationController) {
        this.registrationController = registrationController;
    }

    @PutMapping("/api/registrations/{eventId}")
    public String doRegister(
            @RequestHeader String currentUser,
            @PathVariable String eventId) {
        // prototype only - we are not validating whether user or event is valid
        registrationController.createEventRegistration(currentUser, eventId);
        return "OK";
    }

}
