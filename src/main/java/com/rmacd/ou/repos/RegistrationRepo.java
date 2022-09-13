package com.rmacd.ou.repos;

import com.rmacd.ou.generated.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepo extends JpaRepository<Registration, String> {
}
