Sports Event Management System (SEMS)
Overview
The Sports Event Management System (SEMS) is designed to manage sports events efficiently. It handles tasks such as team registration, scheduling matches, and tracking results. This system is aimed at event organizers who want to automate the organization of sports events, track teams and players, and maintain accurate records.

Purpose
The purpose of SEMS is to streamline the management of sports events by offering tools for:

Managing event details

Registering teams and players

Scheduling matches

Recording match results

Analyzing player performance through statistics

Features
1. Event Management
   Create and manage sports events by providing event details like name, date, and location.

2. Team Registration
   Register teams for events and assign participants (players) to teams.

3. Match Scheduling
   Schedule matches between teams and manage match dates.

4. Results Management
   Track the results of each match and provide updates on winners and scores.

5. Player Statistics (New Feature)
   Track detailed statistics for each player, such as goals scored, assists, and penalties.

This feature allows event organizers to evaluate the performance of players based on their in-game statistics.

Architecture
The architecture of the SEMS is modular and designed to separate the different concerns of the system:

Event Management: Manages event details, such as event name, date, and participating teams.

Team Management: Handles the registration and management of teams, and assigns players to these teams.

Match Scheduling: Schedules matches between teams and manages match dates and times.

Results Management: Tracks match results and maintains a record of the outcomes.

Player Statistics: (New Feature) Tracks and records player-specific data such as goals scored, assists, and penalties.

Package Structure
The system is implemented in the t3 package. Here is the breakdown of the main files and their roles:



Event.java           // Class to manage event details

Team.java            // Class to manage teams and players

Participant.java     // Class to manage participants (players)

Match.java           // Class to manage match scheduling

Results.java         // Class to manage match results

PlayerStatistics.java // Class for tracking player statistics (new feature)

Main.java            // Entry point for running the system

New Feature: Player Statistics
Feature Overview:
A new feature has been added to track the performance of individual players during the event. The system can now record and analyze player statistics, including:

Goals scored

Assists

Penalties

This feature was introduced to enhance the depth of the system and provide a more detailed analysis of player performance. Event organizers can now track and evaluate how each player contributed to the team's success.
Code Implementation:
In the PlayerStatistics.java class, a new class was introduced to handle the tracking of statistics for individual players. Here’s a brief explanation of how the code works:
