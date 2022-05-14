package tech.getarrays.employeemanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;

@SpringBootApplication
public class EmployeemanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeemanagerApplication.class, args);
	}

	@Bean
	public CorsFilter corsFilter() {
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		corsConfiguration.setAllowCredentials(true);
		corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
		corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-Type",
				"Accept", "Authorization", "Origin, Accept", "X-Requested-With", "Access-Control-Request-Method",
				"Access-Control-Request-Headers"));
		corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-Type", "Accept", "Authorization",
				"Access-Control-Allow-Origin", "Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
		corsConfiguration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "DELETE", "OPTIONS"));
		UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}

	/*
	@Bean
	CommandLineRunner run(EmployeeService employeeService) {
		return args -> {
			employeeService.addEmployee(new Employee("Jack", "jack@gmail.com", "Manager", "021-0903729", null, null));
			employeeService.addEmployee(new Employee("Alex", "alex@gmail.com", "Developer", "022-982721", null, null));
			employeeService.addEmployee(new Employee("Helen", "helen@gmail.com", "Reception", "04-5638290", null, null));
			employeeService.addEmployee(new Employee("Michael", "michael@gmail.com", "Team Lead", "027-543737", null, null));
			employeeService.addEmployee(new Employee("Sean", "sean@gmail.com", "CEO", "021-0824568", null, null));
			employeeService.addEmployee(new Employee("Gynn", "gynn@gmail.com", "Senior Developer", "021-456822", null, null));
			employeeService.addEmployee(new Employee("Bob", "bob@gmail.com", "Test Manager", "021-783355", null, null));
			employeeService.addEmployee(new Employee("Sophia", "sophia@gmail.com", "Business Analyst", "04-893365", null, null));
			employeeService.addEmployee(new Employee("Jane", "jane@gmail.com", "Test Analyst", "021-1772983", null, null));
			employeeService.addEmployee(new Employee("Frank", "frank@gmail.com", "Account manager", "021-4582900", null, null));
		};
	}*/

}
