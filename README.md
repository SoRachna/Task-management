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
#### -->Task management 
##### 1. Implementation
###### a. Program.java
      Java class that contains the main () method to compile and execute the program. In this main file, the program will ask for user 
      input on three main options based on  their purpose to use the program as the entry point for the application. Regarding the three 
      options of login, register, and exit, functions such as .login() and .registerUser() were called for further implementation. 
      Necessary conditions such as if-else are used to clarify either the user login as Admin or Regularuser followed by 
      the implementation of two separated functions, .handleAdminActions( ) and .handleRegularUserActions( ) with their own command. 
##### 2. Classes/ Functions
###### a. AdminFunction.java
      The main purpose of this class is to allow Admin to create projects and tasks. It has two functions: .handleAdminActions( ) and .printAdminReport( ). 
      
        i. .handleAdminActions(): A public class that implements project and task creation for admin. 
        ii. .printAdminReport( ): A private class that takes the initiative to generate all the existing projects and tasks after the admin ends the implementation of creating or adding it. 
###### b. RegularUserFunction.java
			xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx
###### c. Project.java and Task.java
    These classes represent the core entities of the program.

