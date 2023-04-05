# Traffic-Light-Management-System
2nd Semester CSE Project
Team Members: 
->Sanjana-Team Leader
->Sahil Sharma
->Nikitha
->Maanasa

Objective: To create a traffic light management system using Java programming language. The system should be able to control the timing and switching of traffic lights at an intersection, simulating the real-life traffic control system. The system should include the following features:

->Multiple traffic lights at the intersection, each with its own color (red, yellow, or green) and time limit.
->A traffic controller that manages the timing and switching of the traffic lights.
->A predefined schedule for switching the traffic lights, based on the traffic flow.
->A timer that keeps track of how long each traffic light has been on and switches the lights according to the predefined schedule.
->A simulation of the traffic flow, where cars move in different directions based on the status of the traffic lights.

The objective of this project is to create a functional simulation of a traffic management system using Java, which can be used to study and optimize the traffic flow at an intersection.

Implementation:
The project can be implemented using object-oriented programming principles in Java. Here are the classes that can be defined:

TrafficLight: Represents a single traffic light, which has a color (red, yellow, or green) and a time limit for how long it should stay on.
Intersection: Represents an intersection with multiple traffic lights. It has multiple TrafficLight objects.
TrafficController: Controls the timing and switching of TrafficLight objects.
Car: Represents a single car that can move in different directions at the intersection.
Road: Represents a single road that leads to the intersection. It has multiple Car objects.
Here are the methods that can be implemented for each class:

TrafficLight:

setColor(String color): Sets the color of the traffic light.
checkTimeLimit(int currentTime): Checks if the traffic light has reached its time limit.
Intersection:

addTrafficLight(TrafficLight trafficLight): Adds a traffic light to the intersection.
getTrafficLights(): Returns a list of traffic lights at the intersection.
TrafficController:

start(): Starts the traffic controller and manages the timing and switching of the traffic lights.
switchColor(TrafficLight trafficLight): Switches the color of the traffic light based on the predefined schedule.
Car:

move(): Moves the car in a specific direction based on the status of the traffic lights.
Road:

addCar(Car car): Adds a car to the road.
getCars(): Returns a list of cars on the road.
Main:

Initializes the traffic light system, including creating traffic lights, roads, and cars, and starts the traffic controller.
Testing:

The traffic light management system can be tested by running the simulation and checking if the traffic flow is optimized based on the traffic light timings.
Conclusion:
Implementing this project will provide a functional simulation of a traffic management system that can be used to study and optimize the traffic flow at an intersection.
