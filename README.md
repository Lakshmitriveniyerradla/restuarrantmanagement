# 🍽️ Foodzilla - Restaurant Management System

##  Overview


Foodzilla is a full-stack restaurant management system designed to simplify restaurant operations and provide customers with a smooth online food ordering experience.

The system allows users to register, authenticate, browse menus, manage carts, place orders, make payments, and track their order history.

Built using **Spring Boot backend with Thymeleaf frontend**, the application follows a structured MVC architecture with database integration and secure authentication.
 
 # demo video

you can view my restaurant website by using this youtube link

https://youtu.be/XiEsgaJMH6Y
---

# ✨ Features


## 👤 User Management

- User registration
- Secure login authentication
- Profile management
- Role-based access control


## 🍕 Menu Management

- Create and manage food categories
- Browse menu items
- View food details and pricing
- Category-based food browsing


## 🛒 Cart Management

- Add food items to cart
- View cart items
- Manage selected items
- Proceed to checkout


## 📦 Order Management

- Place customer orders
- Store order details
- View order history
- Track order status
- Reorder previous items


## 💳 Payment Management

- Payment records
- Bill management
- Payment status tracking



---

# 🛠️ Technology Stack


## Backend

- Java 17
- Spring Boot
- Spring MVC
- Spring Data JPA
- Hibernate ORM
- Spring Security
- Maven


## Frontend

- HTML5
- CSS3
- JavaScript
- Bootstrap 5
- Thymeleaf


## Database

- Oracle Database XE



---

# 📂 Repository Structure


```text
restaurant-management-system/

├── pom.xml
├── README.md
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/restaurant/
│   │   │       │
│   │   │       ├── RestaurantApplication.java
│   │   │       │
│   │   │       ├── controller/
│   │   │       │   ├── CartController.java
│   │   │       │   ├── CategoryController.java
│   │   │       │   ├── CheckoutController.java
│   │   │       │   ├── MenuController.java
│   │   │       │   ├── OrderController.java
│   │   │       │   ├── PaymentController.java
│   │   │       │   └── UserController.java
│   │   │       │
│   │   │       ├── entity/
│   │   │       │   ├── User.java
│   │   │       │   ├── Role.java
│   │   │       │   ├── Category.java
│   │   │       │   ├── MenuItem.java
│   │   │       │   ├── CustomerOrder.java
│   │   │       │   ├── OrderItem.java
│   │   │       │   ├── Bill.java
│   │   │       │   └── Payment.java
│   │   │       │
│   │   │       ├── repository/
│   │   │       │   ├── UserRepository.java
│   │   │       │   ├── CategoryRepository.java
│   │   │       │   ├── MenuItemRepository.java
│   │   │       │   ├── OrderRepository.java
│   │   │       │   └── PaymentRepository.java
│   │   │       │
│   │   │       ├── service/
│   │   │       │   ├── CustomUserDetailsService.java
│   │   │       │   └── OrderService.java
│   │   │       │
│   │   │       └── security/
│   │   │           └── SecurityConfig.java
│   │   │
│   │   └── resources/
│   │       ├── templates/
│   │       │   ├── login.html
│   │       │   ├── signup.html
│   │       │   ├── userdashboard.html
│   │       │   ├── menu.html
│   │       │   ├── cart.html
│   │       │   ├── checkout.html
│   │       │   ├── payment.html
│   │       │   ├── orders.html
│   │       │   └── profile.html
│   │       │
│   │       ├── static/
│   │       │   ├── css/
│   │       │   ├── js/
│   │       │   └── images/
│   │       │
│   │       └── application.properties
│   │
│   └── test/
│
└── target/
```



---

# 🏗️ Application Modules


## Authentication Module

Handles:

- User registration
- Login authentication
- Password encryption
- Authorization using Spring Security



## Menu Module

Manages:

- Food categories
- Menu items
- Restaurant dishes



## Cart Module

Handles:

- Cart operations
- Selected food items
- Checkout process



## Order Module

Processes:

- Customer orders
- Order history
- Order status



## Payment Module

Manages:

- Billing information
- Payment records
- Payment status



## Profile Module

Displays:

- Logged-in user details
- Account information



---

# 🗄️ Database Entities


```
User

Category

MenuItem

CustomerOrder

OrderItem

Bill

Payment
Application:


```
http://localhost:8083
```



---

#  Security


Foodzilla uses Spring Security with:


- Custom UserDetailsService
- BCrypt password encryption
- Role-based authorization


Roles:


```
USER

ADMIN
```



---

# 🌐 API Endpoints


## Users

```
POST /users/register
```


## Menu

```
GET /api/menu

POST /api/menu
```


## Orders

```
GET /orders

POST /orders
```


## Payments

```
GET /payments

POST /payments
```



---

# 🚀 Future Enhancements


- Admin dashboard
- Online payment gateway
- Email notifications
- Food ratings and reviews
- Delivery tracking
- Cloud deployment



---

# demo video

you can view my restaurant website by using this youtube link

https://youtu.be/EWF3HonEnIs

---
screenshots
---



---

# 📖 About


Foodzilla is a restaurant management application developed to demonstrate full-stack development using Java Spring Boot technologies.

The project focuses on real-world concepts including authentication, database relationships, order processing, REST APIs, and responsive UI design.



---

# 👨‍💻 Developer


**Triveni Yerradla**
