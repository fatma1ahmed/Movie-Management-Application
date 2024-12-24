Movie Management App
-------------------
Overview
This application allows the admin to manage movies fetched from the OMDB API, and the regular user can view and rate the movies. It is built using Angular 16+ for the frontend and Spring Boot for the backend.
Features:
•	Admin Dashboard:
o	Login functionality for admin users.
o	Fetch movie data from OMDB API and display in the admin dashboard.
o	Ability for the admin to add or remove movies from the database.
•	Regular User Dashboard:
o	Login functionality for regular users.
o	Ability to view the full list of movies.
o	View movie details.
o	Search and rate movies.
Technologies:
•	Frontend: Angular 16+
•	Backend: Spring Boot
•	Database: MySQL or any database of your choice
________________________________________
Project Structure:
================
Backend: Located in the movie-app folder (Spring Boot)
Frontend: Located in the Movie-Application-master folder (Angular)
________________________________________
Setup Instructions
================
Prerequisites
================
•	Java 8 or higher
•	Node.js (for Angular)
•	MySQL Database (or any other database)
•	Git
1. Clone the Repository
Clone the project from GitHub:
git clone https://github.com/your-username/movie-management-app.git
cd movie-management-app
3. Set Up the Backend (Spring Boot)
•	Navigate to the backend directory.
cd movie-app
•	Ensure the necessary properties are set for the database connection in application.properties (or application.yml).
Example configuration for MySQL:
spring.datasource.url=jdbc:mysql://localhost:3306/movie-app?createDatabaseIfNotExist=true
spring.datasource.username=root
spring.datasource.password=root
spring.jpa.hibernate.ddl-auto=update
•	Build and run the backend:
                        mvn clean install
                      mvn spring-boot:run
4. Set Up the Frontend (Angular)
•	Install dependencies:
                npm install -g @angular/cli    
•	Navigate to the frontend directory .
cd Movie-Application-master
•	Install dependencies:
                    npm install
•	Start the Angular app:
                       ng serve
The Angular application will now be running at http://localhost:4200.
________________________________________
Database Setup
Once the backend is set up, you'll need to insert the default user records into your database. Use the following SQL queries to add the admin and user accounts:
Admin Login Credentials:
o	Username: admin@gmail.com
o	Password: admin
•	User Login Credentials:
o	Username: user@gmail.com
o	Password: user
Notes
Ensure the backend server is running before starting the frontend application.
You may need to adjust your firewall or port configurations depending on your environment.
4. Access the Application
•	Admin Dashboard: Use the admin login credentials to access the admin dashboard, manage movies, and interact with the OMDB API.
•	User Dashboard: Use the user login credentials to access the regular user dashboard and view the movie list.
________________________________________
Conclusion
With these steps, you should now have the application running locally and be able to use both the admin and regular user dashboards. If you have any issues or questions, feel free to open an issue in the repository.
________________________________________


