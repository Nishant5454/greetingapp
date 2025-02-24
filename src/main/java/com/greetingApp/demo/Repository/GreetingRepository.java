// Repository Interface
package com.greetingApp.demo.Repository;

//import com.example.greeting.model.Greeting;
//import com.greetingApp.demo.model;
import com.greetingApp.demo.model.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GreetingRepository extends JpaRepository<Greeting,Long>{
}
