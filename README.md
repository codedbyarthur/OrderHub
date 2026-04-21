# Confectionery Ordering API
Backend application for managing confectionery orders, designed to support daily production and delivery organization. Built with Java, Spring Boot, and PostgreSQL, the system focuses on simplicity, reliability, and real-world usability.

---
## Overview
This system provides a structured way to manage customer orders in a confectionery environment. Instead of relying on informal communication channels, all orders are centralized, organized, and tracked through a dedicated application.
Customers submit orders through a web interface, including delivery date and order details. The system stores and organizes this information, allowing the business owner to manage workload and prioritize tasks efficiently.

---
## Core Features
* Order creation with delivery date
* Centralized order management
* Status tracking (PENDING, IN_PROGRESS, DONE, DELIVERED)
* Organization of orders by delivery date
* Identification of upcoming and delayed orders
* Integration with WhatsApp for real-time notifications
* 
---
## System Architecture
The application follows a layered architecture:
* Controller layer handles HTTP requests
* Service layer contains business logic
* Repository layer manages data persistence
* Model layer defines the domain entities

This structure ensures separation of concerns and maintainability.

---

## Order Lifecycle
Each order follows a defined lifecycle:
* **PENDING**: order created, not started
* **IN_PROGRESS**: currently being prepared
* **DONE**: ready for delivery
* **DELIVERED**: completed and delivered

This workflow allows clear tracking of production status.

---
## Organization Strategy
Orders are organized primarily by delivery date. This enables the system to provide a clear operational view, helping the business owner focus on:
* orders scheduled for the current day
* upcoming deliveries
* overdue orders

The goal is to reduce confusion and improve daily planning.

---

## WhatsApp Integration
The system integrates with the WhatsApp Business Platform to send notifications when new orders are created.
These notifications provide quick visibility but do not replace the system. All order management is performed within the application itself.

---
## Data Reliability
The database is the single source of truth for all orders. Notifications are auxiliary and do not affect data integrity. Even if message delivery fails, all information remains محفوظ and accessible within the system.

---
## Purpose
This project is designed to solve a real operational problem: organizing confectionery orders in a simple and reliable way. It prioritizes clarity, usability, and practical value over unnecessary complexity.
