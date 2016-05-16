/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.vault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Sample Application using Spring Cloud Vault.
 *
 * @author Mark Paluch
 */
@SpringBootApplication
public class SpringBootVaultAppIdAuthenticationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootVaultAppIdAuthenticationApplication.class, args);
	}

	@Configuration
	static class Config {

		@Value("${mykey}")
		String mykey;

		@Bean
		CommandLineRunner commandLineRunner() {

			return new CommandLineRunner() {
				@Override
				public void run(String... strings) throws Exception {

					System.out.println("##########################");
					System.out.println(mykey);
					System.out.println("##########################");
				}
			};
		}
	}
}
