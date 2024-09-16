# Hospital Referral System
A Springboot application, using microservices architecture, that enables the client, if authenticated and authorised, send and receive sensitive patient information over a network. 

# Features
* User registration, authentication and token validation woth JWT authentication.
* Password encryption using BCrypt.
* Role based authorisation with spring security.

# Technologies
* Java Springboot 3.3
* Spring security.
* Maven.
* JSON web tokens (JWT).
* BCrypt.

# Getting Started

 To get started with this project, you will need to have the following installed on your local machine:

   * JDK 17+
   * Maven 3+

To build and run the project, follow these steps:

   * Clone the repository: git clone https://github.com/EkeneU/HospitalReferralSystem.git
   * Navigate to the project directory: cd HospitalReferralSystem
   * Add database hospital_referral_db to mySQL workbench
   * Build the project: mvn clean install
   * Run the project: mvn spring-boot:run

-> The application will be available at http://localhost:7070.


# Available endpoints.


  // Regsiter a user
 * POST localhost:7070/hospitalsecurity/api/auth/register


  // Generate a token
 * localhost:7070/hospitalsecurity/api/auth/token


  // Validate a token
 * localhost:7070/hospitalsecurity/api/auth/validate


  // Refer a patient to another hospital
 * localhost:7070/referringhospital/api/hospital/refer_patient


  // Receive patient from a referring hospital
 * http://localhost:7070/destinationhospital/api/hospital_consults

# Coming soon
* Implementation using docker.
