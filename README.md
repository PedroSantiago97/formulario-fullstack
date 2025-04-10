# Simple Form project 💻

This project is a simple form was created with has a didatic purpose  

## Tecnologies🛠️  
  
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
![Postgres](https://img.shields.io/badge/postgres-%23316192.svg?style=for-the-badge&logo=postgresql&logoColor=white)
![HTML5](https://img.shields.io/badge/html5-%23E34F26.svg?style=for-the-badge&logo=html5&logoColor=white)
![CSS3](https://img.shields.io/badge/css3-%231572B6.svg?style=for-the-badge&logo=css3&logoColor=white)
![JavaScript](https://img.shields.io/badge/javascript-%23323330.svg?style=for-the-badge&logo=javascript&logoColor=%23F7DF1E)  

## 🚀 How to Run  
This project has two main components:  

1. Frontend (HTML/CSS) - Built with VS Code.  

2. Backend (Java/Spring Boot) - Built with Eclipse.  

### 🖥️ Frontend (VS Code)  
📋Prerequisites:  

- VS Code installed.  

- Recommended extension: Live Server (for real-time preview).    

👣Steps
1. Clone the repository:  git clone https://github.com/PedroSantiago97/formulario-fullstack.git
2. Open the frontend folder in VS Code
3. Run the project:  

  - Open index.html with Live Server (right-click → Open with Live Server or use the shortcut Alt + L + O).  

  - The app will launch at http://localhost:5500.  

### ⚙️ Backend (Eclipse)  
📋Prerequisites:  
   - Eclipse IDE (Enterprise Java version recommended).  

   - Java JDK 11+.  

   - Maven (for dependency management).  

   - PostgreSQL (or your preferred database).
  
👣Steps:  
  1. Import the project into Eclipse:  

     - Go to File → Import → Maven → Existing Maven Projects.

     - Select the project/backend folder.

  2. 💾⚙️Configure the database:  
  

  - Update src/main/resources/application.properties:  
  
    spring.application.name=projetoSimples  
    server.port = 8080  
    spring.datasource.url=jdbc:postgresql://localhost:5432/postgres  
    spring.datasource.username=postgres  
    spring.datasource.password=5060  
    spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect  
    spring.jpa.hibernate.ddl-auto=update  

3. 🚀 Run the application:

- Right-click the project → Run As → Spring Boot App.



- The backend will start at http://localhost:8080.

### 💾Create DataBase:  
📋Prerequisites:
  - Install Postgres SQL

👣Steps:  
   1.In postgres, create a database named "postgres"    
  
  2. Enter the command for create table:  
       
  - CREATE TABLE usuario (  
    id SERIAL PRIMARY KEY,  
    nome VARCHAR(200),  
    email VARCHAR(50) NOT NULL,  
    senha TEXT NOT NULL,  
    telefone VARCHAR(15) NOT NULL,)    
      
Now, test the code ✅


