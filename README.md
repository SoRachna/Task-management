# Project Name: Task Management 
#### Member: Keo Munin & Kry Sorachna 

## I. Introduction
#### A. About the Project
       The project focuses on task management, offering users an improved solution for managing tasks with effective functions.
       With more visibility of the teamwork environment, the system allows users to work and communicate
       confidentially within the association.
#### B. About the functions
       This project will provide authentication to two different users, admin and normal users. 
##### 1. Register/ Log in
      The system will take username and password as the user information saved within the database. After registering or logging in the system will serve the user based on the following commands and functionalities. 
##### 2. Task management:
      The system's core value, Task management, is where all the implementation and communication are made. This function allows users to create tasks, assign tasks, and set necessary parameters as we will take the following data as required: 
      **Admin input: **
      - Project name
      - Add task 
      - Assigned task owner
      - Set/view deadline 
      - Set/view task status
      **Normal User input: **
      - Add/view task
      - View deadline
      - Update task status
## II. Directory Structure
      To maintain friendly access and organized code, this code structure was separated into two different folders, Task management and User. 
      In the Task Management folder, you will find the main file such as Program.java, and other necessary files of functions stored. 
      Whereas, inside the User folder, you will find all the functions that mainly focus on taking in and storing user information as txt.file. 
      Regarding the separation, however, all the classes remain related and all are part of the Program.java  file. 
#### -->Task management (https://github.com/SoRachna/Task-management/tree/d9f8bbe32b42e6e28c6d5ad0113dd8eff03d5ddd/TaskMangement)
##### 1. Implementation
###### a. Program.java
      Java class that contains the main () method to compile and execute the program. In this main file, the program will ask for user 
      input on three main options based on  their purpose to use the program as the entry point for the application. Regarding the three 
      options of login, register, and exit, functions such as .login() and .registerUser() were called for further implementation. 
##### 2. Classes
###### a. AdminFunction.java
      The main purpose of this class is to allow Admin to create projects and tasks. It has two functions: .handleAdminActions( ) and .printAdminReport( ). 
      
        i. .handleAdminActions(): A public class that implements project and task creation for admin. 
        ii. .printAdminReport( ): A private class that takes the initiative to generate all the existing projects and tasks after the admin ends the implementation of creating or adding them. 
###### b. RegularUserFunction.java
			xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
###### c. Project.java and Task.java
    These classes represent the core entities of the program.
#### --> User
##### 1. Superclass & Subclasses
###### a. User (Superclass)
	An abstract superclass class that has two objects, username and password. As we expect to use the username to display on most parts within the program, we set it to a public variable, and for the password, we set it to private because we want to have limited access to it. 
	In this application user is separated into two, admin and user.
 ![image](https://github.com/SoRachna/Task-management/assets/151009957/914facbd-6f96-47da-854c-5ef3ffeceda7)
 ###### b.Admin (Inheritance)
 	A subclass inheritance from the Superclass User. 
  ![image](https://github.com/SoRachna/Task-management/assets/151009957/741e54c7-bdbd-4827-b7ce-0400182a3066)
 ###### c. RegularUser (Inheritance)
 ![image](https://github.com/SoRachna/Task-management/assets/151009957/465f4f60-2c32-40f4-8ce2-735f3340a91d)
 ##### 2. Classes/Functions
 ###### a.Register.java
	i. .register(): main function to register process. In the register, two options ask the user whether they want to register as a normal user or admin. Based on the chosen option, the program will next call either one of these functions .registerAsAdmin() or .registerAsUser(). After registered, their information will be stored in the txt.file. 
 	ii. .registerAsAdmin(): A function for the user who wants to register as admin.
  	iii. .registerAsUser(): A function for the user that wants to register as the regular user. 
###### b. UserManager.java
	

